package org.patterns.creational.factories.factory;

public class Demo {
    public static void main(String[] args) {
        Person lige = PersonFactory.createPerson("Lige");

        lige.greet();
    }
}
