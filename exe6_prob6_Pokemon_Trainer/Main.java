package exe6_prob6_Pokemon_Trainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //{TrainerName} {PokemonName} {PokemonElement} {PokemonHealth}
        Map<String, Trainer> mapTrainer = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("Tournament")) {
            String[] arrayData = input.split("\\s+");
            String trainerName = arrayData[0];
            String pokemonName = arrayData[1];
            String pokemonElement = arrayData[2];
            int pokemonHealth = Integer.parseInt(arrayData[3]);
            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            Trainer trainer = new Trainer(trainerName);
            mapTrainer.putIfAbsent(trainerName, trainer);
            mapTrainer.get(trainerName).addPokemon(pokemon);
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("End")) {
            String element = input;
            for (Trainer trainer : mapTrainer.values()) {
                if (trainer.hasElementType(element)) {
                    trainer.increment(1);
                } else {
                    trainer.damagePokemons(10);
                }
            }
            input = scanner.nextLine();
        }
        mapTrainer.entrySet().stream().sorted((t1, t2) -> t2.getValue().getBadges() - t1.getValue().getBadges())
                .forEach(entry -> System.out.println(entry.getValue().toString()));
    }
}
