package PRACTICEE10.Task1;

public class Test {
    public static void main(String[] args) {
        Complex complex_1;
        Complex complex_2;

        ComplexAbstractFactory concreteFactory_1 = new ConcreteFactory();
        ComplexAbstractFactory concreteFactory_2 = new ConcreteFactory();

        complex_1 = concreteFactory_1.createComplex();
        complex_2 = concreteFactory_2.createComplex(6, -6);

        System.out.println(complex_1.toString());
        System.out.println(complex_2.toString());
    }
}