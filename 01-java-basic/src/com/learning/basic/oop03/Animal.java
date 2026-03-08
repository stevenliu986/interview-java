package com.learning.basic.oop03;

/**
 * ClassName: Animal
 * Package: com.learning.basic.oop03
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 8/3/2026
 */
public abstract class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        System.out.println("动物的名字：" + this.getName() + "，动物的年龄： " + this.getAge());
    }

    public abstract void eat();
}
