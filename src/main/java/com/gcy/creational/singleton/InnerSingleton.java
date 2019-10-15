package com.gcy.creational.singleton;

/**
 * 只用第一次调用getInstance方法的时候，JVM才会去加载InnerClass并初始化instance
 * 只有一个线程可以获取对象的初始化锁，其他线程无法进行初始化保证对象的唯一性
 * 初始化（将变量赋值为默认值）
 */
public class InnerSingleton {
    
    private InnerSingleton(){}

    public static InnerSingleton getInstance(){
        return    InnerClass.innerSingleton;
    }

    private static class InnerClass{
        private static final InnerSingleton innerSingleton = new InnerSingleton();


    }
}
