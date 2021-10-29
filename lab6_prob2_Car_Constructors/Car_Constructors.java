package lab6_prob2_Car_Constructors;

public class Car_Constructors {
    private String brand;
    private String model;
    private int horsePower;

    public Car_Constructors(String brand, String model, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }

    public Car_Constructors(String brand) {
        this(brand, "unknown", -1);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
