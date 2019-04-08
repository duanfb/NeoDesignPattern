package com.neo.duan.observer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.neo.duan.observer.interfaces.Observer;
import com.neo.duan.observer.system.ObservableSystem;
import com.neo.duan.observer.system.ObserverSystem1;
import com.neo.duan.observer.system.ObserverSystem2;

/**
 * @author neo.duan
 * @date 2019/4/6 11:51 AM
 * @desc 请输入文件描述
 */
public class ObserverActivity extends AppCompatActivity {

    public static void start(Context context) {
        Intent starter = new Intent(context, ObserverActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * 系统应用一：
     * ListView中的adapter，notifyDataChange就是使用观察者模式
     *
     * 数据被观察者DataSetObservable
     * DataSetObservable mDataSetObservable = new DataSetObservable()
     *
     * notifyDataChange调用的是mDataSetObservable.change()：遍历里面的观察者Observer调用onChange方法
     * 重新requestLayout，更新用户界面，ListView在测量的时候回调用getView方法获取View
     */

    /**
     * 系统应用二：
     * 广播BroadcastReceiver
     *
     * registerReceiver函数注册到AMS(ActivityManagerService)中，sendBroadcast将
     * 对应广播按照IntentFilter匹配观察者BroadcastReceiver回调
     *
     * ps:包括EventBus等
     */

    /**
     * 自己实现的观察者模式
     */
    private SubjectFor3D subject;
    private Observer observerUser1;
    private Observer observerUser2;
    private void myObserver() {
        subject = new SubjectFor3D();
        observerUser1 = new ObserverUser1(subject);
        observerUser1 = new ObserverUser2(subject);
        subject.setMsg("我改变了，通知大家");
    }

    /**
     * 系统实现的观察者模式
     */
    ObservableSystem observableSystem;
    private void systemObserver() {
        observableSystem = new ObservableSystem();
        new ObserverSystem1(observableSystem);
        new ObserverSystem2(observableSystem);
        observableSystem.setMsg("我改变了，通知大家");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (subject != null) {
            subject.removeObserver(observerUser1);
            subject.removeObserver(observerUser2);
        }

        if (observableSystem != null) {
            observableSystem.deleteObservers();
        }
    }
}
