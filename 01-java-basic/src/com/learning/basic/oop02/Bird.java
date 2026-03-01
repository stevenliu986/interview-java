package com.learning.basic.oop02;

/**
 * ClassName: Bird
 * Package: com.learning.basic.oop02
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 1/3/2026
 */
public class Bird extends Animal {
    @Override
    public void move() {
        System.out.println("小鸟在飞翔。");
    }

    public void layEggs() {
        System.out.println("鸟下蛋。");
    }

}
