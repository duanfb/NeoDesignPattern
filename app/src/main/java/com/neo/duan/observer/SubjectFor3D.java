package com.neo.duan.observer;

import com.neo.duan.observer.interfaces.Observer;
import com.neo.duan.observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author neo.duan
 * @date 2019/4/6 12:06 PM
 * @desc 请输入文件描述
 */
public class SubjectFor3D implements Subject {

    /**
     * 存储观察者
     */
    private List<Observer> observers = new ArrayList<>();

    private String msg;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }

    public void setMsg(String msg) {
        this.msg = msg;
        notifyObservers();
    }
}
