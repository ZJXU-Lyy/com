package org.aop.interfaces.Impl;

import org.aop.interfaces.ArithmeticCalculator;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Program: com
 * @ClassName: ArithmeticCalculatorImpl
 * @Author: Young
 * @Date: 2020-11-21
 * @Time: 19:03
 * @Version: v1.0
 *
 */
public class ArithmeticCalculatorImpl implements ArithmeticCalculator {
    public int add(int a, int b) throws Throwable {
        if (a <= 0 || b <= 0)
            throw new Exception("param is Non positive number!");
        return a + b;
    }

    public int sub(int a, int b) throws Throwable {
        if (a <= 0 || b <= 0)
            throw new Exception("param is Non positive number!");
        return a - b;
    }

    public int mul(int a, int b) throws Throwable {
        if (a <= 0 || b <= 0)
            throw new Exception("param is Non positive number!");
        return a * b;
    }

    public int div(int a, int b) throws Throwable {
        if (a <= 0 || b <= 0)
            throw new Exception("param is Non positive number!");
        return a / b;
    }
}
