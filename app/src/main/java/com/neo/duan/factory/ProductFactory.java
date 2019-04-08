package com.neo.duan.factory;

/**
 * @author neo.duan
 * @date 2019/4/6 4:50 PM
 * @desc 具体的工厂类
 */
public class ProductFactory extends Factory {

    @Override
    public Product createProduct() {
        //默认生产产品A
        return new ProductA();
    }

    /**
     * 生产具体的类，通过反射获取类
     * @param clz
     * @param <T>
     * @return
     */
    @Override
    public <T extends Product> T createProduct(Class<T> clz) {
        Product product = null;
        try {
            product = (Product) Class.forName(clz.getName()).newInstance();
        } catch (IllegalAccessException | ClassNotFoundException | InstantiationException e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
