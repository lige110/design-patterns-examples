package org.patterns.structural.decorator.pizzaExample;

public class TomatoPizzaDecorator extends PizzaDecorator{
    public TomatoPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void bake() {
        this.pizza.bake();
        System.out.println("Adding tomato toppings!");
    }
}
