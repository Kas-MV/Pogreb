package ru.home;

public class Main {
    public static void main(String[] args) {
        Vault vault = new Vault();
        Pantry pan ;

        try {
        pan = new Pantry("Компот", new Produce[]{Produce.APPLES, Produce.BERRIES});
            vault.pushPan(pan);
            pan = new Pantry("Варенье", new Produce[]{Produce.BERRIES, Produce.APPLES});
            vault.pushPan(pan);
            pan = new Pantry("Помидорки с Огурцами", new Produce[]{Produce.TOMATOES, Produce.CUCUMBERS});
            vault.pushPan(pan);
            pan = new Pantry("Грибочки маринованные", new Produce[]{Produce.FUNGUS});
            vault.pushPan(pan);
            pan = new Pantry("Огурцы", new Produce[]{Produce.CUCUMBERS});
            vault.pushPan(pan);
            pan = new Pantry("Капустка", new Produce[]{Produce.CABBAGES});
            vault.pushPan(pan);
        } catch (Exeptions exeptions) {
            System.out.println(exeptions.getMessage());
        }
        vault.listVault();
//
        try {
            pan = vault.getPan("Огурцы");
            if (!pan.Null()) {
                System.out.println("Достали из погреба " + pan);
            } else {
                System.out.println("Разбили банку");
            };
        } catch (Exeptions exeptions) {
            System.out.println(exeptions.getMessage());
        }
        vault.listVault();


    }
}