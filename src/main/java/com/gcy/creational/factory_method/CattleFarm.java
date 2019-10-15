package com.gcy.creational.factory_method;

public class CattleFarm implements AnimalFarm {
    @Override
    public Animal newAnimal() {
        return new Cattle();
    }
}
