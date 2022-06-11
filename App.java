package lesson7;

import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int action;
        Cats[] cats = new Cats[6];
        cats[0] = new Cats("Барсик", 32, false);
        cats[1] = new Cats("Рыжик", 19, false);
        cats[2] = new Cats("Царапка", 50, false);
        cats[3] = new Cats("Маркиза", 34, false);
        cats[4] = new Cats("Гарфилд", 5, false);
        cats[5] = new Cats("Том", 62, false);
        Plate plate = new Plate(100);
        plate.info();
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].satiety == false && cats[i].appetite < plate.food){
                cats[i].eat(plate);
                cats[i].satiety = true;
                System.out.println(cats[i].name + " покушал.");
            } else {
                System.out.println(cats[i].name + " не поел.");
            }
        }
        plate.info();
        System.out.println("Добавка: ");
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();
    }
}

