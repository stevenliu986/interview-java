package com.learning.basic.oop03;

/**
 * ClassName: XiaoYanzi
 * Package: com.learning.basic.oop03
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 8/3/2026
 */
public class XiaoYanzi extends Animal implements Flyable {
    @Override
    public void eat() {
        System.out.println(this.getName() + "在吃虫子。");
    }

    public XiaoYanzi() {
    }

    public XiaoYanzi(String name, int age) {
        super(name, age);
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + "在空中翱翔。");
    }
}
