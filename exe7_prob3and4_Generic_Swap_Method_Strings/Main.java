package exe7_prob3and4_Generic_Swap_Method_Strings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        Box<String> box = new Box<>();
        for (int i = 0; i < input; i++) {
            box.add(scanner.nextLine());
        }
        String[] arrayStr = scanner.nextLine().split(" ");
        int firstIndex = Integer.parseInt(arrayStr[0]);
        int secondIndex = Integer.parseInt(arrayStr[1]);
        box.swap(firstIndex, secondIndex);
        System.out.println(box);
    }
}
