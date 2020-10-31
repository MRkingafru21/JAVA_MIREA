package PRACTICE10.Task2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Chair chair;

        AbstractChairFactory chairFactory = new ChairFactory();
        System.out.println("Введи 1 для клиентского режима или люой другой символ для ПОЛНОЙ ПРОВЕРКИ");
        Scanner symbol = new Scanner(System.in);
        int z = symbol.nextInt();
        switch (z) {
            case 1:
                Client client = new Client(chairFactory);
                client.sit();
                break;
            default:
                System.out.println("Проверка магического стула\n");
                chair = chairFactory.createMagicalChair();
                chair.sit();
                System.out.println("----------------------------------------------------------------------------");

                System.out.println("Проверка функционального стула\n");
                chair = chairFactory.createFunctionChair();
                chair.sit();
                System.out.println("----------------------------------------------------------------------------");

                System.out.println("Проверка викторианского стула\n");
                chair = chairFactory.createVictorianChair();
                chair.sit();
                System.out.println("----------------------------------------------------------------------------");
        }

    }
}