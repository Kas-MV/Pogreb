package ru.home;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Vault {
    private List<Pantry> jars;


    public Vault() {
        this.jars = new ArrayList<>();
    }


    public void pushPan(Pantry pan) throws Exeptions {
        int random = new Random().nextInt(100) + 1;
        if (random <= 2) {
            throw new Exeptions("Разбил...");
        } else {
            this.jars.add(pan);
        }
    }


    public Pantry getPan(String label) throws Exeptions {

        Pantry pan = new Pantry();
        int random = new Random().nextInt(100) + 1;
        for (Pantry i : this.jars) {
            if (label.equals(i.getLabel())) {
                if (random == 1) {
                    throw new Exeptions("Разбил..." + pan);
                } else {
                    pan = i;
                }
                this.jars.remove(i);
                break;
            }
        }
        return pan;
    }

    //Что в погребе
    public void listVault() {
        System.out.println("Список всего что есть");
        for (Pantry jar : jars) {
            System.out.println(jar);
        }
    }

}
