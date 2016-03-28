package com.sdg.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luoqing.jason on 2016/3/28.
 */
public class ConcreteSubject implements Subject
{
    // 存放观察者
    private List<Observer> list = new ArrayList<Observer>();

    @Override
    public void addObserver(Observer observer)
    {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer)
    {
        list.remove(observer);
    }

    @Override
    public void notifyObservers(String str)
    {
        // 自动调用实际上是主题进行调用的
        for (Observer observer : list)
        {
            observer.update(str);
        }
    }
}
