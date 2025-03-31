package a0331.sort;

import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
        tm.put(30, "삼십");
        tm.put(40, "사십");
        tm.put(10, "십");
        tm.put(20, "이십");

        System.out.println("키: "+tm.keySet());
        for(Integer key:tm.keySet()){
            System.out.printf("키: %s, 값: %s\n", key, tm.get(key));
        }

        TreeMap<Integer, String> tm1=new TreeMap<Integer, String>();
        tm1.put(30, "ㄷㄷㄷ");
        tm1.put(20, "ㄴㄴㄴ");
        tm1.put(10, "ㄹㄹㄹ");
        tm1.put(40, "ㄱㄱㄱ");
        System.out.println("키: "+tm1.keySet());
        for(Integer key:tm1.keySet()){
            System.out.printf("키: %s, 값: %s\n", key, tm1.get(key));
        }

    }
}
