package exe6_prob7_Google;

public class Parents {
    private String parentsName;
    private String parentsBirthday;

    public Parents(String parentsName, String parentsBirthday) {
        this.parentsName = parentsName;
        this.parentsBirthday = parentsBirthday;
    }

    public String getParentsName() {
        return parentsName;
    }

    public String getParentsBirthday() {
        return parentsBirthday;
    }

    @Override
    public String toString() {
        return parentsName + " " + parentsBirthday;
    }
}
