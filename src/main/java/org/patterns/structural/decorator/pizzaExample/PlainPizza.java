package org.patterns.structural.decorator.pizzaExample;

public class PlainPizza implements Pizza{
    @Override
    public void bake() {
        System.out.println("baking plain pizza");
    }
}
