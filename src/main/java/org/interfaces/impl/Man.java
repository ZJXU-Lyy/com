package org.interfaces.impl;

import org.interfaces.Food;
import org.interfaces.Person;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Program: com
 * @ClassName: Man
 * @Author: Young
 * @Date: 2020-11-19
 * @Time: 23:27
 * @Version: v1.0
 */
public class Man implements Person {
    private Food food;

    public void setFood(Food food) {
        this.food = food;
    }

    public void eatFood() {
        System.out.println(food.eat());
    }
}
