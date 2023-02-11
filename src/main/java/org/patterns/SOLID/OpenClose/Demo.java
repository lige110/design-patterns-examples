package org.patterns.SOLID.OpenClose;

import java.util.List;
import java.util.function.Predicate;

public class Demo {

    public static void main(String[] args) {
        Filter<Product> productFilter = new Filter<>();
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product TV = new Product("TV", Color.RED, Size.LARGE);
        Product car = new Product("car", Color.RED, Size.XLARGE);
        Product haha = new Product("haha", Color.RED, Size.LARGE);

        List<Product> items = List.of(apple, TV, car);


        Predicate<Product> p = (item) -> item.getColor() == Color.GREEN;

        productFilter.doFilter(items, p).forEach(System.out::println);
    }
}
