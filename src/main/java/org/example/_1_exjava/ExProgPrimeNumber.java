package org.example._1_exjava;
import java.util.Scanner;
public class ExProgPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Sayı Girin :");
        int numValue = scanner.nextInt();

        if (asal(numValue)){
            System.out.println(numValue + "bir asal sayıdır");

        } else {
            System.out.println(numValue + "asal değildir");
        }
    }
    public static boolean asal(int num) {
        if(num < 2 ) return false;
        for (int i = 2; i * i  <= num ; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
