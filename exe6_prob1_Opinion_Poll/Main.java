package exe6_prob1_Opinion_Poll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person>listPersons = new ArrayList<>();
        int input = Integer.parseInt(scanner.nextLine());
        while (input-- > 0) {
            String[] arrayPersonData = scanner.nextLine().split("\\s+");
            String name = arrayPersonData[0];
            int age = Integer.parseInt(arrayPersonData[1]);
            Person person = new Person(name, age);
            listPersons.add(person);
        }
        listPersons.stream().filter(e-> e.validation(e.getAge()))
                .sorted((e1,e2)->e1.getName().compareTo(e2.getName()))
                .forEach(e-> System.out.println(e.toString()));
    }
}
