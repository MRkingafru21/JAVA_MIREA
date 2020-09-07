package com.company;

import java.lang.*;
public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Snoopy", 3);
        Dog d2 = new Dog("Titanium", 4);
        Dog d3 = new Dog("Cookie");
        Dog d4 = new Dog();
        d3.setAge(1);
        d4.setAge(10);
        System.out.println(d1);
        d1.intoHumanAge();
        System.out.println(d2);
        d2.intoHumanAge();
        System.out.println(d3);
        d3.intoHumanAge();
        System.out.println(d4);
        d4.intoHumanAge();
    }
}
