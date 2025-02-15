package org.example._2week;

import java.util.Formatter;
//s
//d
//f

public class _12_2_StringFormat {
    public static void formatter1() {
        Formatter formatter = new Formatter();
        formatter.format("Merhaba adınız :%s , T.C : %d, Price : %f" , "Muhammet",425741745,25.25);
        System.out.println(formatter);
        formatter.close();
    }



    //best practice
    public static void formatter2() {
        String formatterString = String.format("Merhaba adınız :%s , T.C : %d, Price : %f" , "Muhammet",425741745,25.25);
        System.out.println(formatterString);

    }
    public static void main(String[] args) {
        //formatter1();
        formatter2();
    }

}
