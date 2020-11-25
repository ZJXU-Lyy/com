package org.aop.advice;

import org.springframework.aop.ThrowsAdvice;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Program: com
 * @ClassName: AdviceExceptionArithmetic
 * @Author: Young
 * @Date: 2020-11-21
 * @Time: 22:39
 * @Version: v1.0
 */
public class AdviceExceptionArithmetic implements ThrowsAdvice {
    public void afterThrowing(Throwable throwable) {
        System.out.println("抛出异常：");
    }
}
