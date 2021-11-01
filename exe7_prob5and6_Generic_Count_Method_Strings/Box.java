package exe7_prob5and6_Generic_Count_Method_Strings;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {
    List<T> values;

    public Box() {
        this.values = new ArrayList<>();
    }

    public void add(T element) {
        values.add(element);
    }

    public int countOfGreaterElements(T element) {
        return (int) values.stream().filter(valuesElement -> valuesElement.compareTo(element) > 0).count();
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
