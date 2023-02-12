package data;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Cat meow");
    }

    public void attack() {
        System.out.println("attack him");
    }
}
