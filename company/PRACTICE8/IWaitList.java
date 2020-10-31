package PRACTICE8;

import java.util.Collection;

public interface //Шаблонный интерфейс, от которого имплементируется базовый
IWaitList<E> {

    void add(E element); //Добавляет элемент в очередь

    void remove(); //Удаляет элемент из очереди

    boolean contains(E element); //Проверяет, находится ли элемент в очереди

    boolean containsAll(Collection<E> c); //Проверяет, находится ли искомая очередь в другой очереди

    boolean isEmpty(); //@return true, если очередь пустая; false, если очередь не пустая

}
