package com.learning.basic;

/**
 * ClassName: ${NAME}
 * Package: ${PACKAGE_NAME}
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 2025-08-03
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public boolean makes10(int a, int b) {
        return a == 10 || b == 10 || (a + b == 10);
    }
}