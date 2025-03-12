package org.example.tutorials._5_week;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Week5_044_Stream {
    public static List<String> streamExam1(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Ahmet");
        names.add("Ayşe");
        names.add("Asım");
        names.add("Ayfer");
        names.add("Aynur");
        names.add("Aysun");
        names.add("aslı");

        for (String name : names){
            if (name.startsWith("A")){
                System.out.println(name);
            }
        }

        return null;
    }
    public static void  StreamExam2(){
        List<String> names = streamExam1()
                .stream()
                .filter(xyz -> xyz.startsWith("a")).collect(Collectors.toList());

        names.forEach(System.out::print);

    }




    public static void main(String[] args) {
        streamExam1();
        System.out.println("Stream kullanarak");
        StreamExam2();
    }
}
