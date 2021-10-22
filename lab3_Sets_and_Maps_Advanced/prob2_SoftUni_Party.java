package lab3_Sets_and_Maps_Advanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class prob2_SoftUni_Party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> vipGuests = new TreeSet<>();
        Set<String> regularGuests = new TreeSet<>();
        String input = scanner.nextLine();
        while (!input.equals("PARTY")) {
            if (Character.isDigit(input.charAt(0))) {
                vipGuests.add(input);
            } else {
                regularGuests.add(input);
            }
            input = scanner.nextLine();
        }
        String guests = scanner.nextLine();
        while (!guests.equals("END")) {
            vipGuests.remove(guests);
            regularGuests.remove(guests);
            guests = scanner.nextLine();
        }
        int numberOfAllGuests = vipGuests.size() + regularGuests.size();
        System.out.println(numberOfAllGuests);
        for (String eVip : vipGuests) {
            System.out.println(eVip);
        }
        for (String eReg : regularGuests) {
            System.out.println(eReg);
        }
    }
}
