package ru.home;

import lombok.Data;


@Data
public class Pantry {
    private String label;
    private Produce[] produces;

    public Pantry(String label, Produce[] produces) {
        this.label = label;
        this.produces = produces;
    }

    public Pantry() {

    }

    public Boolean Null() {return (this.label == null) && (this.produces == null);}

    @Override
    public String toString() {
        String str = "\"" + this.label + "\" " + "состав: ";
        for (Produce produces : produces) {
            str += produces + " ";
        }
        return str;
    }


}