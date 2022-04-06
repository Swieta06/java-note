package week2.lastMateri;

import java.util.*;

public class Mapp {
    public static void main(String[] args) {
        //List<Integer>liastInteger=new ArrayList<>();
        Map<String,Integer> map =new HashMap();
        map.put("a",23);
        System.out.println(map.get("a"));
        //key int/value string
        Map<Integer,String>map1=new HashMap<>();
        map1.put(1,"abc");
        map1.put(2,"2abc");
        map1.put(3,"3abc");
        System.out.println(map1.get(1));
        System.out.println(map1.get(2));
        System.out.println(map1.get(3));
        for (String i :map1.values()){
            System.out.println("loop"+i);
        }

        Map<Integer,Object>map3=new HashMap<>();
        map3.put(1,123);
        map3.put(2,"halow");
        System.out.println(map3);
        Map<Integer,Map<Integer,String>>map4=new HashMap<>();
        map4.put(1,map1);
        System.out.println();
        //key stri/value list
        Map<String,List<String>>map6=new HashMap<>();
        List<String>list=new ArrayList<>();
        list.add("admin");
        list.add("admin1");
        list.add("admin2");
        map6.put("nama",list);


    }

}
