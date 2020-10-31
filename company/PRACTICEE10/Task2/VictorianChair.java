package PRACTICEE10.Task2;

public class VictorianChair implements Chair {

    private static int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    public static int getAge() {
        return age;
    }

    @Override
    public void sit() {
        System.out.println("Этому стулу: " + getAge() + " года !");
    }

}
