package com.gcy.creational.builder;

public class BUilderTest {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder1();
        Director director = new Director(builder);
        Product product = director.constrct();
        product.show();
    }
}
