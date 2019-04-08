package com.neo.duan.observer.interfaces;

/**
 * @author neo.duan
 * @date 2019/4/6 12:00 PM
 * @desc 专题接口，所有专题必须实现的接口,相当于Observable被观察者
 */
public interface Subject {

    /**
     * 注册一个观察者
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除一个观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知所有观察者
     */
    void notifyObservers();
}
