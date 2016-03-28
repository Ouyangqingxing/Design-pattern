package com.sdg.observer;

/**
 * Created by luoqing.jason on 2016/3/28.
 */
public class ConcreteObserver implements Observer
{
    private String name = "Jack";

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public ConcreteObserver(String name)
    {
        this.name = name;
    }
    @Override
    public void update(String str)
    {
        System.out.println(this.name + " gets the message : " + str);
    }
}