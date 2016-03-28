package com.sdg.observer;

/**
 * Created by luoqing.jason on 2016/3/28.
 */
public interface Subject
{
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(String str);
}
