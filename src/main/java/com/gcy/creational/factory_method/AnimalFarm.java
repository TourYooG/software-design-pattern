package com.gcy.creational.factory_method;

/**
 * 定义一个创建产品对象的工厂接口，将产品的实际创建交给子类工厂
 *
 * 应用场景
 * 只知道创建产品的工厂名，不知道具体产品名
 * 创建对象的任务由多个具体子工厂中的某一个完成，而抽象工厂只提供创建产品的接口
 * 客户不关心创建产品的细节，只关心产品的品牌
 */
public interface AnimalFarm {
    Animal newAnimal();
}
