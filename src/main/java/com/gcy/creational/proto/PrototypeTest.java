package com.gcy.creational.proto;

/**
 * 定义：用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或者相似的新对象
 *
 * 应用场景
 *  对象之间相同或者相似，即只有几个属性不同的时候
 *  对象的创建过程比较麻烦，但是复制比较简单的时候
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype realizetype1 = new Realizetype();
        Realizetype realizetype2 = (Realizetype)realizetype1.clone();
        System.out.println(realizetype1==realizetype2);
    }
}
