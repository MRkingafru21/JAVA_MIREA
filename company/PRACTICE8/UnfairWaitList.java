package PRACTICE8;

import java.util.concurrent.ConcurrentLinkedDeque;

//Шаблонный класс UnfairWaitList, реализующий список ожидания без ограничения по вместимости
public class UnfairWaitList<E> extends WaitList<E> {

    //Конструктор
    public UnfairWaitList() {
        content = new ConcurrentLinkedDeque<>();
    }

    //Удаляет элемент, переданный в качестве параметра, из очереди
    public void remove(E element) {
        content.remove(element);
    }

    //Перемещает элемент в конец очереди
    public void moveToBack(E element) {
        content.remove(element);
        content.addLast(element);
    }

}