package org.test;

import org.aop.interfaces.ArithmeticCalculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import young.utils.IoTools;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Program: com
 * @ClassName: SpringDemoTest
 * @Author: Young
 * @Date: 2020-11-20
 * @Time: 15:24
 * @Version: v1.0
 */
public class SpringDemoTest {
    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/applicationContext.xml");
//        IHello hello = (IHello) applicationContext.getBean("proxy");
//        hello.sayHello1();
//        hello.sayHello2();
//        hello.sayHello3();
        ArithmeticCalculator arithmeticCalculator = (ArithmeticCalculator) applicationContext.getBean("arithmeticProxy");
        try {
            arithmeticCalculator.add(2, 4);
            arithmeticCalculator.div(7, 3);
            arithmeticCalculator.mul(-2, 1);
            arithmeticCalculator.sub(1, -4);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }
}
