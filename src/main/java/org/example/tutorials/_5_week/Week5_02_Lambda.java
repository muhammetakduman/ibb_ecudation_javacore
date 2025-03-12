package org.example.tutorials._5_week;


//java 1.7 gelen özellik


//java8 @functionalınterfacce (gövdesiz method oluşturma)
@FunctionalInterface
interface MyFunctionalInterface {
    void showMessage(String message);
}


public class Week5_02_Lambda {

    public static void main(String[] args) {
        MyFunctionalInterface messagePrinter =  new MyFunctionalInterface() {
            @Override
            public void showMessage(String message) {
                System.out.println("mesaj-1: " + message);

            }
        };

        MyFunctionalInterface messagePrinter2 = (message) -> System.out.println("Mesaj: " + message);
        messagePrinter.showMessage("Merhaba Lambda!");
    }
}