package org.example.tutorials._3_week;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class Week3_01_Examples_1 {

    private static final int MAX_DECİMAL_ATTEMPTS = 3;
    private static final int MAX_RECURSIVE_LIMIT = 20;

    //SCANNER CLASS
    private static final Scanner scanner = new Scanner(System.in);

    //logger
    private static final Logger logger = Logger.getLogger(Week3_01_Examples_1.class.getName());

    static {
        try {
            LogManager.getLogManager().reset();  //rest in before log config
            FileHandler fileHandler = new FileHandler("factorial_log.log",true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
            logger.setLevel(Level.ALL);
        }catch (IOException e){
            System.err.println("Log dosyası oluşturulamadı :" + e.getMessage());

        }
    }

    //Factorial program run

    private static void runFactorialProgram(){
        while (true){
            System.out.println("\n" + "Lütfen bir seçim yapınız:\n1) İteratif Faktöriyel\n2) Özyinelemeli Faktöriyel\n3) Sistem Özellikler\n4) Çıkış\n" );
            int choice = getUserChoice();

            switch (choice){
                case 1 :
                    long iterativeNumber = getValidPositiveNumber();
                    measureIterativeFactorial(iterativeNumber);
                    break;

                case 2:
                    long recursiveNumber = getValidPositiveNumber();
                    if (recursiveNumber > MAX_RECURSIVE_LIMIT){
                        System.out.println("UYARI : Girilen sayı recursive fonksion için çok büyük! Maksimum");
                        logger.warning("Recursive fonksiyon sınırı aşıldı:"+ recursiveNumber);
                    } else {
                        measureRecursiveFactorial(recursiveNumber);
                    }
                    break;

            }
        }
    }

    private static int getUserChoice() {
        while(true) {
            if(scanner.hasNextInt()){
                return scanner.nextInt();
            } else {
                System.out.println("Geçersiz giriş! lütfen bir tam sayı girin.");
                logger.warning("Geçersiz giriş yapıldı.");
                scanner.next();
            }
        }

    }


}
