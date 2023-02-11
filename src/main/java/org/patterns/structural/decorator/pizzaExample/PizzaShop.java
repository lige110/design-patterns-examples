package org.patterns.structural.decorator.pizzaExample;

public class PizzaShop {

    public static void main(String[] args) {
        Pizza pizza = new VeggiePizzaDecorator(new TomatoPizzaDecorator(new PlainPizza()));
        pizza.bake();
    }
}
