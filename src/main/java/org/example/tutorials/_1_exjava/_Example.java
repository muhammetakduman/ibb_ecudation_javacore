package org.example.tutorials._1_exjava;
import java.util.Scanner;

public class _Example {
    public static void main(String[] args) {


        //verable
        double a,b = 0,result;
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Lütfen Bir a Değeri girin:"
        );
        a = scanner.nextDouble();

        System.out.println(
                "Lütfen Bir b Değeri giriniz"
        );
        b = scanner.nextDouble();

        //ax+b=0 x=-b/a
        result = (a/b);;
        System.out.println("a değeri : " + a + "b değeri" + b + "Sonuç :" +result);
        scanner.close();
     }



}
