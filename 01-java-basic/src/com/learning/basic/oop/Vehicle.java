package com.learning.basic.oop;

/**
 * ClassName: Vehicle
 * Package: com.learning.basic.oop
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 28/2/2026
 */
public class Vehicle {
    String brand;
    String color;
    int price;

    int getPrice() {
        return price;
    }

    String getColor() {
        return color;
    }

    String getBrand() {
        return brand;
    }

    void setPrice(int price) {
        if (price < 0) {
            System.out.println("Price cannot be negative");
        } else if (price > 100) {
            System.out.println("Price cannot be greater than 100");
        }
        this.price = price;
    }
}
