package lab3_Sets_and_Maps_Advanced;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class prob3_Voina_Number_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<Integer> setFirstPlayer = new LinkedHashSet<>();
        LinkedHashSet<Integer> setSecondPlayer = new LinkedHashSet<>();
        setFirstPlayer = getSet(setFirstPlayer, scanner);
        setSecondPlayer = getSet(setSecondPlayer, scanner);
        int rounds = 50;
        while (rounds-- > 0) {
            int cardFirstPlayer = getCard(setFirstPlayer);
            int cardSecondPlayer = getCard(setSecondPlayer);
            setFirstPlayer.remove(cardFirstPlayer);
            setSecondPlayer.remove(cardSecondPlayer);
            if (cardFirstPlayer > cardSecondPlayer) {
                setFirstPlayer.add(cardFirstPlayer);
                setFirstPlayer.add(cardSecondPlayer);
            } else if (cardSecondPlayer > cardFirstPlayer) {
                setSecondPlayer.add(cardFirstPlayer);
                setSecondPlayer.add(cardSecondPlayer);
            }
            if (setFirstPlayer.size() == 0 || setSecondPlayer.size() == 0) {
                break;
            }
        }
        if (setFirstPlayer.size() > setSecondPlayer.size()) {
            System.out.println("First player win!");
        } else if (setSecondPlayer.size() > setFirstPlayer.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }

    private static int getCard(LinkedHashSet<Integer> setPlayer) {
        for (int e : setPlayer) {
            return e;
        }
        return 0;
    }

    private static LinkedHashSet<Integer> getSet(LinkedHashSet<Integer> setPlayer, Scanner scanner) {
        int[] currentNumbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < currentNumbers.length; i++) {
            setPlayer.add(currentNumbers[i]);
        }
        return setPlayer;
    }
}
