package com.company;
public class Cheese extends Food {
    public Cheese() {
        super("Cheese");
    }
    public void consume() {
        System.out.println(this + " съеден");
    }
    public Integer calculateCalories()
    {
        return 1500;

    }

}