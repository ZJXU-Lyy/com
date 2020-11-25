package org.model;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Program: com
 * @ClassName: Dog
 * @Author: Young
 * @Date: 2020-11-20
 * @Time: 15:15
 * @Version: v1.0
 */
public class Dog {
    private String names;
    private int age;
    private String sex;

    public Dog(String names, int age, String sex) {
        super();
        this.names = names;
        this.age = age;
        this.sex = sex;
    }

    public Dog() {

    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "names='" + names + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
