package com.gcy.creational.builder;

public class Director {
    private Builder builder;
    
    public Director(Builder builder){
        this.builder=builder;
    }

    public Product constrct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return    builder.getResult();
    }
}
