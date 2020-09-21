package com.company;

class MwCircle implements Mw {
    private int radius;
    private MwPoint center;

    public MwCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MwPoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    @Override
    public String toString() {
        return "x, y: " +
                this.center.x + " " +
                this.center.y + "\nxSpeed, ySpeed: " +
                this.center.xSpeed + ", " +
                this.center.ySpeed + "\nradius: " +
                this.radius;
    }
    @Override
    public void moveUp() {
        this.center.y += this.center.ySpeed;
    }
    @Override
    public void moveDown() {
        this.center.y -= this.center.ySpeed;
    }
    @Override
    public void moveRight() {
        this.center.x += this.center.xSpeed;
    }
    @Override
    public void moveLeft() {
        this.center.x -= this.center.xSpeed;
    }
}