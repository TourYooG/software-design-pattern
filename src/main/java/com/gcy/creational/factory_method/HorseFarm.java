package com.gcy.creational.factory_method;

public class HorseFarm implements AnimalFarm{
    @Override
    public Animal newAnimal() {
        return new Horse();
    }
}
