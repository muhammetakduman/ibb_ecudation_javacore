package org.example.tutorials._2week;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class _16_1Array {

    public static String[] arrayMethod1() throws ArrayIndexOutOfBoundsException {
        String[] city = new String[6];
        city[0] = "Eruzurum";
        city[1] = "Van";
        city[2] = "Dadas";
        city[3] = "Elazig";
        city[4] = "İzmir";
        city[5] = "istanbul";
        //System.out.println(city);
        //System.out.println("Eleman sayısı: "+city.length);
        //System.out.println(city[0]);
        System.out.println("Son eleman : "+city[5]);
        return city;
    }
    public static String[] arrayMethod2() throws ArrayIndexOutOfBoundsException{
        //string dizi
        String[] city = {"Malatya", "Elazığ", "Bingöl", "Muş", "Van","İstanbul","Ankara","Sivas","Konya","Nevşehir"};
        return  city;
    }

    public static void arrayMethod3(){
        String[] city = arrayMethod2();
        //for each
        for (int i = 0; i < city.length; i++) {
            System.out.println(city[i]);
        }
    }

    public static void arrayMethod4(String[] args) {
        String[] city = arrayMethod2();
        //for each
        for (String temp : city){
            System.out.println(temp);
        }
    }

    public static void arrayMethod5() {
        String[] city = arrayMethod2();

        // Dizilerde Sıralama (Küçükten Büyüğe Doğru sıralama)
        Arrays.sort(city);

        // for each
        for (String temp : city) {
            System.out.println( temp);
        }
    }
    public static void arrayMethod6(){
        String[] city = arrayMethod2();
        Arrays.sort(city, Collections.reverseOrder());

        for (String temp : city){
            System.out.println(temp);
        }
    }
    public static void arrayMethod7(){
        String[] originalCity = arrayMethod2();
        //clone
        String[] cloneCity = Arrays.copyOf(originalCity,originalCity.length);

        //kucukten büyügr
        Arrays.sort(cloneCity);
        for (String temp : cloneCity){
            System.out.println(temp);
        }
        //Binary Search
        String searchCity = "Sivas";
        int index = Arrays.binarySearch(cloneCity,searchCity);
        if(index > 0){
            System.out.println(searchCity + "İli bulunmaktadır");
        } else {
            System.out.println(searchCity + "İli arrayimizde yoktur.");
        }
    }
    public static int randomNumber() {
        Random random = new Random();
        int rndInt = random.nextInt(9) + 1; // 1<=NUMBER<=9
        return rndInt;
    }
    // fill:
    public static void arrayMethod8() {
        int[] number = new int[7];

        //fill: metodu tek bir değeri dizinin tüm elemanlarına atamak için tasarlanmıştır
        Arrays.fill(number, randomNumber());

        // iterative for ile her defasında farklı bir sayı gelsin
        for (int i = 0; i <number.length ; i++) {
            //number[i]=randomNumber(); // (1.YOL)
            Arrays.setAll(number, data -> randomNumber()); // (2.YOL)
        }

        // for each
        for (int temp : number) {
            System.out.println( temp );
        }
    }

    //RANDOM NUMBER ATAMAK

    //psvm
    public static void main(String[] args) {
        //arrayMethod1();
        //arrayMethod2();
        //arrayMethod3();
        //arrayMethod4();
        //arrayMethod5();
        //arrayMethod6();
        //arrayMethod7();
        arrayMethod8();

    }

}//endclass
