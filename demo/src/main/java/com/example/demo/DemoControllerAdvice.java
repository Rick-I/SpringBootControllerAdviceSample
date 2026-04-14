package com.example.demo;

import java.lang.reflect.Type;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.RequestBodyAdviceAdapter;

@ControllerAdvice
public class DemoControllerAdvice extends RequestBodyAdviceAdapter{

  private static final Logger log = LoggerFactory.getLogger(DemoControllerAdvice.class);

  // エラー処理
  @ExceptionHandler(Exception.class)
    public String handleException(Exception e) {

        log.error("例外発生", e);

        return "サーバーエラーが発生しました！";
    }

  // returnの内容によって実行の可否や実行対象のAPIを設定する
  @Override
  public boolean supports(MethodParameter methodParameter, Type targetType,
      Class<? extends HttpMessageConverter<?>> converterType) {
    return false;
  }

  @Override
  /*
  *リクエストボディが@RequestBodyがついたオブジェクトにバインドされた後に実行
  */
  public Object afterBodyRead(Object body, HttpInputMessage inputMessage, MethodParameter parameter, Type targetType,
    Class<? extends HttpMessageConverter<?>> converterType) {
    
    // リクエストDTOの処理日時に現在時刻を設定
    if(body instanceof DemoDto request) {
      Date currentDate = new Date();
      request.setProcessedAt(currentDate);
    }

    return body;
  }
}
