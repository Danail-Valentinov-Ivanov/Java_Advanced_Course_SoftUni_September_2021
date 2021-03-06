package lab7_Generics.prob1_Jar_of_T;

import java.util.ArrayDeque;
import java.util.Deque;

public class Jar<T> {
    private Deque<T> elements;

    public Jar() {
        this.elements = new ArrayDeque<>();
    }

    public void add(T element) {
        elements.push(element);
    }

    public T remove() {
        return elements.pop();
    }
}
