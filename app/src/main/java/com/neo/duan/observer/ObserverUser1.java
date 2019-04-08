package com.neo.duan.observer;

import com.neo.duan.observer.interfaces.Observer;
import com.neo.duan.observer.interfaces.Subject;

/**
 * @author neo.duan
 * @date 2019/4/6 11:59 AM
 * @desc 观察者1
 */
public class ObserverUser1 implements Observer {

    public ObserverUser1(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.print("user1 接收到了通知：" + msg);
    }
}
