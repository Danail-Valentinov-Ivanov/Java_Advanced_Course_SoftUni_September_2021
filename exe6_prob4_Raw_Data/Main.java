package exe6_prob4_Raw_Data;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Car> mapCars = new LinkedHashMap<>();
        int numberCars = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberCars; i++) {
            String[] infoCar = scanner.nextLine().split("\\s+");
            String model = infoCar[0];
            int engineSpeed = Integer.parseInt(infoCar[1]);
            int enginePower = Integer.parseInt(infoCar[2]);
            Engine engine = new Engine(engineSpeed, enginePower);
            int cargoWeight = Integer.parseInt(infoCar[3]);
            String cargoType = infoCar[4];
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Tire[] tires = new Tire[4];
            int count = 0;
            for (int j = 5; j < infoCar.length; j += 2) {
                double tirePressure = Double.parseDouble(infoCar[j]);
                int tireAge = Integer.parseInt(infoCar[j + 1]);
                Tire tire = new Tire(tireAge, tirePressure);
                tires[count] = tire;
                count++;
            }
            Car car = new Car(model, engine, cargo, tires);
            mapCars.putIfAbsent(model, car);
        }
        String command = scanner.nextLine();
        switch (command) {
            case "fragile":
                mapCars.entrySet().stream().filter(e -> e.getValue().getCargo().getCargoType().equals(command))
                        .filter(e -> e.getValue().checkPressure())
                        .forEach(e -> System.out.println(e.getKey()));
                break;
            case "flamable":
                mapCars.entrySet().stream().filter(e -> e.getValue().getCargo().getCargoType().equals(command))
                        .filter(e -> e.getValue().getEngine().getEnginePower() > 250)
                        .forEach(e -> System.out.println(e.getKey()));
                break;
        }
    }
}
