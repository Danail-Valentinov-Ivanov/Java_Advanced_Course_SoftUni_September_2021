package exe6_prob7_Google;

public class Company {
    private String companyName;
    private String department;
    private double salary;

    public Company(String companyName, String department, double salary) {
        this.companyName = companyName;
        this.department = department;
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String salaryFormatted = String.format("%.2f", salary);
        stringBuilder.append(companyName).append(" ").append(department).append(" ").append(salaryFormatted);
        return stringBuilder.toString();
    }
}
