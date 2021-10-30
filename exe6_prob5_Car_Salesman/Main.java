package exe6_prob5_Car_Salesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Engine> mapEngines = new HashMap<>();
        int numbersOfEngines = Integer.parseInt(scanner.nextLine());
        Engine engine = null;
        for (int i = 0; i < numbersOfEngines; i++) {
            String[] engineStr = scanner.nextLine().split("\\s+");
            String modelEngine = engineStr[0];
            int power = Integer.parseInt(engineStr[1]);
            if (engineStr.length == 4) {
                int displacement = Integer.parseInt(engineStr[2]);
                String efficiency = engineStr[3];
                engine = new Engine(modelEngine, power, displacement, efficiency);
            } else if (engineStr.length == 2) {
                engine = new Engine(modelEngine, power);
            } else if (engineStr.length == 3) {
                try {
                    int displacement = Integer.parseInt(engineStr[2]);
                    engine = new Engine(modelEngine, power, displacement);
                } catch (NumberFormatException e) {
                    String efficiency = engineStr[2];
                    engine = new Engine(modelEngine, power, efficiency);
                }
            }
            mapEngines.put(modelEngine, engine);
        }
        List<Car> listCars = new ArrayList<>();
        int numberOfCars = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfCars; i++) {
            String[] carStr = scanner.nextLine().split("\\s+");
            String model = carStr[0];
            String modelEngine = carStr[1];
            Engine objEngineOfCar = mapEngines.get(modelEngine);
            Car car = null;
            if (carStr.length == 4) {
                int weight = Integer.parseInt(carStr[2]);
                String color = carStr[3];
                car = new Car(model, objEngineOfCar, weight, color);
            } else if (carStr.length == 2) {
                car = new Car(model, objEngineOfCar);
            } else if (carStr.length == 3) {
                try {
                    int weight = Integer.parseInt(carStr[2]);
                    car = new Car(model, objEngineOfCar, weight);
                } catch (NumberFormatException e) {
                    String color = carStr[2];
                    car = new Car(model, objEngineOfCar, color);
                }
            }
            listCars.add(car);
        }
        for (Car e : listCars) {
            System.out.println(e.toString());
        }
    }
}
