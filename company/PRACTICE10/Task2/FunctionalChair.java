package PRACTICE10.Task2;

import java.util.Scanner;

public class FunctionalChair implements Chair {

    public static int sum(int a, int b) {
        return a+b;
    }

    @Override
    public void sit() {
        System.out.println("Время посидеть на функциональном стуле");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Стул просит ввести 2 числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Стул преподносит ответ: " + sum(a, b));
    }

}
