package exe6_prob5_Car_Salesman;

public class Car {
    private String model;
    private Engine engine;

    private int weight;
    private String color;

    public Car(String model, Engine engine, int weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public Car(String model, Engine engine) {
        this(model, engine, 0, "n/a");
    }

    public Car(String model, Engine engine, int weight) {
        this(model, engine, weight, "n/a");
    }

    public Car(String model, Engine engine, String color) {
        this(model, engine, 0, color);
    }

    @Override
    public String toString() {
        String weightStr;
        if (weight == 0) {
            weightStr = "n/a";
        } else {
            weightStr = weight + "";
        }
        StringBuilder builderPrintCar = new StringBuilder();
        builderPrintCar.append(model).append(":").append("\n")
                .append(engine.toString()).append("\n")
                .append("Weight: ").append(weightStr).append("\n")
                .append("Color: ").append(color);
        return builderPrintCar.toString();
    }
}
