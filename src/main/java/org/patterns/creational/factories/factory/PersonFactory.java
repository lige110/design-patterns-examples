package org.patterns.creational.factories.factory;

class PersonFactory {
    private static int index = 0;

    public static Person createPerson(String name) {
        return new Person(index++, name);
    }
}
