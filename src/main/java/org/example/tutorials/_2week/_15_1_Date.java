package org.example.tutorials._2week;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class _15_1_Date {
    public static void dateGetMethod(){
        Date now = new Date();
        //System.out.println("Şu andaki zaman : " + now);
        //System.out.println("1 ocaktan 1970 yılından şimdiye kadar geçen süre milisaniye cinsinden : "+ now.getTime() );
        //System.out.println("Date : " +now.getDate()); // day
        System.out.println("Day : " + now.getDay());
        System.out.println("Month :" + now.getMonth());
        System.out.println("Year:" + (1900 + now.getYear()));  // 1900(Ekle veya Çıkar)
        System.out.println("Date yılı : " + (2025 - now.getYear()));
        System.out.println("Hours:" + now.getHours());
        System.out.println("Minutes:" + now.getMinutes());
        System.out.println("Seconds:" + now.getSeconds());

    };

    public static String newFormat1() throws NullPointerException {
        Date now = new Date();
        String specialFormat = "Şimdiki zaman : "
                .concat(String.valueOf(now.getHours()))
                .concat(":")
                .concat(String.valueOf(now.getMinutes()))
                .concat(":")
                .concat(String.valueOf(now.getSeconds()))
                .toString();
        return specialFormat;
    }

    //Second Method :
    public static String newFormat2() throws NullPointerException {
        Date now = new Date();
        Locale locale = new Locale("tr","TR");
        //%s :string , %d Decimal , %f : Float
        return String.format("Şimdiki zaman : %02d:%02d:%02d ", now.getHours(),now.getMinutes(),now.getSeconds());
    }

        public static String nowFormat3() throws NullPointerException {
            Date now = new Date();
            Locale locale = new Locale("tr", "TR");

            //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss",locale);
            //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss",locale);
            //SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss",locale);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:ss", locale);
            //SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss zzzz",locale);

            String formatedDate = String.format("Şimdiki Zaman: %s", sdf.format(now));
            return new Date().toString() + " - " + formatedDate;
    }


    public static void main(String[] args) {
        //dateGetMethod();
        //String nowDate = newFormat1();
        //System.out.println(newFormat1());
        //newFormat2();
        //System.out.println(newFormat2());
        String nowDate3 = nowFormat3();
        System.out.println(nowDate3);
    }
}
