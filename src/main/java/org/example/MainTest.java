package org.example;

import org.example.controller.StudentController;
import org.example.dao.TeacherDao;

import java.util.Scanner;

public class MainTest {
    public static final Scanner scanner = new Scanner(System.in);

    //chooise
    public static void chooise (){
        while (true){
            try {
                System.out.println("\n =====ÖĞRETMEN YÖNETİM SİSTEMİ=====");
                System.out.println("1. Öğretmen Ekle");
                System.out.println("2.Öğrenci Ekle ");
                System.out.println("3. Çıkış");
                System.out.println("\nSeçiminizi yapınız :");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice){
                    case 1 -> teacher();
                    case 2 -> student();
                    case 3 -> {
                        System.out.println("Çıkış yapılıyor...");
                        return;
                    }
                    default -> System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
                }
            } catch (Exception e){
                System.out.println("⛔ Beklenmeyen bir hata oluştu: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }
    //STUDENT
    private static void student(){
        try {
            StudentController studentController = new StudentController();
            studentController.chooise();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    //teacher side
    private static void teacher(){
        try {
            TeacherDao teacherDao = new TeacherDao();
            teacherDao.chooise();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        chooise();
    }
}
