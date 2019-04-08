package com.neo.duan.observer.system;

import java.util.Observable;

/**
 * @author neo.duan
 * @date 2019/4/6 12:18 PM
 * @desc 请输入文件描述
 */
public class ObservableSystem extends Observable {


    public void setMsg(String msg) {
        //状态标识发送变化
        setChanged();
        //通知所有观察者
        notifyObservers(msg);
    }
}
