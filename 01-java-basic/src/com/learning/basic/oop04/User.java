package com.learning.basic.oop04;

/**
 * ClassName: User
 * Package: com.learning.basic.oop04
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 24/3/2026
 */
public class User {
    private String name;
    private Address address;

    public User() {
    }

    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
