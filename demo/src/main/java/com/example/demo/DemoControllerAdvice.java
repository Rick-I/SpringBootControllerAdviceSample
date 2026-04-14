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
public class DemoControllerAdvice{

  private static final Logger log = LoggerFactory.getLogger(DemoControllerAdvice.class);

  // エラー処理
  @ExceptionHandler(Exception.class)
    public String handleException(Exception e) {

        log.error("例外発生", e);

        return "サーバーエラーが発生しました！";
    }

}
