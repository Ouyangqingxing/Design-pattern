package com.sdg.adapter;

/**
 * Created by luoqing.jason on 2016/3/28.
 */
public class Adaptee
{
    public void specificRequest(String str)
    {
        System.out.println("This old system gets a String parameter and this string now is : "+str);
    }
}
