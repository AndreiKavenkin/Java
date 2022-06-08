package lesson6.Animals;
import lesson6.Animals.Animal;
public class Dog extends Animal {
    private final int run_distance = 500;
    private final int swimm_distance = 10;
    void run(int length) {
        if ((length >= 0) && (length <= run_distance))
            System.out.println("Собака пробежал:"+length+"м.");
        else
            System.out.println("Собака не может пробежать:"+length+"м.");
    }
    void swim(int length) {
        if ((length >= 0) && (length <= swimm_distance))
            System.out.println("Собака проплыла:"+length+"м.");
        else
            System.out.println("Собака не может проплыть:"+length+"м.");
    }
}
