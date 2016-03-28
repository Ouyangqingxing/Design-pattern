package com.sdg.adapter;

/**
 * Created by luoqing.jason on 2016/3/28.
 */
public class ConcreteTarget implements Target
{
    public void request(int num)
    {
        System.out.println("The new system gets a int parameter and this number now is : "+num);
    }
    public void request(String str)
    {
        System.out.println("The new system gets a String parameter and this String now is : "+str);
    }
}
