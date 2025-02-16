package org.example._2week;

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

    public static void main(String[] args) {
        dateGetMethod();
    }
}
