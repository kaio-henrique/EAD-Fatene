package br.com.fatene.ead.exercise2.model;

public class Dog extends Animal {

    @Override
    public void walk() {
        System.out.println("Dog is walking...");
    }

    public void bark() {
        System.out.println("Dog is barking...");
    }
}
