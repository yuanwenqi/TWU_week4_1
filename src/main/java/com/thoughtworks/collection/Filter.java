package com.thoughtworks.collection;

import org.apache.commons.collections.functors.FalsePredicate;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> rs = new ArrayList<>();
        for(Integer i:this.array){
            rs.add(i);
        }
        return rs;
//        throw new NotImplementedException();
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> rs = new ArrayList<>();
        for(Integer i:this.array){
            if (i%3 == 0){
                rs.add(i);
            }
        }
        return rs;
//        throw new NotImplementedException();
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
      List<Integer> rs = new ArrayList<>();
        for(Integer i:firstList){
            if (secondList.contains(i)){
                rs.add(i);
            }
        }
        return  rs;
// throw new NotImplementedException();
    }

    public List<Integer> getDifferentElements() {
        List<Integer> rs = new ArrayList<>();
        for(Integer i:this.array){
            if (rs.contains(i) == false){
                rs.add(i);
            }
        }
        return  rs;
//        throw new NotImplementedException();
    }
}