package exe3_Sets_and_Maps_Advanced;

import java.util.HashMap;
import java.util.Scanner;

public class prob5_Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> mapPhonebook = new HashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("search")) {
            String[] inputData = input.split("-");
            String name = inputData[0];
            String number = inputData[1];
            mapPhonebook.put(name, number);
            input = scanner.nextLine();
        }
        String searchName = scanner.nextLine();
        while (!searchName.equals("stop")) {
            if (mapPhonebook.containsKey(searchName)) {
                System.out.printf("%s -> %s\n", searchName, mapPhonebook.get(searchName));
            } else {
                System.out.printf("Contact %s does not exist.\n", searchName);
            }
            searchName = scanner.nextLine();
        }
        System.out.println();
    }
}
