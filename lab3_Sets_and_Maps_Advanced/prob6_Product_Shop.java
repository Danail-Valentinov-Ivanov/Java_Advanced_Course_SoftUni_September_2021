package lab3_Sets_and_Maps_Advanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class prob6_Product_Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, Map<String, Double>> mapShops = new TreeMap<>();
        String input = scanner.nextLine();
        while (!input.equals("Revision")) {
            String[] info = input.split(",\\s+");
            String shop = info[0];
            String product = info[1];
            double price = Double.parseDouble(info[2]);
            mapShops.putIfAbsent(shop, new LinkedHashMap<>());
//            Map<String, Double>mapProduct = mapShops.get(shop);
//            mapProduct.put(product, price);
            //or that
            mapShops.get(shop).put(product, price);
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Map<String, Double>> entry1 : mapShops.entrySet()) {
            System.out.println(entry1.getKey() + "->");
            for (var entry2 : entry1.getValue().entrySet()) {
                System.out.printf("Product: %s, Price: %.1f\n", entry2.getKey(), entry2.getValue());
            }
        }
    }
}
