package lab7_Generics.prob2_Generic_Array_Creator;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCreator {
    public static <T> T[] create(int length, T def) {
        T[] array = (T[]) Array.newInstance(def.getClass(), length);
        Arrays.fill(array, def);
        return array;
    }

    public static <T> T[] create(Class<T> class_, int length, T def) {
        T[] array = (T[]) Array.newInstance(class_, length);
        Arrays.fill(array, def);
        return array;
    }
}
