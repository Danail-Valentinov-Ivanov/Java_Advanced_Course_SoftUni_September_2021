package exe3_Sets_and_Maps_Advanced;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class prob7_Fix_Emails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, String> mapNames = new LinkedHashMap<>();
        String name = scanner.nextLine();
        while (!name.equals("stop")) {
            String email = scanner.nextLine();
            String[] emailData = email.split("\\.");
            String domain = emailData[emailData.length - 1];
            if (!domain.equals("us") && !domain.equals("uk") && !domain.equals("com")) {
                mapNames.put(name, email);
            }
            name = scanner.nextLine();
        }
        for (var entry : mapNames.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
