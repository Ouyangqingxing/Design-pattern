//package com.sdg.iterator;
//
//import java.util.Vector;
//
///**
// * Created by luoqing.jason on 2016/3/29.
// */
//public class ConcreteAggregat implements Aggregat
//{
//    private Vector vector = null;
//
//    public Vector getVector()
//    {
//        return vector;
//    }
//
//    public void setVector(final Vector vector)
//    {
//        this.vector = vector;
//    }
//
//    public ConcreteAggregat()
//    {
//        vector = new Vector();
//        vector.add("vector 1");
//        vector.add("vector 2");
//    }
//
//    @Override
//    public ConcreteIterator createIterator()
//    {
//        return new ConcreteIterator(vector);
//    }
//}
