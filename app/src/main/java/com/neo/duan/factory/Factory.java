package com.neo.duan.factory;

/**
 * @author neo.duan
 * @date 2019/4/6 4:50 PM
 * @desc 抽象工厂类
 */
public abstract class Factory {

    /**
     * 简单抽象工厂
     * @return
     */
    public abstract  Product createProduct();

    /**
     * 抽象工厂方法：根据class类型具体生产什么，让子类实现
     * @param clz
     * @param <T>
     * @return
     */
    public abstract <T extends Product> T createProduct(Class<T> clz);
}
