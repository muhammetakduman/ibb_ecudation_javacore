package org.example._1_exjava;
import java.util.Scanner;

public class _08_scanner {
    public static void main(String[] args) {

        String name,surname,language;

        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Lütfen Adınzı Giriniz");
        name = Keyboard.nextLine();

        System.out.println("Lütfen Soyadınızı giriniz" );
        surname = Keyboard.nextLine();

        System.out.println("Bildiğiniz Diller Nelerdir ?");

        language = Keyboard.nextLine();
        System.out.println("Adınız :"+name+ "Soyadınız:"+surname+"Diller" +language);

    }
}
