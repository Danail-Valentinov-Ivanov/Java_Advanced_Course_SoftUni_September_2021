package lab3_Sets_and_Maps_Advanced;

import java.util.*;

public class prob8_Academy_Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, Double> mapStudents = new TreeMap<>();
        int input = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < input; i++) {
            String studentName = scanner.nextLine();
            double sumGrads = 0;
            String[] infoGrads = scanner.nextLine().split("\\s+");
            for (int j = 0; j < infoGrads.length; j++) {
                sumGrads += Double.parseDouble(infoGrads[j]);
            }
            double averageGrad = sumGrads / infoGrads.length;
            mapStudents.put(studentName, averageGrad);
        }
        for (var student : mapStudents.keySet()) {
            System.out.print(student + " is graduated with ");
            System.out.println(mapStudents.get(student));
        }
    }
}
