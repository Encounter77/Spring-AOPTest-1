package com.ex;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class EatingProcess {
    @Pointcut("execution(* com.ex.Food.process(..))")
    public void pointCut(){

    }

//    @Before("pointCut()")
//    public void takeBowls(){
//        System.out.println("我要开动了");
//    }
//
//    @AfterReturning("pointCut()")
//    public void putChopsticks(){
//        System.out.println("我吃饱了");
//    }
//
//    @AfterThrowing("pointCut()")
//    public void chopsticksDown(){
//        System.out.println("筷子掉了,洗筷子去");
//    }

    @Around("pointCut()")
    public void Eating(ProceedingJoinPoint joinPoint){
        int situation = (int) (Math.random()*10);
        System.out.println("Start...");
        System.out.println("我要开动了");
        try {
            joinPoint.proceed();
            if (situation >= 5){
                System.out.println("我吃饱了");
            }else {
                throw new Exception();
            }
        } catch (Throwable throwable) {
            System.out.println("筷子掉了,洗筷子完成后继续吃饭");
        }finally {
            System.out.print("End...");
        }
    }
}
