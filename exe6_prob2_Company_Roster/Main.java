package exe6_prob2_Company_Roster;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Department> mapDepartments = new HashMap<>();
        int numEmployees = Integer.parseInt(scanner.nextLine());
        Employee employee = null;
        for (int i = 0; i < numEmployees; i++) {
            String[] arrayStr = scanner.nextLine().split("\\s+");
            String nameEmployee = arrayStr[0];
            double salary = Double.parseDouble(arrayStr[1]);
            String position = arrayStr[2];
            String departmentName = arrayStr[3];
            if (arrayStr.length == 6) {
                String email = arrayStr[4];
                int age = Integer.parseInt(arrayStr[5]);
                employee = new Employee(nameEmployee, salary, position, departmentName, email, age);
            } else if (arrayStr.length == 4) {
                employee = new Employee(nameEmployee, salary, position, departmentName);
            } else if (arrayStr.length == 5) {
                try {
                    int age = Integer.parseInt(arrayStr[4]);
                    employee = new Employee(nameEmployee, salary, position, departmentName, age);
                } catch (NumberFormatException e) {
                    String email = arrayStr[4];
                    employee = new Employee(nameEmployee, salary, position, departmentName, email);
                }
            }
            mapDepartments.putIfAbsent(departmentName, new Department(departmentName));
            mapDepartments.get(departmentName).getListEmployee().add(employee);
        }
        Department highestPaidDepartment = mapDepartments.entrySet().stream()
                .max(Comparator.comparing(entry -> entry.getValue().calculateAverageValue()))
                .get().getValue();
        System.out.println("Highest Average Salary: " + highestPaidDepartment.getNameDepartment());

        highestPaidDepartment.getListEmployee().stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .forEach(e -> System.out.println(e.toString()));
    }
}
