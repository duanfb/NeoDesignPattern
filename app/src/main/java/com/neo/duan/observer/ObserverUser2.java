package com.neo.duan.observer;

import com.neo.duan.observer.interfaces.Observer;
import com.neo.duan.observer.interfaces.Subject;

/**
 * @author neo.duan
 * @date 2019/4/6 11:59 AM
 * @desc 观察者2
 */
public class ObserverUser2 implements Observer {

    public ObserverUser2(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.print("user2 接收到了通知:" + msg);
    }
}
