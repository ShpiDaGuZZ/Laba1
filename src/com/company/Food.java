package com.company;
public abstract class Food implements Consumable,  Nutritious
{

    String Name = null;

    public Food (String name) {
        this.Name =  name;
    }
    public boolean equals(Object arg0) {
        if (!(arg0 instanceof Food)) return false;
        if (Name==null || ((Food)arg0).Name==null) return false;
        return Name.equals(((Food)arg0).Name);
    }

    public String toString ()
    {
        return Name;

    }

    public String getName ()
    {
        return Name;

    }

    public void setName (String name)
    {

        this.Name = name;

    }

}

