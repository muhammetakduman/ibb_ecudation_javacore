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

    private static void runFactorialProgram() {

    }

    private static void measureRecursiveFactorial(long recursiveNumber) {
    }

    private static void measureIterativeFactorial(long iterativeNumber) {

    }

    private static long getValidPositiveNumber() {
        return 0;
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
