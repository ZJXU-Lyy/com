package org.test;

import org.interfaces.Person;
import org.model.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new FileSystemXmlApplicationContext("src/applicationContext.xml");
        /*HelloWorld hw=(HelloWorld)ac.getBean("HelloWorld");
        System.out.println(hw.getMessage());*/
        Person person = (Person) ac.getBean("man");
        person.eatFood();
    }
}
