package PRACTICE8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedDeque;

//Базоый класс, от которго наследуются BoundedWaitList и UnfairWaitList
public abstract class WaitList<E> implements IWaitList<E> {

    protected ConcurrentLinkedDeque<E> content;
    //Конструктор
    public WaitList() {
        content = new ConcurrentLinkedDeque<>();
    }

    public WaitList(Collection<E> c) {
        content = (ConcurrentLinkedDeque<E>) c;
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }

    @Override
    public void add(E element) {
        content.add(element);
    }

    @Override
    public void remove() {
        content.removeFirst();
    }

    @Override
    public boolean contains(E element) {
        for (E e : this.content) {
            if (e.equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return content.size() == 0;
    }
}
