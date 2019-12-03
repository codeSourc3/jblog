package com.kingschan.blog.common.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Aspect;
//import org.springframework.stereotype.Component;

/**
 * 
 *     
 * @author 陈国祥 (kingschan)
 * @version 12.2.2019
 * 
 */
// @Component ("ErrorLogAdvice")
// @Aspect
public  class  ErrorLogAdvice {
    
   
//     @Before ("execution (* com.kingschan.blog .. *. * (..))")  
    public  void  before () {  
        System . Out . Println ( " @before " );  
    }
    /**
     * After the target method is completed normally, it will be called
     * Return value of @param args directory method
     */
//     @AfterReturning (returning = "args", pointcut = "execution (* com.kingschan.blog .. *. * (..))")  
    public  void  AfterReturning ( Object  args ) {  
        System . Out . Println ( " @AfterReturning Get directory method return value: " + args);
        System . Out . Println ( " " );
    }  
      
//     @AfterThrowing (throwing = "ex", pointcut = "execution (* com.kingschan.blog .. *. * (..))"))  
    public  void  AfterThrowing ( JoinPoint  joinPoint , Throwable  ex ) {  
    	
        System . Out . Println ( " The exception thrown by the target method @AfterThrowing: " + ex);  
    }  
    /**
     * Difference from @AfterReturning
     * It will be called regardless of whether the method ends normally
     */
//     @After ("execution (* com.kingschan.blog .. *. * (..))")
    public  void  after () {
        System . Out . Println ( " @after " );
    }
    /**
     * Can decide when the method is executed, and even prevent the target method from executing completely
     * @return object for switching back to the original control flow.
     * @throws Throwable
     */
//     @Around ("execution (* com.kingschan.blog .. *. * (..))")
    public  Object  around ( ProceedingJoinPoint  jp ) throws  Throwable {
        System . OUT . Println ( String . Format ( " @Around: Parameters:% s | S target% | getThis:% S " , jp . GetArgs () . ToString (), jp . GetTarget () . GetClass () . GetName (), JP . getThis ()));
        Object o = jp . Proceed ();
        // jp.proceed (xxx); can also change parameters
        return o;
    }
}
