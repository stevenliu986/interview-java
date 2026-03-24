package com.learning.basic.oop04;

/**
 * ClassName: Test
 * Package: com.learning.basic.oop04
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 24/3/2026
 */
public class Test {
    static void main() {
        Address address = new Address("NSW", "Market");
        User u1 = new User("John", address);

        Address address1 = new Address("NSW", "Sydney");
        User u2 = new User("Tom", address1);

        System.out.println(u1.equals(u2));
    }
}
