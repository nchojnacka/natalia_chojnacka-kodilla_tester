package com.kodilla.abstracts;

public class Application {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.giveVoice();

        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog);

    }
}
