package com.yanghao.design.behavioralModel.ObserverPattern;

import com.yanghao.design.behavioralModel.ObserverPattern.observer.F_Observer;
import com.yanghao.design.behavioralModel.ObserverPattern.observer.S_Observer;
import com.yanghao.design.behavioralModel.ObserverPattern.observer.T_Observer;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/24 14:38
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        F_Observer fObserver = new F_Observer();
        S_Observer sObserver = new S_Observer();
        T_Observer tObserver = new T_Observer();
        Subject subject = new Subject();
        subject.addAttach(fObserver);
        subject.addAttach(sObserver);
        subject.addAttach(tObserver);
        subject.setMsg("msg change");
    }
}
