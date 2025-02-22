package org.example.project_step1_file;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;


// LOMBOK
@AllArgsConstructor
@Builder
@EqualsAndHashCode


public class StudentDto implements Serializable {

    //Serileştirme
    private static final long serialVersionUID = 5564564654652L;

    private Integer id;
    private String name;
    private String surname;
    private LocalDate birthDate;
    private Date createdDate;
    private Double grade;

    // static (1 defa)
    static {

    }

    //parametresiz constructor
    public StudentDto() {
    }


    //parametleri consturctor
    public StudentDto(Double grade, LocalDate birthDate, String surname, String name, Integer id) {
        this.grade = grade;
        this.birthDate = birthDate;
        this.surname = surname;
        this.name = name;
        this.id = id;
    }


    //Methods


    //getter-setter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
