package lesson6.Animals;

public class Animal {
    public static void main(String[] args) {
        System.out.println("Все животные могут бежать и плыть:");
        Cat cat = new Cat();
        cat.run(199);
        cat.swim(0);
        Dog dog = new Dog();
        dog.run(400);
        dog.swim(11);
    }
}

