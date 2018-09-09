package com.aspecttesting.demo;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

  @Before("AllGetters()")
  public void LoggingAdviceWithJP(JoinPoint joinPoint) {
    System.out.println(joinPoint.toString());
  }

  @After("AllGetters()")
  public void LoggingAdvice() {
    System.out.println("IT WORKS!");
    MainController mainController = new MainController();
    mainController.getIndex();
  }

  @After("execution(* return*()) && args(name)")
  public void LoggingAdviceParam(String name) {
    System.out.println(name + " saved.");
  }

  @AfterReturning(pointcut = "execution(* return*())", returning = "returnString")
  public void LoggingAdviceReturn(String returnString) {
    System.out.println(returnString + " is returned");
  }

  @Pointcut("execution(* com.aspecttesting.demo.MainController.getIndex())")
  public void AllGetters() {
  }
}
