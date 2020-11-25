package org.aop.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Program: com
 * @ClassName: AdviceBeforeArithmeticCalculator
 * @Author: Young
 * @Date: 2020-11-21
 * @Time: 21:16
 * @Version: v1.0
 */
public class AdviceBeforeArithmeticCalculator implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("start:");
        System.out.println("\tclassName:" + o.getClass().getSimpleName());
        System.out.println("\tmethod:" + method.getName());
        System.out.print("\tparams:");
        for (int i = 0; i < objects.length; i++) {
            System.out.print(objects[i]);
            if (i != objects.length - 1)
                System.out.print(",");
        }
        System.out.println();
    }
}
