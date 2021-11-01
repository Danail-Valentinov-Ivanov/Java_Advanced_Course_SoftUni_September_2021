package exe7_prob8_Custom_List_Sorter;

public class Sorter {
    public static <T extends Comparable<T>> void sort(CustomList<T> customList) {
        for (int i = 0; i < customList.size() - 1; i++) {
            T element = customList.getElements().get(i);
            for (int j = i + 1; j < customList.size(); j++) {
                T nextElement = customList.getElements().get(j);
                if (element.compareTo(nextElement) > 0) {
                    customList.swap(i, j);
                }
            }
        }
    }
}
