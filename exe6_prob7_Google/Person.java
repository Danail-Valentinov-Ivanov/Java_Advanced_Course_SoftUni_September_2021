package exe6_prob7_Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private Company company;
    private List<Pokemon> listPokemon;
    private List<Parents> listParents;
    private List<Children> listChildren;
    private Car car;

    public Person() {
        this.listPokemon = new ArrayList<>();
        this.listParents = new ArrayList<>();
        this.listChildren = new ArrayList<>();
    }

    public List<Pokemon> getListPokemon() {
        return listPokemon;
    }

    public List<Parents> getListParents() {
        return listParents;
    }

    public List<Children> getListChildren() {
        return listChildren;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Company:").append("\n");
        if (company != null) {
            stringBuilder.append(company.toString()).append("\n");
        }
        stringBuilder.append("Car:").append("\n");
        if (car != null) {
            stringBuilder.append(car.toString()).append("\n");
        }
        stringBuilder.append("Pokemon:").append("\n");
        for (Pokemon pokemon : listPokemon) {
            stringBuilder.append(pokemon.toString()).append("\n");
        }
        stringBuilder.append("Parents:").append("\n");
        for (Parents parents : listParents) {
            stringBuilder.append(parents.toString()).append("\n");
        }
        stringBuilder.append("Children:").append("\n");
        for (Children children : listChildren) {
            stringBuilder.append(children.toString()).append("\n");
        }
        return stringBuilder.toString();
    }
}
