package PRACTICEE10.Task2;

import java.util.Scanner;

public class Client implements Chair {

    public Chair chair;
    public static AbstractChairFactory chairFactory;

    public Client(AbstractChairFactory chairFactory) {

        this.chairFactory = chairFactory;
    }

    public void sit(){
        System.out.println("Тебе нужнео выбрать стул\n");
        setChair(this);
    }

    public static void setChair(Chair chair) {
        System.out.println("Чтобы выбрать магический стул нажми - 1");
        System.out.println("Чтобы выбрать функциональный стул нажмите - 2");
        System.out.println("Чтобы выбрать викторианский стул нажмите - 3");
        Scanner symbol = new Scanner(System.in);
        int a = symbol.nextInt();
        switch (a){
            case 1:
                chair = chairFactory.createMagicalChair();
                chair.sit();
                break;
            case 2:
                chair = chairFactory.createFunctionChair();
                chair.sit();
                break;
            case 3:
                chair = chairFactory.createVictorianChair();
                chair.sit();
                break;
            default:
                System.out.println("Введено неверное число");
                break;
        }
    }
}
