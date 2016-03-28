package com.sdg.adapter;

/**
 * Created by luoqing.jason on 2016/3/28.
 */
public class Test
{
    public static void main(String[] args)
    {
        Target adapter = new Adapter();
        adapter.request(200);
        adapter.request("Jason200");

    }
}
