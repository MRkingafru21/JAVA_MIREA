package com.company;

import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book d1 = new Book("comic", 80);
        Book d2 = new Book("novel", 1500);
        Book d3 = new Book("magazine");
        Book d4 = new Book();
        d3.setPages(50);
        System.out.println(d1);
        d1.intoSheets();
        System.out.println(d2);
        d2.intoSheets();
        System.out.println(d3);
        d3.intoSheets();
        System.out.println(d4);
        d4.intoSheets();
    }
}