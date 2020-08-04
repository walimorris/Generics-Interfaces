package com.morris.AdvancedJava;

public class Dog implements Talkable {
    private final String name;
    private final String species;

    public Dog(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return this.name;
    }

    public String getSpecies() {
        return this.species;
    }

    @Override
    public void talk() {
        System.out.println("woof woof!");
    }

    @Override
    public String toString() {
        return String.format("%s, I'm a %s", this.getName(), this.getSpecies());
    }
}
