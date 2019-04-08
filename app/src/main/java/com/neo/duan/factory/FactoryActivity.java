package com.neo.duan.factory;

import android.app.AlarmManager;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import com.neo.duan.R;

import java.util.ArrayList;
import java.util.List;

/**
 * @author neo.duan
 * @date 2019/4/6 4:44 PM
 * @desc 请输入文件描述
 */
public class FactoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * 简单工厂类，或可通过  类.静态方法
     */
    private void simpleFactory() {
        Factory factory = new ProductFactory();
        Product product = factory.createProduct();
        product.doSomething();
    }

    /**
     * 通过class类型反射获取具体
     */
    private void abstractFactory() {
        ProductA productA = new ProductFactory().createProduct(ProductA.class);
        ProductB productB = new ProductFactory().createProduct(ProductB.class);
    }

    /**
     * Android源码中的工厂方法实现
     *
     * List  Set集合中的迭代器Iterator
     *
     * 工厂模式，不一定是一定要以Factory命名等，
     * 只要通过某个方法调用获取一个对象即可理解为一个工厂模式
     * Android中onCreate方法，
     *
     * AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
     *
     */

    private void method() {
        List<String> list = new ArrayList<>();
        list.iterator();

        AlarmManager alarmManager = (AlarmManager) this.getSystemService(Context.ALARM_SERVICE);
        LayoutInflater.from(this).inflate(R.layout.activity_main, null);
    }
}
