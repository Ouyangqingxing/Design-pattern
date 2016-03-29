//package com.sdg.memento;
//
///**
// * Created by luoqing.jason on 2016/3/29.
// */
//public class Test
//{
//    public static void main(String[] args){
//        Originator originator = new Originator();
//        originator.setState("Running");
//        System.out.println("初始状态:"+originator.getState());
//        Caretaker caretaker = new Caretaker();
//        caretaker.setMemento(originator.createMemento());
//        originator.setState("Paused");
//        System.out.println("改变后状态:"+originator.getState());
//        originator.restoreMemento(caretaker.getMemento());
//        System.out.println("恢复后状态:"+originator.getState());
//    }
//}
