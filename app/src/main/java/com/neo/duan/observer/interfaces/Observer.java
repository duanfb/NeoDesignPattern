package com.neo.duan.observer.interfaces;

/**
 * @author neo.duan
 * @date 2019/4/6 11:58 AM
 * @desc 观察者必须实现的接口
 */
public interface Observer {

    void update(String msg);
}
