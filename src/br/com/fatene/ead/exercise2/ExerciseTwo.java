package br.com.fatene.ead.exercise2;

import br.com.fatene.ead.exercise2.model.*;

public class ExerciseTwo {

    public static void main(String[] args) {
        Animal animal = new Hyena();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Hyena hyena = new Hyena();
        Lion lion = new Lion();
        Parrot parrot = new Parrot();

        animal.walk();
        System.out.println("|-----------------------------|");
        dog.walk();
        dog.bark();
        System.out.println("|-----------------------------|");
        cat.walk();
        cat.meow();
        System.out.println("|-----------------------------|");
        hyena.walk();
        hyena.laugh();
        System.out.println("|-----------------------------|");
        lion.walk();
        lion.roar();
        System.out.println("|-----------------------------|");
        parrot.walk();
        parrot.fly();
        System.out.println("|-----------------------------|");

    }

}
