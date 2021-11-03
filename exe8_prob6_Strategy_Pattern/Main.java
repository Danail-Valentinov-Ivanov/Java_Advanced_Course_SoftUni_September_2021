package exe8_prob6_Strategy_Pattern;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Person>setNames = new TreeSet<>(new NameComparator());
        Set<Person>setAges = new TreeSet<>(new AgeComparator());
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            String input = scanner.nextLine();
            String[]sequence = input.split("\\s+");
            String name = sequence[0];
            int age = Integer.parseInt(sequence[1]);
            Person person = new Person(name, age);
            setNames.add(person);
            setAges.add(person);
        }
        for (Person person : setNames) {
            System.out.println(person);
        }
        for (Person person : setAges) {
            System.out.println(person);
        }
    }
}
