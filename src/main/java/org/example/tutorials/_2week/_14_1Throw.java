package org.example.tutorials._2week;

import java.io.IOException;
import java.util.Scanner;

public class _14_1Throw {
    public static void calcula(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 , number2;
        System.out.println("İlk değeri giriniz");
        number1 = scanner.nextInt();
        System.out.println("2. değeri giriniz");
        number2 = scanner.nextInt();

        try {
            int result = number1/number2;
            System.out.println(result);
        } catch (ArithmeticException ai) {
            ai.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("kesinlikle burdaki methodlar çalışacak");
            scanner.close();
        }
        System.out.println("son 10.000 satır");
    }

    public static void main(String[] args) throws IOException {
        calcula(args);
        System.out.println("###########################");

        throw new NullPointerException("Neden boş verdiniz.");
    }
}
