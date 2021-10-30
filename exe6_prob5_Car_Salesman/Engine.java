package exe6_prob5_Car_Salesman;

public class Engine {
    private String model;
    private int power;

    private int displacement;
    private String efficiency;

    public Engine(String model, int power, int displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public Engine(String model, int power) {
        this(model, power, 0, "n/a");
    }

    public Engine(String model, int power, int displacement) {
        this(model, power, displacement, "n/a");
    }

    public Engine(String model, int power, String efficiency) {
        this(model, power, 0, efficiency);
    }

    @Override
    public String toString() {
        String displacementStr;
        if (displacement == 0) {
            displacementStr = "n/a";
        } else {
            displacementStr = displacement + "";
        }
        StringBuilder builderPrint = new StringBuilder();
        builderPrint.append(model).append(":").append("\n")
                .append("Power: ").append(power).append("\n")
                .append("Displacement: ").append(displacementStr).append("\n")
                .append("Efficiency: ").append(efficiency);
        return builderPrint.toString();
    }
}
