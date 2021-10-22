package lab3_Sets_and_Maps_Advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class prob5_Average_Students_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, List<Double>> mapNames = new TreeMap<>();
        int input = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < input; i++) {
            String[] namesLine = scanner.nextLine().split("\\s+");
            String name = namesLine[0];
            double grad = Double.parseDouble(namesLine[1]);
            List<Double> list = new ArrayList<>();
            if (mapNames.containsKey(name)) {
                mapNames.get(name).add(grad);
            } else {
                list.add(grad);
                mapNames.put(name, list);
            }
        }
        List<Double> listAverageGrad = new ArrayList<>();
        for (var e1 : mapNames.entrySet()) {
            double sum = 0;
            int count = e1.getValue().size();
            for (var e2 : e1.getValue()) {
                sum += e2;
            }
            double averageValue = sum / count;
            listAverageGrad.add(averageValue);
        }
        int count = -1;
        for (var e1 : mapNames.entrySet()) {
            System.out.print(e1.getKey() + " -> ");
            for (var e2 : e1.getValue()) {
                System.out.printf("%.2f ", e2);
            }
            count++;
            System.out.printf("(avg: %.2f)\n", listAverageGrad.get(count));
        }
    }
}
