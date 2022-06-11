package lesson7;

import java.util.Locale;

public class Cats {
    public String name;
    public int appetite;
    public boolean satiety;

    public Cats(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }
}

