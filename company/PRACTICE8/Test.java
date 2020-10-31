package PRACTICE8;

import java.util.Scanner;

//Класс для тестирования работоспособности BoundedWaitList и UnfairWaitList
public class Test {
    public static void main(String[] args) {
        Scanner symbol = new Scanner(System.in);

        // Проверка работоспособности класса BoundedWaitList
        System.out.println("Тест работоспособности ограниченного списка ожидания\n");
        System.out.println("Введите вместимость очереди");

        int capacity = symbol.nextInt();
        BoundedWaitList<String> boundedWaitList = new BoundedWaitList<>(capacity);
        System.out.println("--------------------------------------");

        // Добавление элементов в очередь
        System.out.println("Добавление элементов в очередь");
        System.out.println("Введите элементы очереди");

        for (int i = 0; i < capacity; i++) {
            boundedWaitList.add(symbol.next());
        }
        System.out.println(boundedWaitList);
        System.out.println("--------------------------------------");

        // Удаление первого элемента очереди
        System.out.println("Удаление первого элемента очереди\n");

        boundedWaitList.remove();
        System.out.println(boundedWaitList);
        System.out.println("--------------------------------------");

        // Проверка наличия элемента в очереди
        System.out.println("Тест наличия элемента в очереди\n");
        System.out.println("Введите искомое слово: ");
        String key = symbol.next();

        if (boundedWaitList.contains(key)) {
            System.out.println("\nЭлемент найден");
        }
        else {
            System.out.println("\nЭлемент не найден");
        }
        System.out.println("--------------------------------------");

        // Проверка наличия очереди внутри другой очереди
        System.out.println("Тест наличия очереди элементов внутри другой очереди элементов\n");
        System.out.println("Введите количество элементов внутри искомой очереди");

        capacity = symbol.nextInt();
        BoundedWaitList<String> searchList = new BoundedWaitList<>(capacity);
        System.out.println("\nВведите элементы искомой очереди");
        for (int i = 0; i < capacity; i++) {
            searchList.add(symbol.next());
        }
        if (boundedWaitList.containsAll(searchList.content)) {
            System.out.println("Очередь найдена");
        }
        else {
            System.out.println("Очередь не найдена");
        }
        System.out.println("--------------------------------------");

        // Проверка очереди на пустоту
        System.out.println("Проверка очереди на пустоту");

        if (boundedWaitList.isEmpty()) {
            System.out.println("\nОчередь пустая");
        }
        else {
            System.out.println("\nОчередь не пустая");
        }
        System.out.println("--------------------------------------");

        // Проверка работоспособности класса UnfairWaitList
        System.out.println("\nТест работоспособности неограниченной очереди");
        UnfairWaitList<String> unfairWaitList = new UnfairWaitList<>();

        // Добавление элементов в очередь
        System.out.println("Добавление элементов в очередь");
        System.out.println("Сколько элементов необходимо добавить?");
        capacity = symbol.nextInt();
        System.out.println("Введите элементы очереди");
        for (int i = 0; i < capacity; i++) {
            unfairWaitList.add(symbol.next());
        }
        System.out.println(unfairWaitList);
        System.out.println("--------------------------------------");

        // Удаление заданного элемента из очереди
        System.out.println("Удаление элемента из очереди\n");
        System.out.println("Введите название элемента, который необходимо удалить");

        key = symbol.next();
        unfairWaitList.remove(key);
        System.out.println(unfairWaitList);
        System.out.println("\n--------------------------------------");

        // Перенос элемента в конец очереди
        System.out.println("Перенос элемента в конец очереди\n");
        System.out.println("Какой элемент необходимо перенести в конец очереди?");

        key = symbol.next();
        unfairWaitList.moveToBack(key);
        System.out.println(unfairWaitList);
    }
}