package org.example._2week;

import java.util.Formatter;

import static java.awt.Color.BLUE;


/*
 Garbarage Collectors:
 Yalnızca ama yalnızca kapalı olmayan dosya, scanner, formatter vb yapılarda otomatik kapanmaz eğer biz bunu manuel olarak kapatmazsak bu kapatılmayan nesneyi temizleyebilir ancak açık olan dosyayı kapatmazsak cache belleği kullanmaya devam eder.
*/
// Formatter
// s
// d
// f
public class _12_2_StringFormat {

    // formatter1
    public static void formatter1() {
        // Eğer new Formatter yazarsak close() ile manuel kapatmak zorundayız.
        Formatter formatter = new Formatter();
        formatter.format("Merhabalar Adınız: %s, T.C: %d, Fiyat: %f ", "mami", 11223344, 44.23);
        System.out.println(formatter);
        formatter.close(); // Belleği serbest bırakma
    }

    // formatter2 (Best Practice)
    public static void formatter2() {
        // Eğer String.format() yazarsak kapatmak zorunda değiliz GC(Garbarage Collector) otomatik çalışır
        String formatterString = String.format("Merhabalar Adınız: %s, T.C: %d, Fiyat: %f ", "mami", 11223344, 44.23);
        System.out.println(formatterString);
    }

    // formatter (Best Practice)
    public static void formatter3() {
        String formatterString = String.format("Merhabalar Adınız: %s, T.C: %d, Fiyat: %f ", "mami", 11223344, 44.23);
        System.out.println(formatterString);
    }

    // formatter4
    public static void formatter4() {
        String name = "mami";
        int tcNumber = 11223344;
        double price = 44.23;
        System.out.printf("Merhabalar Adınız: %s, T.C: %d, Fiyat: %f ", name, tcNumber, price);
        System.out.println();
        System.out.printf(BLUE+"Merhabalar Adınız: %10s, T.C: %d, Fiyat: %f ", name, tcNumber, price); //%10s: Sağdan 10 karakter genişliğinde
        System.out.println();
        System.out.printf("%-15s %-15d %.3f ", name, tcNumber, price);//%-15s: Sola doğru yasla
    }

    public static void main(String[] args) {
        // formatter1();
        //formatter2();
        //formatter3();
        formatter4();
    }
}