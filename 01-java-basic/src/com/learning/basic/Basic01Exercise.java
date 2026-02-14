package com.learning.basic;

/**
 * ClassName: Basic01Exercise
 * Package: com.learning.basic
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 14/2/2026
 */
public class Basic01Exercise {

    // 打印一个菱形
    static void main() {
        for (int i = 1; i <= 4; i++) {
            System.out.println(" ".repeat(4 - i) + "*".repeat(2 * i - 1));
        }
        for (int i = 3; i >= 1; i--) {
            System.out.println(" ".repeat(4 - i) + "*".repeat(2 * i - 1));
        }
    }
}
