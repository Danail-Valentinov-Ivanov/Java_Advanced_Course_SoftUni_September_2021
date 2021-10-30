package exe6_prob2_Company_Roster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String nameDepartment;
    private List<Employee> listEmployee;

    public Department(String nameDepartment) {
        this.nameDepartment = nameDepartment;
        this.listEmployee = new ArrayList<>();
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public List<Employee> getListEmployee() {
        return listEmployee;
    }

    public double calculateAverageValue() {
        return listEmployee.stream().mapToDouble(e -> e.getSalary()).average().orElse(0.0);
    }
}
