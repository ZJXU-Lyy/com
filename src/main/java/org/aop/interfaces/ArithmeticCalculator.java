package org.aop.interfaces;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Program: com
 * @ClassName: ArithmeticCalculator
 * @Author: Young
 * @Date: 2020-11-21
 * @Time: 19:01
 * @Version: v1.0
 */
public interface ArithmeticCalculator {
    int add(int a, int b) throws Throwable;

    int sub(int a, int b) throws Throwable;

    int mul(int a, int b) throws Throwable;

    int div(int a, int b) throws Throwable;
}
