package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collections;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        return Collections.max(this.arrayList);
//        throw new NotImplementedException();
    }

    public double getMinimum() {
        return Collections.min(this.arrayList);
//        throw new NotImplementedException();
    }

    public double getAverage() {
        double Sum = 0;
        for (Integer i:this.arrayList){
            Sum = Sum + i;
        }
        return Sum/this.arrayList.size();
//        throw new NotImplementedException();
    }

    public double getOrderedMedian() {
        if (this.arrayList.size()%2 ==0){
            return ((double)this.arrayList.get(this.arrayList.size()/2-1) + (double)this.arrayList.get(this.arrayList.size()/2))/2;
        }else {
            return this.arrayList.get(this.arrayList.size()/2);
        }
//        throw new NotImplementedException();
    }

    public int getFirstEven() {
        for (Integer i:this.arrayList){
            if (i%2 ==0){
                return i;
            }
        }
        return 0;
//        throw new NotImplementedException();
    }

    public int getIndexOfFirstEven() {
        for (int i = 0; i <this.arrayList.size() ; i++) {
            if (this.arrayList.get(i)%2 == 0){
                return  i;
            }
        }
        return  -1;
//        throw new NotImplementedException();
    }

    public boolean isEqual(List<Integer> arrayList) {
        if (this.arrayList.size() != arrayList.size()){
            return false;
        }
        for (int i = 0; i <this.arrayList.size() ; i++) {
            if (this.arrayList.get(i) != arrayList.get(i)){
                return false;
            }
        }
        return true;
//        throw new NotImplementedException();
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink singleLink) {
        int l = singleLink.size();
        if (l ==0){
            return 0.0;
        }
        if (l%2 ==0){
            Double node = (Double)singleLink.getNode(l/2);
            Double node2 = (Double)singleLink.getNode((l/2)-1);
            System.out.print((node + node2)/2);
            return (node + node2)/2;
        }else{
            Double node = (Double)singleLink.getNode(l/2);
            System.out.print(node);
            return node;
        }
//        throw new NotImplementedException();
    }

    public int getLastOdd() {
        int n = -1;
        for (int i = 0; i <this.arrayList.size() ; i++) {
            if (this.arrayList.get(i)%2 == 1){
                n = i;
            }
        }
        return  this.arrayList.get(n);
//        throw new NotImplementedException();
    }

    public int getIndexOfLastOdd() {
        int index = -1;
        for (int i = 0; i <this.arrayList.size() ; i++) {
            if (this.arrayList.get(i)%2 == 1){
                index = i;
            }
        }
        return  index;
//        throw new NotImplementedException();
    }
}
