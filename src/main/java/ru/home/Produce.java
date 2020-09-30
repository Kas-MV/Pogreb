package ru.home;

public enum Produce {
    TOMATOES ("Помидорки"),
    CABBAGES ("Капустка"),
    FUNGUS ("Грибочки"),
    CUCUMBERS ("Огурцы"),
    APPLES ("Яблоки"),
    BERRIES ("Ягоды");

//    TOMATOES,
//    CABBAGES,
//    FUNGUS,
//    CUCUMBERS,
//    APPLES,
//    BERRIES;

    private final String title;

    Produce(String title) {
        this.title = title;
    }
    @Override
    public String toString(){
        return this.title;
    }

}

