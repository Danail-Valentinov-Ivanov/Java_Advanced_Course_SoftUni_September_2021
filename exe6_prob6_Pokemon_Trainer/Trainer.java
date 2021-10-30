package exe6_prob6_Pokemon_Trainer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Trainer {
    private String trainerName;
    private int badges;
    private Map<String, List<Pokemon>> mapFromLists;

    public Trainer(String trainerName) {
        this.trainerName = trainerName;
        this.badges = 0;
        this.mapFromLists = new HashMap<>();
        mapFromLists.put("Fire", new ArrayList<>());
        mapFromLists.put("Water", new ArrayList<>());
        mapFromLists.put("Electricity", new ArrayList<>());
    }

    public int getBadges() {
        return badges;
    }

    public void addPokemon(Pokemon pokemon) {
        mapFromLists.putIfAbsent(pokemon.getElement(), new ArrayList<>());
        mapFromLists.get(pokemon.getElement()).add(pokemon);
    }

    public boolean hasElementType(String element) {
        return !mapFromLists.get(element).isEmpty();
    }

    public void increment(int increment) {
        badges += increment;
    }

    public void damagePokemons(int damage) {
        for (List<Pokemon> listPokemons : mapFromLists.values()) {
            for (Pokemon pokemon : listPokemons) {
                pokemon.setHealth(pokemon.getHealth() - damage);
            }
        }
        clearDeadPokemons();
    }

    private void clearDeadPokemons() {
        for (List<Pokemon> listPokemons : mapFromLists.values()) {
            listPokemons.removeIf(pokemon -> pokemon.getHealth() <= 0);
        }
    }

    @Override
    public String toString() {
        return trainerName + " " + badges + " " + countAllPokemons();
    }

    private int countAllPokemons() {
        int countAllPokemons = 0;
        for (List<Pokemon> listPokemons : mapFromLists.values()) {
            countAllPokemons += listPokemons.size();
        }
        return countAllPokemons;
    }
}
