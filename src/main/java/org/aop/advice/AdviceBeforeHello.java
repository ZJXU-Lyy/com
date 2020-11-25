package org.aop.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Program: com
 * @ClassName: AdviceBeforeHello
 * @Author: Young
 * @Date: 2020-11-21
 * @Time: 16:37
 * @Version: v1.0
 */
public class AdviceBeforeHello implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("验证用户");
    }
}
