package exe8_prob2_Collection;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListyIterator listyIterator = null;
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] arrStr = input.split("\\s+");
            String command = arrStr[0];
            switch (command) {
                case "Create":
                    if (arrStr.length > 1) {
                        listyIterator = new ListyIterator(Arrays.copyOfRange(arrStr, 1, arrStr.length));
                    } else {
                        listyIterator = new ListyIterator();
                    }
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "Print":
                    try {
                        listyIterator.print();
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "PrintAll":
                    listyIterator.printAll();
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
