package Codes.Intermediate.OOPS.Animal;

public class Main {

    static void playSound(Animal a){
        a.makeSound();
    }
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.makeSound();
        c.makeSound();

        playSound(d);
        playSound(c);

    }
}
