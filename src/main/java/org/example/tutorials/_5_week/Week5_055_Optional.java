package org.example.tutorials._5_week;

import lombok.Getter;
import lombok.Setter;




public class Week5_055_Optional {
    public String getName(String data) {
        if (data.isEmpty() || data==null){
            return data;
        } else {
            return "Unknow";
        }
    }

    public static void main(String[] args) {
        Week5_055_Optional week5055Optional = new Week5_055_Optional();
        String result = week5055Optional.getName(" ");
        System.out.println(result);

    }

}
