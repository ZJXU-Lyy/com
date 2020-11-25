package org.aop.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Program: com
 * @ClassName: AdviceAfterArithmetic
 * @Author: Young
 * @Date: 2020-11-21
 * @Time: 21:29
 * @Version: v1.0
 */
public class AdviceAfterArithmetic implements AfterReturningAdvice {
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("end");
        System.out.println("\tresult:" + o);
    }
}
