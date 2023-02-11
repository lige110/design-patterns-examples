package org.patterns.SOLID.OpenClose;

public class Product {

    private final String name;
    private final Color color;

    private final Size size;

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    public Product(String name, Color color, Size size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", size=" + size +
                '}';
    }
}


enum Color{
    GREEN, RED, BLUE
}

enum Size{
    SMALL, LARGE, XLARGE
}