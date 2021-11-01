package exe7_prob3and4_Generic_Swap_Method_Strings;

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

    public void swap(int firstIndex, int secondIndex) {
        T temp = values.get(firstIndex);
        values.set(firstIndex, values.get(secondIndex));
        values.set(secondIndex, temp);
//        or
//        Collections.swap(values, firstIndex, secondIndex);
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
