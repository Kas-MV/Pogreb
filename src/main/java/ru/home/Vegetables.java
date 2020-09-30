package ru.home;

public enum Vegetables {
    TOMATO("Помидоры"),
    CUCUMBER("Огурцы"),
    PEPPER("Перец"),
    CABBAGE("Капуста");

    private String title;

    Vegetables(String title) {
        this.title = title;
    }
    @Override
    public String toString(){
        return this.title;
    }
}
