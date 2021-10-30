package exe6_prob2_Company_Roster;

public class Employee {
    private String nameEmployee;
    private double salary;
    private String position;
    private String department;
    //optional
    private String email;
    private int age;

    public Employee(String nameEmployee, double salary, String position
            , String department, String email, int age) {
        this.nameEmployee = nameEmployee;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = age;
    }

    public Employee(String nameEmployee, double salary, String position, String department) {
        this(nameEmployee, salary, position, department, "n/a", -1);
    }

    public Employee(String nameEmployee, double salary, String position, String department, String email) {
        this(nameEmployee, salary, position, department, email, -1);
    }

    public Employee(String nameEmployee, double salary, String position, String department, int age) {
        this(nameEmployee, salary, position, department, "n/a", age);
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %s %d", nameEmployee, salary, email, age);
    }
}
