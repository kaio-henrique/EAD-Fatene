package br.com.fatene.ead.exercise2.model;

public class Cat extends Animal {

    @Override
    public void walk() {
        System.out.println("Cat is walking...");
    }

    public void meow() {
        System.out.println("Cat is meowing...");
    }
}
