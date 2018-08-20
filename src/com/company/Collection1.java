package com.company;

import java.util.*;

public class Collection1 {
    public static void main(String[] args) {
     List<String> list=new ArrayList();
     list.add("q");
     list.add("w");
        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
       List<String> list1=new LinkedList();
       list1.add("e");
       list1.add("b");
       Iterator<String> iterator1=list1.iterator();
       while (iterator1.hasNext()){
           System.out.println(iterator1.next());
       }
        Map<String,String> map=new HashMap<>();
        map.put("1","yi");
        map.put("1","er");


    }
}
