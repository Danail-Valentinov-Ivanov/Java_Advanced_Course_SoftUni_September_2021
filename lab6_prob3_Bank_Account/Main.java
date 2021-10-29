package lab6_prob3_Bank_Account;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Create
// Deposit {Id} {Amount}
// SetInterest {Interest}
// GetInterest {ID} {Years}
// End
        Map<Integer, Bank_Account> mapAccounts = new HashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] commandLine = input.split("\\s+");
            String output = null;
            switch (commandLine[0]) {
                case "Create":
                    Bank_Account account = new Bank_Account();
                    mapAccounts.put(account.getId(), account);
                    output = "Account ID" + account.getId() + " created";
                    break;
                case "Deposit":
                    int id = Integer.parseInt(commandLine[1]);
                    int amound = Integer.parseInt(commandLine[2]);
                    if (!mapAccounts.containsKey(id)) {
                        output = "Account does not exist";
                    } else {
                        mapAccounts.get(id).deposit(amound);
                        output = "Deposited " + amound + " to ID" + id;
                    }
                    break;
                case "SetInterest":
                    Bank_Account.setInterestRate(Double.parseDouble(commandLine[1]));
                    break;
                case "GetInterest":
                    id = Integer.parseInt(commandLine[1]);
                    int years = Integer.parseInt(commandLine[2]);
                    if (!mapAccounts.containsKey(id)) {
                        output = "Account does not exist";
                    } else {
                        double interest = mapAccounts.get(id).getInterest(years);
                        output = String.format("%.2f", interest);
                    }
                    break;
            }
            if (output != null) {
                System.out.println(output);
            }
            input = scanner.nextLine();
        }
    }
}
