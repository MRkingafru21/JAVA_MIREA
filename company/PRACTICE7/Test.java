package PRACTICE7;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner symbol = new Scanner(System.in);

        System.out.println("Игра в «пьяницу» - тест 4 версий\n");
        System.out.println("--------------------------------------\n");


        System.out.println("Версия 1 - структура данных Stack");
        Stack<Integer> playerOneStk = new Stack<>();
        System.out.println("Введите набор карт для перовго игрока");
        for (int k = 0; k < 5; k++) {
            playerOneStk.push(symbol.nextInt());
        }

        Stack<Integer> playerSecondStk = new Stack<>();
        System.out.println("Введите набор карт для второго игрока");
        for (int k = 0; k < 5; k++) {
            playerSecondStk.push(symbol.nextInt());
        }

        System.out.println("Результат: winner is " + Stackk.act(playerOneStk, playerSecondStk) + "\n");
        System.out.println("--------------------------------------\n");


        System.out.println("Версия 2 - структура данных Queue");
        Queue<Integer> playerOneQue = new LinkedList<>();
        System.out.println("Введите набор карт для перовго игрока");
        for (int k = 0; k < 5; k++) {
            playerOneQue.add(symbol.nextInt());
        }

        Queue<Integer> playerSecondQue = new LinkedList<>();
        System.out.println("Введите набор карт для второго игрока");
        for (int k = 0; k < 5; k++) {
            playerSecondQue.add(symbol.nextInt());
        }

        System.out.println("Результат: winner is " + Queuee.act(playerOneQue, playerSecondQue) + "\n");
        System.out.println("--------------------------------------\n");


        System.out.println("Версия 3 - структура данных Dequeue");
        Deque<Integer> playerOneDeq = new LinkedList<>();
        System.out.println("Введите набор карт для перовго игрока");
        for (int k = 0; k < 5; k++) {
            playerOneDeq.add(symbol.nextInt());
        }

        Deque<Integer> playerSecondDeq = new LinkedList<>();
        System.out.println("Введите набор карт для второго игрока");
        for (int k = 0; k < 5; k++) {
            playerSecondDeq.add(symbol.nextInt());
        }

        System.out.println("Результат: winner is " + Dequeue.act(playerOneDeq, playerSecondDeq) + "\n");
        System.out.println("--------------------------------------\n");


        System.out.println("Версия 4 - структура данных DoubleList");
        LinkedList<Integer> playerOneDl = new LinkedList<>();
        System.out.println("Введите набор карт для перовго игрока");
        for (int k = 0; k < 5; k++) {
            playerOneDl.add(symbol.nextInt());
        }

        LinkedList<Integer> playerSecondDl = new LinkedList<>();
        System.out.println("Введите набор карт для второго игрока");
        for (int k = 0; k < 5; k++) {
            playerSecondDl.add(symbol.nextInt());
        }

        System.out.println("Результат: winner is " + DoubleList.act(playerOneDl, playerSecondDl) + "\n");
        System.out.println("Тест завершен\n");
    }
}