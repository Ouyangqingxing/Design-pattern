//package com.sdg.composite;
//
///**
// * Created by luoqing.jason on 2016/3/29.
// */
//public class Test
//{
//    public static void main(String[] args)
//    {
//        Company root = new ConcreteCompany();
//        root.setName("Beijing headquarters");
//        root.add(new HRDepartment("Headquarters HR Department"));
//        root.add(new FinanceDepartment("Headquarters Finance Department"));
//        Company shandongCom = new ConcreteCompany("Shandong Branch ");
//        shandongCom.add(new HRDepartment("Branch HR Department"));
//        shandongCom.add(new FinanceDepartment("Branch Finance Department"));
//        root.add(shandongCom);
//        root.display(0);
//    }
//}