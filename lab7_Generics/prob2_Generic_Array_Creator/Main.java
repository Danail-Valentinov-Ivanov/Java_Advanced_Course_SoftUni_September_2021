package lab7_Generics.prob2_Generic_Array_Creator;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = ArrayCreator.create(10, 0);
        String[] strings = ArrayCreator.create(String.class, 10, "none");
    }
}
