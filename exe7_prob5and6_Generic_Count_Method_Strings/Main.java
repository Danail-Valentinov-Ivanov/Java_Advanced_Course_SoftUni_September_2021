package exe7_prob5and6_Generic_Count_Method_Strings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        Box<String> box = new Box<>();
        for (int i = 0; i < input; i++) {
            box.add(scanner.nextLine());
        }
        String elementToCompare = scanner.nextLine();
        System.out.println(box.countOfGreaterElements(elementToCompare));
    }
}
