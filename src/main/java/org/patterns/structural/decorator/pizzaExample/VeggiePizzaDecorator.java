package org.patterns.structural.decorator.pizzaExample;

public class VeggiePizzaDecorator extends PizzaDecorator{
    public VeggiePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void bake() {
        pizza.bake();
        System.out.println("Adding veggie toppings!");
    }
}
