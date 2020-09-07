package com.company;

import java.lang.*;
public class Book {
    private String type;
    private int pages;

    public Book(String n, int a) {
        type = n;
        pages = a;
    }
    public Book(String n) {
        type = n;
        pages = 0;
    }
    public Book() {
        type = "encyclopedia";
        pages = 800;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getType(String type) {
        return type;
    }
    public double getPages() {
        return pages;
    }
    @Override
    public String toString() {
        return this.type+" consists of "+this.pages+" pages";
    }
    public void intoSheets() {
        System.out.println(type+" consists of "+pages/2+" sheets");
    }
}
