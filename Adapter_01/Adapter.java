package com.sdg.adapter;

/**
 * Created by luoqing.jason on 2016/3/28.
 */
public class Adapter extends Adaptee implements Target
{
    @Override
    public void request(int num)
    {
        super.specificRequest(num+"");
    }
    @Override
    public void request(String str)
    {
        super.specificRequest(str);
    }
}
