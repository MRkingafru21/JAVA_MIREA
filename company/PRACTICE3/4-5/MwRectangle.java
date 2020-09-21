package com.company;

class MwRectangle implements Mw {
    private MwPoint topLeft;
    private MwPoint bottomRight;

    public MwRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MwPoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MwPoint(x2, y2, xSpeed, ySpeed);
    }
    public boolean checkSpeed(){
        if ((this.topLeft.xSpeed == this.bottomRight.xSpeed) &&
                (this.topLeft.ySpeed == this.bottomRight.ySpeed)) {
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public void moveUp() {
        if (this.checkSpeed()==true) {
            this.topLeft.y += this.topLeft.ySpeed;
            this.bottomRight.y += this.bottomRight.ySpeed;
        }
    }
    @Override
    public void moveDown() {
        if (this.checkSpeed()==true) {
            this.topLeft.y -= this.topLeft.ySpeed;
            this.bottomRight.y -= this.bottomRight.ySpeed;
        }
    }
    @Override
    public void moveRight() {
        if (this.checkSpeed()==true) {
            this.topLeft.x += this.topLeft.xSpeed;
            this.bottomRight.x += this.bottomRight.xSpeed;
        }
    }
    @Override
    public void moveLeft() {
        if (this.checkSpeed()==true) {
            this.topLeft.x -= this.topLeft.xSpeed;
            this.bottomRight.x -= this.bottomRight.xSpeed;
        }
    }
}
