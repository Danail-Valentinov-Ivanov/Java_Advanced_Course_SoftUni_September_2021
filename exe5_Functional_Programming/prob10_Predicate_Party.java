package exe5_Functional_Programming;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class prob10_Predicate_Party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listGuests = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        Predicate<String> predicate;
        String input = scanner.nextLine();
        while (!input.equals("Party!")) {
            String condition = input.split("\\s+")[2];
            if (input.contains("Length")) {
                predicate = string -> string.length() == Integer.parseInt(condition);
            } else if (input.contains("StartsWith")) {
                predicate = string -> string.startsWith(condition);
            } else {
                predicate = string -> string.endsWith(condition);
            }
            if (input.contains("Remove")) {
                listGuests.removeIf(predicate);
            } else {
                int listLength = listGuests.size();
                for (int i = 0; i < listLength; i++) {
                    if (predicate.test(listGuests.get(i))) {
                        listGuests.add(listGuests.get(i));
                    }
                }
            }
            input = scanner.nextLine();
        }
        if (listGuests.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            Collections.sort(listGuests);
            System.out.print(String.join(", ", listGuests));
            System.out.println(" are going to the party!");
        }
    }
}
