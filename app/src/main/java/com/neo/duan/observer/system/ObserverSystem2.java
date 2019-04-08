package com.neo.duan.observer.system;

import java.util.Observable;
import java.util.Observer;

/**
 * @author neo.duan
 * @date 2019/4/6 12:16 PM
 * @desc 请输入文件描述
 */
public class ObserverSystem2 implements Observer {

    public ObserverSystem2(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.print("system2收到更新了：" + arg.toString());
    }
}
