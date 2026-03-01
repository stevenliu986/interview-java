package com.learning.basic.oop02;

/**
 * ClassName: OopTest02
 * Package: com.learning.basic.oop02
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 1/3/2026
 */
public class OopTest02 {
    static void main(String[] args) {
        Animal a1 = new Bird();
        a1.move();

        // 如果a1想要调用Bird中独有的方法，则必须向下转型
        if (a1 instanceof Bird) {
            Bird b1 = (Bird) a1;
            b1.layEggs();
        }
    }
}
