package lesson6.Animals;
import lesson6.Animals.Animal;
public class Cat extends Animal {
    private final int run_distance = 200;
    private final int swimm_distance = 0;
    void run(int length) {
        if ((length >= 0) && (length <= run_distance))
            System.out.println("Кот пробежал:"+length+"м.");
        else
            System.out.println("Кот не может пробежать:"+length+"м.");
    }
    void swim(int length) {
        System.out.println("Кот ен умеет плавать!");
    }
}
