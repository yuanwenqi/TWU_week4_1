package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> rs = new ArrayList<>();
        for(Integer i:this.array){
            rs.add(i*3);
        }
        return  rs;
            //        throw new NotImplementedException();
    }

    public List<String> mapLetter() {
        List<String> rs = new ArrayList<>();
        for(Integer i:this.array){
            rs.add(letterList.get(i-1));
        }
        return rs;
//
//  throw new NotImplementedException();
    }

    public List<String> mapLetters() {
        List<String> rs = new ArrayList<>();
        for(Integer i:this.array){
            String s = "";
            while (i>0){
                int yu = i%26;
                i = i/26;
                if (yu == 0){
                    s = letterList.get(25)+s;
                    i -= 1;
                }else {
//                    System.out.print(yu);
                    s = letterList.get(yu-1)+s;
                }
            }

            rs.add(s);
        }
        return rs;
//        throw new NotImplementedException();
    }

    public List<Integer> sortFromBig() {
        Collections.sort(this.array);
        Collections.reverse(this.array);
        return  this.array;
//        throw new NotImplementedException();
    }

    public List<Integer> sortFromSmall() {
        Collections.sort(this.array);
        return this.array;
//        throw new NotImplementedException();
    }
}
