package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;

    private final Feline feline;
    Predator predator;
    public Lion(String sex,Feline feline)throws Exception {
        this.predator = feline;
        this.feline = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }

    //Feline feline = new Feline();

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood(String animalKind) throws Exception {
        return predator.eatMeat();
    }
}
