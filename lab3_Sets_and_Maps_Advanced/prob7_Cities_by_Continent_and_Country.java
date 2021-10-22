package lab3_Sets_and_Maps_Advanced;

import java.util.*;

public class prob7_Cities_by_Continent_and_Country {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Map<String, List<String>>> mapContinents = new LinkedHashMap<>();
        int input = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < input; i++) {
            String[] info = scanner.nextLine().split("\\s+");
            String continents = info[0];
            String countries = info[1];
            String cities = info[2];
            mapContinents.putIfAbsent(continents, new LinkedHashMap<>());
            Map<String, List<String>> mapCountries = mapContinents.get(continents);
            mapCountries.putIfAbsent(countries, new ArrayList<>());
            List<String> listCities = mapCountries.get(countries);
            listCities.add(cities);
        }
        //имената на континентите
        for (var continent : mapContinents.keySet()) {
            System.out.println(continent + ":");
            //държавите заедно с техните градовете
            for (var country : mapContinents.get(continent).entrySet()) {
                System.out.print(country.getKey() + " -> ");
                System.out.println(String.join(", ", country.getValue()));
            }
        }
    }
}
