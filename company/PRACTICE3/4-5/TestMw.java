package com.company;

public class TestMw {
    public static void main(String[] args) {
        MwCircle point = new MwCircle(3, 13, 2, 4, 7);

        System.out.println(point);
        System.out.println();
        point.moveDown();
        System.out.println(point);
        System.out.println();

        MwRectangle rectangle = new MwRectangle(4, 9, 6, 3, 9, 8);

        System.out.println(point);
        System.out.println();
        point.moveDown();
        System.out.println(point);
    }
}
