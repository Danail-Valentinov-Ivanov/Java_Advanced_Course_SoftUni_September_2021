package exe6_prob1_Opinion_Poll;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean validation(int age) {
        if (age > 30) {
            return true;
        }
        return false;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format(this.name + " - " + this.age);
    }
}
