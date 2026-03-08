package com.learning.basic.oop03;

/**
 * ClassName: YingWu
 * Package: com.learning.basic.oop03
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 8/3/2026
 */
public class YingWu extends Animal implements Flyable, Speakable {
    @Override
    public void eat() {
        System.out.println(this.getName() + "在吃虫子。");
    }

    public YingWu() {
    }

    public YingWu(String name, int age) {
        super(name, age);
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + "在空中翱翔。");
    }

    @Override
    public void speak() {
        System.out.println(this.getName() + "在说您好。");
    }
}
