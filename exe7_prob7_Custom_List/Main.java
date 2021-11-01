package exe7_prob7_Custom_List;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomList<String> customList = new CustomList<>();
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] arrStr = input.split("\\s+");
            String command = arrStr[0];
            switch (command) {
                case "Add":
                    String element = arrStr[1];
                    customList.add(element);
                    break;
                case "Remove":
                    int index = Integer.parseInt(arrStr[1]);
                    customList.remove(index);
                    break;
                case "Contains":
                    element = arrStr[1];
                    System.out.println(customList.contains(element));
                    break;
                case "Swap":
                    int firstIndex = Integer.parseInt(arrStr[1]);
                    int secondIndex = Integer.parseInt(arrStr[2]);
                    customList.swap(firstIndex, secondIndex);
                    break;
                case "Greater":
                    element = arrStr[1];
                    System.out.println(customList.countGreaterThan(element));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Print":
                    System.out.println(customList);
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
