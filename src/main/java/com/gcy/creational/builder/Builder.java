package com.gcy.creational.builder;

/**
 * 建造者模式：将一个复杂对象的构造与它的表示分离，使用同样的构建过程可以创建不同的表示。
 * 应用场景：建造者模式创建的是复杂对象，其产品的各个部分经常面临剧烈变化，但将它们组合在一起的算法却相对稳定
 *  ·创建的对象比较复杂，由多个部件构成，各个部件面临着复杂的变化，但是构件间的建造顺序是稳定的
 *  ·创建复杂对象的算法独立于改对象的组成部分已经它们的装配方式，产品的构建过程和最终表示是独立的
 * 如果创建的产品种类只有一种，只需要一个具体构建者，这时候可以省略掉建造者，甚至可以省略掉指挥长
 */
public abstract class Builder {
    public void buildPartA(){}
    public void buildPartB(){}
    public void buildPartC(){}

    protected Product product = new Product();

    public Product getResult(){
        return  product;
    }

}
