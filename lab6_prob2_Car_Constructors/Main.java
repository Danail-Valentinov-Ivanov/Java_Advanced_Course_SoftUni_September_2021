package lab6_prob2_Car_Constructors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCars = Integer.parseInt(scanner.nextLine());
        while (numberCars-- > 0) {
            String[] infoCurrentCar = scanner.nextLine().split("\\s+");
            String brand = infoCurrentCar[0];
            Car_Constructors car;
            if (infoCurrentCar.length == 1) {
                car = new Car_Constructors(brand);
            } else {
                String model = infoCurrentCar[1];
                int horsePower = Integer.parseInt(infoCurrentCar[2]);
                car = new Car_Constructors(brand, model, horsePower);
            }
            System.out.printf("The car is: %s %s - %d HP.\n", car.getBrand(), car.getModel(), car.getHorsePower());
        }
    }
}
