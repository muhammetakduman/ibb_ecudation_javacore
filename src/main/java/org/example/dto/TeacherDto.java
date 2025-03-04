package org.example.dto;

import java.io.Serializable;


/**
 *
 * @param personDto
 * @param subject
 * @param yearsOfExperience
 * @param isTerured
 * @param salary
 * *TeachDto bi record olarak tanımlanmıştır
 * * Record'lar Javada Immutable değiştililmez , data trasnfer için kullanılır
 * Inheritance desteklemez ancak Composition yöntemiyle PersonDto kullanabilirz
 */
/*

 */
public record TeacherDto (
        PersonDto personDto, //PersonDto(composition) içindeki ortak alanalrı kullanır
        String subject, //Öğretmenin uzmanlık Alanı
        int yearsOfExperience, // Öğretmenin toplam deneyim yılı
        boolean isTerured , // Kadrolumu (true , false)
        double salary //Öğretmenin maaşı
) implements Serializable {



    public TeacherDto{
        if (personDto == null) throw new IllegalArgumentException("Teacherde person biligisi boş geçilmez");
        if (subject ==null || subject.isBlank() || subject.isEmpty()) throw new IllegalArgumentException("Uzmanlık alanını boş geçtiniz");
        if (yearsOfExperience < 0) throw  new IllegalArgumentException("'0' dan küçük deneyim olmaz.");
        if (salary <= 0 ) throw new IllegalArgumentException("Maaş negatif veya '0' olamaz");

    }
    public String fullName(){
        return personDto.id + " " + personDto.name + " " + personDto.surname;
    }
    public String experinceLevel(){
        return (yearsOfExperience > 10) ? "Kıdemli Öğretmen" : "Yeni Öğretmen";
    }

}
