package org.example.project_step1_file;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

// LOMBOK
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode

// Student
public class StudentDto implements Serializable {

    // Serileştirme
    private static final long serialVersionUID = 5563646556456565465L;

    // Field
    private Integer id;
    private String name;
    private String surname;
    private Double midTerm;
    private Double finalTerm;
    private Double resultTerm;
    private LocalDate birthDate; //dogum gunu
    private Date createdDate; //sistem otomatik tarihi


    // static (Nesne boyunca 1 kere oluşturulur)
    static {
        System.out.println("static StudentDto Yüklendi.");
    }

    // Parametresiz Constructor
    public StudentDto() {
    }

    // Parametreli Constructor

    public StudentDto(Integer id, String name, String surname, Double midTerm, Double finalTerm, Double resultTerm, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.midTerm = midTerm;
        this.finalTerm = finalTerm;
        this.resultTerm = calculateResult();
        this.birthDate = birthDate;
    }




    // Metotlar

        //vize ve final calculate
    private Double calculateResult() {
        if(midTerm == null || finalTerm==null)
            return 0.0;
        else
            return (midTerm*0.4 + finalTerm*0.6);
    }



    // Getter And Setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Double getMidTerm() {
        return midTerm;
    }

    public void setMidTerm(Double midTerm) {
        this.midTerm = midTerm;
        this.resultTerm = calculateResult();
    }

    public Double getFinalTerm() {
        return finalTerm;
    }

    public void setFinalTerm(Double finalTerm) {
        this.finalTerm = finalTerm;
        this.resultTerm = calculateResult();
    }

    public Double getResultTerm() {
        return resultTerm;
    }

    public void setResultTerm(Double resultTerm) {
        this.resultTerm = resultTerm;
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

} //end Student