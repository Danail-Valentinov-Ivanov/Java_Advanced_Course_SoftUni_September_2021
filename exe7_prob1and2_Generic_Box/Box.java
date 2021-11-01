package exe7_prob1and2_Generic_Box;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    List<T> values;

    public Box() {
        this.values = new ArrayList<>();
    }

    public void add(T element) {
        values.add(element);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (T element : values) {
            stringBuilder.append(String.format("%s: %s\n", element.getClass().getName(), element));
        }
        return stringBuilder.toString();
    }
}
