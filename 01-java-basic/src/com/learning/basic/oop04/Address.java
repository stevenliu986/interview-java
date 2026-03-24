package com.learning.basic.oop04;

/**
 * ClassName: Address
 * Package: com.learning.basic.oop04
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 24/3/2026
 */
public class Address {

    private String city;
    private String street;

    public Address() {
    }

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" + "city='" + city + '\'' + ", street='" + street + '\'' + '}';
    }
}
