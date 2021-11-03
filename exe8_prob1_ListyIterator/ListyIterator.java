package exe8_prob1_ListyIterator;

import java.util.Arrays;
import java.util.List;

public class ListyIterator {
    private List<String> elements;
    private int currentIndex;

    public ListyIterator(String... elements) {
        this.elements = Arrays.asList(elements);
        this.currentIndex = 0;
    }

    public boolean hasNext() {
        return this.currentIndex < elements.size() - 1;
    }

    public boolean move() {
        if (hasNext()) {
            this.currentIndex++;
            return true;
        }
        return false;
    }

    public void print() {
        if (elements.size() == 0) {
            throw new IllegalStateException("Invalid Operation!");
        }
        System.out.println(elements.get(currentIndex));
    }
}
