package com.company;

import java.lang.*;
public class Ball {
    private String game;
    private double weight;

    public Ball(String n, double a) {
        game = n;
        weight = a;
    }
    public Ball(String n) {
        game = n;
        weight = 0;
    }
    public Ball() {
        game = "multipurpose";
        weight = 450;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setGame(String game) {
        this.game = game;
    }
    public String getGame(String game) {
        return game;
    }
    public double getWeight() {
        return weight;
    }
    @Override
    public String toString() {
        return this.game+"'s ball weight in gram - "+this.weight;
    }
    public void intoPounds() {
        System.out.println(game+"'s ball weight in pounds is "+weight/454+" ");
    }
}
