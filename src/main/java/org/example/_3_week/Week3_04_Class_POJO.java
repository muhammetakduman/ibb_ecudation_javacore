package org.example._3_week;

public class Week3_04_Class_POJO {

    private String name;
    private String surName;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurName(){
        return surName;
    }
    public void setSurName(String surName){
        this.surName = surName;

    }

    public static void main(String[] args) {
        Week3_04_Class_POJO pojo = new Week3_04_Class_POJO();
        pojo.setName("Muhammet");
        pojo.setSurName("Akduman");

        String fullName = pojo.getName().toString() + " " + pojo.getSurName().toString();
        System.out.println(fullName);
    }
}
