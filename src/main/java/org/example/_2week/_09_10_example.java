package org.example._2week;
import java.util.Scanner;
public class _09_10_example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Negatif sayı girdiniz");
        } else if (number == 0) {
            System.out.println("0 pozitif bir tam sayıdır.");

        } else {
            if (number % 2 == 0)
                System.out.println("Çift Sayıdır");
            else
                System.out.println("Tek Sayıdır");
            scanner.close();
        }
        ;
    }
}

