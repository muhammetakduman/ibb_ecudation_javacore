package org.example.tutorials._5_week;


import java.util.function.Consumer;

class Printer {
    static void printMessage(String message){
        System.out.println(message);
    }
}

public class Week5_03_MethodReferances {
    public static void main(String[] args) {

        Printer printer1 = new Printer();
        Printer.printMessage("Merhabalar , olmayan!!!!method referances");


        Consumer<String> printer = Printer::printMessage;
        printer.accept("Hello , Method Referance");

    }
}
