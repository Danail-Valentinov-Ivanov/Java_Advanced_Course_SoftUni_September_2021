package exe7_prob8_Custom_List_Sorter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    private List<T> elements;

    public CustomList() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public T remove(int index) {
        return elements.remove(index);
    }

    public boolean contains(T element) {
        return elements.contains(element);
    }

    public void swap(int firstIndex, int secondIndex) {
        Collections.swap(elements, firstIndex, secondIndex);
    }

    public int countGreaterThan(T element) {
        return (int) elements.stream().filter(e -> e.compareTo(element) > 0).count();
    }

    public T getMax() {
//        return elementsList.stream().max((e1,e2)-> e1.compareTo(e2)).get();
//        or
        return Collections.max(elements);
    }

    public T getMin() {
//        return elementsList.stream().min((e1,e2)-> e1.compareTo(e2)).get();
//        or
        return Collections.min(elements);
    }
    public int size(){
        return elements.size();
    }

    public List<T> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (T element : this.elements) {
            stringBuilder.append(element).append(System.lineSeparator());
        }
        return stringBuilder.toString().trim();
    }
}
