//package com.sdg.composite;
//
///**
// * Created by luoqing.jason on 2016/3/29.
// */
//public class FinanceDepartment extends Company
//{
//    public FinanceDepartment(){}
//    public FinanceDepartment(String name)
//    {
//        super(name);
//    }
//
//    @Override
//    protected void add(Company company) {}
//    @Override
//    protected void remove(Company company) {}
//    @Override
//    protected void display(int depth)
//    {
//        StringBuilder sb = new StringBuilder("");
//        for (int i = 0; i < depth; i++)
//        {
//            sb.append("-");
//        }
//        System.out.println(new String(sb) + this.getName() ) ;
//    }
//}