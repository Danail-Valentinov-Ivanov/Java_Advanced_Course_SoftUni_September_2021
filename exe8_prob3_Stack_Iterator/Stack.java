package exe8_prob3_Stack_Iterator;

import java.util.Iterator;

public class Stack<Integer> implements Iterable<Integer> {
    private Node<Integer> top;

    public Stack() {
        this.top = null;
    }

    public void push(int newElement) {
        Node<Integer> newNode = new Node<>(newElement);
        newNode.prev = top;
        top = newNode;
    }

    public int pop() throws Exception {
        if (this.top == null) {
            throw new Exception("No elements");
        } else {
            Node<Integer> currentNode = top;
            top = top.prev;
            return currentNode.element;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private Node<Integer> current = top;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Integer next() {
                int currentValue = current.element;
                current = current.prev;
                return (Integer) java.lang.Integer.valueOf(currentValue);
            }
        };
    }
}
