package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> rs = new ArrayList<>();
        if (left>right){
            for (int i = left; i >= right; i-- ) {
                rs.add(i);
            }
        }else {
            for (int i = left; i <= right; i++ ) {
                rs.add(i);
            }
        }
        return  rs;
//        throw new NotImplementedException();
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> rs = new ArrayList<>();
        if (left>right){
            for (int i = left; i >= right; i-- ) {
                if (i%2 == 0){
                    rs.add(i);
                }
            }
        }else {
            for (int i = left; i <= right; i++ ) {
                if (i%2 == 0){
                    rs.add(i);
                }
            }
        }
        return  rs;
//        throw new NotImplementedException();
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> rs = new ArrayList<>();
        for (Integer i:array){
            if (i%2==0){
                rs.add(i);
            }
        }
        return rs;
//        throw new NotImplementedException();
    }

    public int popLastElment(int[] array) {
        return array[array.length];
//        throw new NotImplementedException();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
            List<Integer> rs = new ArrayList<>();
            for (int i:firstArray){
                for(int j:secondArray){
                    if(firstArray[i] == secondArray[j]){
                        rs.add(firstArray[i]);
                    }
                }
            }
            return  rs;
//        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> rs = new ArrayList<>();
        for (int i:firstArray){
            for(int j:secondArray){
                if(firstArray[i] == secondArray[j]){
                    rs.add(firstArray[i]);
                }
            }
        }
        return  rs;
//        throw new NotImplementedException();
    }
}
