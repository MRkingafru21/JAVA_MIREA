package com.company;

import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball d1 = new Ball("volleyball", 300);
        Ball d2 = new Ball("basketball", 400);
        Ball d3 = new Ball("baseball");
        Ball d4 = new Ball();
        d3.setWeight(150);
        System.out.println(d1);
        d1.intoPounds();
        System.out.println(d2);
        d2.intoPounds();
        System.out.println(d3);
        d3.intoPounds();
        System.out.println(d4);
        d4.intoPounds();
    }
}
