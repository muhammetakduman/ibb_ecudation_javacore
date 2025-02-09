package org.example._2week;
import java.util.Scanner;
public class CelsiusConvercation {
    public static void main(String[] args) {
        /*
        Santigrat (Celsius) - Fahrenheit Dönüştürücü (Scanner kullanlalım)
        Soru: Kullanıcıdan Santigrat (Celsius) cinsinden sıcaklık alıp Fahrenheit'e çeviren programı yazınız.
        F = RESULT
        c kullanıcıdan alcağız
        */
        int  c , f = 0 , result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen celsius değeri giriniz");
        c = scanner.nextInt();

        result = (c * 9/5) + 32 ;
        System.out.println("Gririlen C :" +c+"\n"+"Dönüştürülen Fahrenheit :"+result);
        scanner.close();

    }
}