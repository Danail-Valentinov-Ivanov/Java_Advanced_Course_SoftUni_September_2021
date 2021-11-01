package exe7_prob1and2_Generic_Box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        Box<String> box = new Box<>();
        for (int i = 0; i < input; i++) {
            box.add(scanner.nextLine());
        }
        System.out.println(box);
    }
}
