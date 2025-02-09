package org.example._2week;
import java.util.Scanner;
public class ExProgramFact {
    public static void main(String[] args) {
        int n,c , fact = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Faktöriyeli Hesaplanacak Değeri Giriniz :");
        n = scanner.nextInt();
        if ( n < 0 )
            System.out.println("Negatif değer olamaz...");
        else{
            for ( c = 1; c <= n; c++) {
                fact = fact*c;
                System.out.println("Factorial of"+c+"is = "+fact);

            }
        }
    }
}
