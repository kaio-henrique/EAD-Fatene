package br.com.fatene.ead.exercise2.model;

public class Parrot extends Animal {

    @Override
    public void walk() {
        System.out.println("Parrot is walking...");
    }

    public void fly() {
        System.out.println("Parrot is flying...");
    }

}
