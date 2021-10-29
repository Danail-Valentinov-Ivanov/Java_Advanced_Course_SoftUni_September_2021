package lab6_prob1_Car_Info;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCars = Integer.parseInt(scanner.nextLine());
        Car_Info car = new Car_Info();
        while (numberCars-- > 0) {
            String[] infoCurrentCar = scanner.nextLine().split("\\s+");
            String brand = infoCurrentCar[0];
            String model = infoCurrentCar[1];
            int horsePower = Integer.parseInt(infoCurrentCar[2]);
            car.setBrand(brand);
            car.setModel(model);
            car.setHorsePower(horsePower);
            System.out.printf("The car is: %s %s - %d HP.\n", car.getBrand(), car.getModel(), car.getHorsePower());
        }

    }
}
