package org.example.project_step1_file;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class StudentManagementSystem {
    private ArrayList<StudentDto> studentsDtoList = new ArrayList<>();
    private int studentCounter = 0;
    private static final String FILE_NAME = "students.txt";

    //static
    static {

    }

    //Parametresiz constructor
    public StudentManagementSystem() {
        //program başlatılırken öğrenci listesini yüklesin
        loadStudentsListFromFile();
    }
    //////////////////////////////////
    //login
    //register
    ///////////

    // FileIO Create
    // File Create
    private void saveToFile() {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            objectOutputStream.writeObject(studentsDtoList);
        } catch (IOException io) {
            System.out.println(" Dosya Ekleme Hatası" );
            io.printStackTrace();
        }
    }

    //FİLE READ
    //oğrenci listesini yükle(dosya)
    private void loadStudentsListFromFile() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            Object obj = objectInputStream.readObject();
            if (obj instanceof ArrayList<?>) {
                studentsDtoList = (ArrayList<StudentDto>) obj;
                studentCounter = studentsDtoList.size();
            } else {
                System.out.println("Dosya içeriği beklenen formatta değil!");
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }



//////////////////////////////


    // Öğrenci Ekle

    public void add (StudentDto dto){
        studentsDtoList.add(new StudentDto(++studentCounter, dto.getName(), dto.getSurname(), dto.getBirthDate(),dto.getGrade()));
        System.out.println("Öğrenci başarıyla eklendi");
        // file ekle
        saveToFile();
    }

    // Öğrenci Listesi

    public void list () {
        //not have a student
        if (studentsDtoList.isEmpty()){
            System.out.println("ÖĞRENCİ YOKTUR");
            return;
        }else {
            studentsDtoList.forEach(System.out::println);
        }
    }
    // Öğrenci Ara
    public void search (String name){
        studentsDtoList.stream()
                .filter(temp -> temp.getName().equalsIgnoreCase(name))
                .forEach(System.out::println);
    }
    // Öğrenci Güncelle

    public void update (int id, StudentDto dto){
        for (StudentDto temp : studentsDtoList){
            if (temp.getId() == id) {
                temp.setName(dto.getName());
                temp.setSurname(dto.getSurname());
                temp.setBirthDate(dto.getBirthDate());
                temp.setGrade(dto.getGrade());
                System.out.println("Öğrenci başarıyla güncellendi");
                saveToFile();
                return;
            }
        }
        System.out.println("Öğrenci bulunamadı");
    }
    // Öğrenci Sil

    public void delete (int id){
        studentsDtoList.removeIf(temp -> temp.getId() == id);
        System.out.println("Öğrenci silindi");
        saveToFile();
    }
    ////////////////////////////////////////////////////////////////
    // FileIO Create
    // Öğrenci Dosyalarını kaydeden metot
    // Öğrenci Dosyalarını okuyan metot

    ////////////////////////////////////////////////////////////////
    // Toplam Öğrenci Sayısı
    // Öğrenci Not Ortalaması Hesapla
    // En Yüksek veya En Düşük Not Alan Öğrenci
    // Öğrenci Sıralaması (Doğum günü)
    // Console Seçim (Öğrenci )


    public void chooise(){
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem studentManagementSystem = new StudentManagementSystem();

        // Sonsuz while
        while(true){
            System.out.println("\n1.Öğrenci Ekle");
            System.out.println("\n2.Öğrenci Listele");
            System.out.println("\n3.Öğrenci Ara");
            System.out.println("\n4.Öğrenci Güncelle");
            System.out.println("\n5.Öğrenci Sil");
            System.out.println("\n6.Öğrenci toplam öğrenci sayısı");
            System.out.println("\n7.Öğrenci rastgele gelsin");
            System.out.println("\n8.Öğrenci Not Hesapla");
            System.out.println("\n9.Öğrenci En Yüksek, En düşük Notları Göster");
            System.out.println("\n10.Öğrenci Öğrenci Sıralaması Doğum gününe göre göster");
            System.out.println("\n11.Çıkış");
            System.out.println("\nLütfen Seçiminizi Yapınız");

            int chooise= scanner.nextInt();
            scanner.nextLine(); // durma yerimiz
            StudentDto studentDto= new StudentDto();
            String name, surname;
            String birthDate;
            double grade;

            switch (chooise){
                case 1:
                    System.out.println("Öğrenci Adı");
                    name= scanner.nextLine();
                    System.out.println("Öğrenci Soyadı");
                    surname= scanner.nextLine();
                    System.out.println("Öğrenci Doğum tarihi");
                    birthDate=scanner.nextLine().toString();
                    System.out.println("Öğrenci Puanı");
                    grade= scanner.nextDouble();
                    studentDto.setId(studentCounter);
                    studentDto.setName(name);
                    studentDto.setSurname(surname);
                    studentDto.setCreatedDate(new Date(System.currentTimeMillis()));
                    //studentDto.setBirthDate(birthDate);
                    studentManagementSystem.add(studentDto);
                    break;

                case 2:
                    studentManagementSystem.list();
                    break;

            }
        }
    }

}
