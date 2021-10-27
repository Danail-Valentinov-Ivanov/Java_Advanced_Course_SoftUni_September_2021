package lab5_Functional_Programming;

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class prob4_Add_VAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UnaryOperator<Double> pricesWithVAT = price -> price * 1.2;
        String[] arrayPrices = scanner.nextLine().split(",\\s+");
        System.out.println("Prices with VAT:");
        for (String price : arrayPrices) {
            double currentPrice = Double.parseDouble(price);
            System.out.printf("%.2f\n", pricesWithVAT.apply(currentPrice));
        }
    }
}
