package exe8_prob3_Stack_Iterator;

public class Node<Integer> {
    public int element;
    public Node<Integer> prev;

    public Node(int element) {
        this.element = element;
        this.prev = null;
    }
}
