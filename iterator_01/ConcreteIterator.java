//package com.sdg.iterator;
//
//import java.util.Vector;
//
///**
// * Created by luoqing.jason on 2016/3/29.
// */
//public class ConcreteIterator implements Iterator
//{
//    private int currentIndex = 0;
//    private Vector vector = null;
//
//    public ConcreteIterator(final Vector vector)
//    {
//        this.vector = vector;
//    }
//
//    @Override
//    public Object first()
//    {
//        currentIndex = 0;
//        return vector.get(currentIndex);
//    }
//
//    @Override
//    public Object next()
//    {
//        currentIndex++;
//        return vector.get(currentIndex);
//    }
//
//    @Override
//    public Object currentItem()
//    {
//        return vector.get(currentIndex);
//    }
//
//    @Override
//    public boolean isDone()
//    {
//        if (currentIndex >= this.vector.size() - 1)
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }
//    }
//}
