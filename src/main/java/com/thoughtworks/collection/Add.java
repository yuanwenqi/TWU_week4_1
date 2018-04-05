package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int s = 0;
        for (int i = leftBorder; i < rightBorder+1; i++) {
            if (i%2 == 0){
                s += i;
            }
        }
        return  s;
//        throw new NotImplementedException();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int s = 0;
        for (int i = leftBorder; i < rightBorder+1; i++) {
            if (i%2 == 1){
                s += i;
            }
        }
        return  s;
//        throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int s=0;
        for (Integer i:arrayList){
            s += i*3+2;
        }
        return  s;
//        throw new NotImplementedException();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        for (int i = 0; i <arrayList.size() ; i++) {
            int e = arrayList.get(i);
            if (e%2 ==1){
                e = e*3+2;
                arrayList.set(i,e);
            }
        }
        return  arrayList;
//        throw new NotImplementedException();
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int s = 0;
        for (Integer i:arrayList){
            if (i%2 ==1){
                s += i*3+5;
            }
        }
        return  s;
//        throw new NotImplementedException();
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
//        List<Integer> rs = new ArrayList<Integer>();
        Collections.sort(arrayList);
        return  arrayList.get(arrayList.size()/2);
//        throw new NotImplementedException();
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        int c = 0;
        int s = 0;
        for (Integer i:arrayList){
            if (i%2 == 0){
                s += i;
                c += 1;
            }
        }
        return  s/c;
//        throw new NotImplementedException();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        for (Integer i:arrayList){
            if (i%2 ==0 && i==specialElment){
                return  true;
            }
        }
        return  false;
//        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
//        for(Integer i:arrayList){
//            if(i%2 == 1)
//        }
        throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (Integer i:arrayList){
            if (i%2 == 0){
                even.add(i);
            }else {
                odd.add(i);
            }
        }
        Collections.sort(odd);
        Collections.sort(even);
        for (Integer i:odd){
            even.add(i);
        }
        return  even;
//        throw new NotImplementedException();
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> rs = new ArrayList<>();
        for (int i = 0; i <arrayList.size()-1; i++) {
            rs.add((arrayList.get(i)+arrayList.get(i+1))*3);
        }
        return rs;
//        throw new NotImplementedException();
    }
}
