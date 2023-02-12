import data.Animal;
import data.Cat;
import data.Dog;
import data.Frog;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal frog = new Frog();

        List<Animal> animals = List.of(cat, dog, frog);

        for (Animal animal : animals) {
            animal.makeSound();
        }

    }
}