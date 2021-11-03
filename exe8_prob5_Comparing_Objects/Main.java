package exe8_prob5_Comparing_Objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> listPersons = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] sequence = input.split("\\s+");
            String name = sequence[0];
            int age = Integer.parseInt(sequence[1]);
            String town = sequence[2];
            Person person = new Person(name, age, town);
            listPersons.add(person);
            input = scanner.nextLine();
        }
        int numberPerson = Integer.parseInt(scanner.nextLine());
        Person personToCompare = listPersons.get(numberPerson - 1);
        listPersons.remove(numberPerson - 1);
        int samePeople = 0;
        int differentPeople = 0;
        for (Person person : listPersons) {
            if (person.compareTo(personToCompare) == 0) {
                samePeople++;
            } else {
                differentPeople++;
            }
        }
        int totalPeople = listPersons.size() + 1;
        if (samePeople == 0) {
            System.out.println("No matches");
        } else {
            System.out.printf("%d %d %d", ++samePeople, differentPeople, totalPeople);
        }
    }
}
