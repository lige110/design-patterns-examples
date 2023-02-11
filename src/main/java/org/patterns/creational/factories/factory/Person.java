package org.patterns.creational.factories.factory;

class Person {
    public int id;
    public String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void greet() {
        System.out.println("我叫" + name + "， 喜欢唱跳篮球， music!");
    }
}