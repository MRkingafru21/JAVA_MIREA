package PRACTICE10.Task1;

public class Complex {
    public int real;
    public int image;
    public Complex(){
        this.real = 1;
        this.image = -1;
    }

    public Complex(int real, int image){
        this.real = real;
        this.image = image;
    }

    @Override
    public String toString() {
        return "Complex: " +
                "real = " + real +
                ", image = " + image;
    }
}
