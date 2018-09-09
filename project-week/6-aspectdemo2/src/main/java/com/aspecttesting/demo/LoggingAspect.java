package com.aspecttesting.demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

  @After("AllGetters()")
  public void LoggingAdvice() {
    System.out.println("IT WORKS!");
    MainController mainController = new MainController();
    mainController.getIndex();
  }

  @Before("execution(* com.aspecttesting.demo.MainController.getIndex())")

  @Pointcut("execution(* com.aspecttesting.demo.MainController.getIndex())")
  public void AllGetters() {
  }

  


}
