package org.example.project_step1_file;

import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class StudentManagementSystem {
    private ArrayList<StudentDto> students = new ArrayList<>();
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

    //oğrenci listesini yükle(dosya)
    private void loadStudentsListFromFile() {

    }
    //////////////////////////////////
    //login
    //register
    ///////////
    // FileIO Create
    // File Create
    private void saveToFile(){
        try (ObjectOutputStream object){

        } catch (){

        }
    }



    private void loadStudentsListFromFile() {

    }


    // Öğrenci Ekle
    // Öğrenci Listesi
    // Öğrenci Ara
    // Öğrenci Güncelle
    // Öğrenci Sil
    ////////////////////////////////////////////////////////////////
    // FileIO Create
    // Öğrenci Dosyalarını kaydeden metot
    // Öğrenci Dosyalarını okuyan metot

    ////////////////////////////////////////////////////////////////
    // Toplam Öğrenci Sayısı
    // Öğrenci Not Ortalaması Hesapla
    // En Yüksek veya En Düşük Not Alan Öğrenci
    // Öğrenci Sıralaması (Doğum günü)
    // Console Seçim (Öğrenci Ekle)
}
