package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Определение ссылок на продукты завтрака

        String argument = "IceCream/Cheese/IceCream";
        Random rand = new Random();
        String[] parts = argument.split("/");
        String parts_Ice_0 = "шоколад/сливочное";
        String[] parts_Ice = parts_Ice_0.split("/");

        Food[] dessert = new Food[parts.length];
        for (int j = 0; j < parts.length; j++) {
            if (parts[j].equals("Cheese")) {

                dessert[j] = new com.company.Cheese();
            }
            if (parts[j].equals("IceCream")) {

                dessert[j] = new IceCream(parts_Ice[rand.nextInt(parts_Ice.length)]);

            }
        }


        // Object a = new Object();
        //System.out.println(a.toString());
        dessert[0].consume();
        Arrays.sort(dessert, new FoodComparator());
        System.out.println(dessert[0].toString() + " / " + dessert[1].toString() + " / " + dessert[2].toString());
        int calories = 0;
        for (int i = 0; i < parts.length; i++) {
            calories += dessert[i].calculateCalories();

        }

        System.out.println("Calories in dessert = " + calories);
        System.out.println(dessert[rand.nextInt(dessert.length)].toString());

    }

}
