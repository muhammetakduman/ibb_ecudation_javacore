package org.example.tutorials._5_week;

import java.util.HashMap;
import java.util.Map;

public class Week5_110_MapData {
    private static void hashMapData(){
        Map<String , String> frontendList = new HashMap<>();
        frontendList.put("1","html5");
        frontendList.put("2","css3");
        frontendList.put("3","js");

        for (String key : frontendList.keySet()){
            System.out.println(key+ " ");
        }
        for (String value : frontendList.values()){
            System.out.println(value + " ");
        }

        //key-value

        // KEY-VALUE
        for(String key:frontendList.keySet()){
            System.out.println(key+" => "+frontendList.get(key));
        }
        System.out.println(frontendList.get("1"));
        System.out.println("Size :" + frontendList.size());
        System.out.println("hashCode :" + frontendList.hashCode());
        System.out.println("toString :" + frontendList.toString().toUpperCase());
        System.out.println(" containsKey :" + frontendList.containsKey("1"));
        System.out.println("containsValue :" + frontendList.containsValue("css3"));
        System.out.println("** entrySet().forEach**");
        frontendList.entrySet().forEach((temp) -> {
            System.out.println(temp);
        });
        System.out.println("** Map.Entry<String , String>**");
        for (Map.Entry<String ,String> temp : frontendList.entrySet()){
            System.out.println(temp);
        }
    }

    public static void main(String[] args) {
        hashMapData();
    }
}
