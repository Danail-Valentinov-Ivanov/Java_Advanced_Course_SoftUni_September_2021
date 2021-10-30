package exe6_prob7_Google;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Person> mapPerson = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] commandInfo = input.split("\\s+");
            String personName = commandInfo[0];
            if (!mapPerson.containsKey(personName)){
                Person person = new Person();
                mapPerson.put(personName, person);
            }
            String currentWord = commandInfo[1];
            switch (currentWord) {
                case "company":
                    String companyName = commandInfo[2];
                    String department = commandInfo[3];
                    double salary = Double.parseDouble(commandInfo[4]);
                    Company company = new Company(companyName, department, salary);
                    mapPerson.get(personName).setCompany(company);
                    break;
                case "pokemon":
                    String pokemonName = commandInfo[2];
                    String pokemonType = commandInfo[3];
                    Pokemon pokemon = new Pokemon(pokemonName, pokemonType);
                    mapPerson.get(personName).getListPokemon().add(pokemon);
                    break;
                case "parents":
                    String parentsName = commandInfo[2];
                    String parentsBirthday = commandInfo[3];
                    Parents parents = new Parents(parentsName, parentsBirthday);
                    mapPerson.get(personName).getListParents().add(parents);
                    break;
                case "children":
                    String childrenName = commandInfo[2];
                    String childrenBirthday = commandInfo[3];
                    Children children = new Children(childrenName, childrenBirthday);
                    mapPerson.get(personName).getListChildren().add(children);
                    break;
                case "car":
                    String carModel = commandInfo[2];
                    int carSpeed = Integer.parseInt(commandInfo[3]);
                    Car car = new Car(carModel, carSpeed);
                    mapPerson.get(personName).setCar(car);
                    break;
            }

            input = scanner.nextLine();
        }
        String searchPerson = scanner.nextLine();
        System.out.println(searchPerson);
        System.out.println(mapPerson.get(searchPerson));
    }
}
