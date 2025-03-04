package org.example.dao;

import com.sun.source.tree.ReturnTree;
import org.example.dto.TeacherDto;
import org.example.exceptions.TeacherNotFoundException;

import java.io.*;
import java.security.PublicKey;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class TeacherDao implements IDaoGenerics<TeacherDto> {
    private final List<TeacherDto> teacherList = new ArrayList<>();
    private  final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();
    private static final String FILE_NAME = "teachers.txt";

    public TeacherDao(){
        createFileIfNotExists();
        loadTeachersFromFile();
    }


    private void createFileIfNotExists() {
        File file = new File(FILE_NAME);
        if (!file.exists()){
            try {
                file.createNewFile();
            }catch (IOException e){
                System.err.println("Dosya oluşturulurken hata oluştu :" + e.getMessage());
            }
        }

    }
    private void saveTofile(){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))){
            for (TeacherDto teacher : teacherList){
                writer.write(teacherToCsv(teacher) + "\n");
            }
        }catch (IOException e){
            System.err.println("Dosya yazma hatasi :" + e.getMessage());
        }
    }

    private String  teacherToCsv(TeacherDto teacher) {
        return teacher.id() + "," + teacher.name() + "," + teacher.surname() +"," +
                teacher.birthDate()+","+ teacher.subject()+ "," + teacher.yearsOfExperience()+","+ teacher.isTenured()
                +","+teacher.salary();
    }
    private void loadTeachersFromFile() {
        teacherList.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))){
            String line;
            while ((line = reader.readLine()) != null){
                TeacherDto teacher = csvToTeacher(line);
                if(teacher != null){
                    teacherList.add(teacher);
                }
            }
        }catch (IOException e){
            System.err.println("Dosya okuma hatasi :" + e.getMessage());
        }
    }

    private TeacherDto csvToTeacher(String csvLine) {
        try {
            String [] parts = csvLine.split(",");
            if (parts.length != 8) {
                System.err.println("Hatalı csv formatı:" + csvLine);
                return null;
            }
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate birthDate = null;
            try{
                if (!parts[3].isBlank()){
                     birthDate=LocalDate.parse(parts[3],formatter);
                }
            }catch (DateTimeParseException e){
                System.err.println("Geçersiz Tarih Formatı :" + parts[3] + "(Beklenen format : yyyy-MM-dd)");
                return null;

            }
            return new TeacherDto(
                    Integer.parseInt(parts[0]),
                    parts[1],
                    parts[2],
                    birthDate,
                    parts[4],
                    Integer.parseInt(parts[5]),
                    Boolean.parseBoolean(parts[6]),
                    Double.parseDouble(parts[7])
            );

        }catch (Exception e){
            System.err.println("CSV ayrıştırma hatası :" +e.getMessage());
            return null;
        }
    }
    @Override
    public TeacherDto create(TeacherDto teacher){
        teacherList.add(teacher);
        saveTofile();
        return teacher;
    }
    @Override
    public TeacherDto findByName(String name){
        return teacherList.stream()
                .filter(t -> t.name().equalsIgnoreCase(name))
                .findFirst()
                .orElseThrow(() -> new TeacherNotFoundException(name + "isimli öğretmen bulunmadı."));
    }
    @Override
    public TeacherDto findById(int id){
        return teacherList.stream()
                .filter(t -> t.id() == id)
                .findFirst()
                .orElseThrow(()-> new TeacherNotFoundException(id + "id 'li öğrenci bulunmadı"));
    }

    @Override
    public List<TeacherDto> list(){
        return new ArrayList<>(teacherList); // don't exchange outside
    }
    @Override
    public  TeacherDto update(int id , TeacherDto updatedTeacher){
        for ( int i= 0; i<teacherList.size(); i++){
            if (teacherList.get(i).id() == id){
                teacherList.set(i , updatedTeacher);
                saveTofile();
                return updatedTeacher;
            }
        }
        throw new TeacherNotFoundException("Güncellenecek öğretmen bulunmadı.....");
    }

    @Override
    public TeacherDto delete(int id){
        Optional<TeacherDto>  teacher = teacherList.stream()
                .filter(t -> t.id() ==id)
                .findFirst();
        teacher.ifPresent(teacherList::remove);
        saveTofile();
        return teacher.orElseThrow(() -> new TeacherNotFoundException(id + "id'li öğretmen bulunmadı"));
    }

}
