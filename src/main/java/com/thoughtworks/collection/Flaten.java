package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> rs = new ArrayList<>();
        for (Integer[] i:this.array){
            for(Integer j:i){
                rs.add(j);
            }
        }
        return  rs;
//        throw new NotImplementedException();
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> rs = new ArrayList<>();
        for (Integer[] i:this.array){
            for(Integer j:i){
                if (rs.contains(j) == false){
                    rs.add(j);
                }
            }
        }
        return  rs;
//        throw new NotImplementedException();
    }
}
