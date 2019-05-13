package com.codingblocks.lecture_31;

import java.util.HashMap;
import java.util.Map;

public class DefaultMap {
    public static void main(String[] args) {
//        MapWithAL<String, String> map = new MapWithAL<>();
//
//        map.put("apple", "a sweet red fruit");
//        map.put("mango", "king of fruits");
//        map.put("grapes", "daaru daaru daaru");
//
//        System.out.println(map.get("apple"));
//        System.out.println(map.get("grapes"));
//
//        map.put("grapes", "angoor khatte hai");
//        System.out.println(map.get("grapes"));
//
//        map.remove("apple");
//
//        System.out.println(map.get("apple"));
//
//        Object ob = new Object();
//
//        System.out.println(ob.hashCode());


        HashTable<Integer, Integer> map = new HashTable<>();

        for (int i = 0; i < 1000000; i++) {
            map.put(i, i);
        }



    }
}
