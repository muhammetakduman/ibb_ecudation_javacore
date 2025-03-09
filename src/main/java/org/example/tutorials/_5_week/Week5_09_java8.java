package org.example.tutorials._5_week;


/*
Java 8, bazı hazır fonksiyonel arayüzler de sunar:

Predicate → boolean test(T t)  → Koşul kontrolleri için.
Function<T, R> → R apply(T t)  → Bir değeri dönüştürmek için.
Consumer → void accept(T t)    → Parametre alır, bir işlem yapar ama geriye değer döndürmez.
Supplier → T get()             → Parametre almaz, bir değer üretir.
 */


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Week5_09_java8 {

    //list
    private static List<String> getArrayToDataList(){
        String[] frontend = {"html5", "css3", "seo", "seo", "seo", "bootstrap5", "tailwindcss", "reactjs", "angular", "jquery", "nodejs"};
        List<String> arrayToList = new ArrayList<>();
        arrayToList = List.of(frontend);
        return arrayToList;
    }
    //collect
    private static List<String > streamCollectData(){
        List<String > list = getArrayToDataList();
        List<String > result =list.stream().collect(Collectors.toList());
        return result;
    }
    //forEach
    private static void stremForEach(){
        List<String> list = streamCollectData();
        list.stream().forEach((temp) -> {
            System.out.println(temp + " ");
        });
    }
    //Distinct
    private  static void streamDistinct(){
        List<String> list = streamCollectData();
        list.stream()
                .distinct()
                .forEach((temp) -> {
                    System.out.println(temp + " ");
                });
    }

    //sorted
    private static void  streamSorted(){
        List<String> list = streamCollectData();
        list
                .stream()
                .sorted()
                .forEach((temp) -> {
                    System.out.println(temp + " ");
                });
    }
    //reverse Sorted
    private static void streamReverseSorted(){
        List<String> list = streamCollectData();
        list
                .stream()
                .sorted(Comparator.reverseOrder())
                .forEach((temp) -> {
                    System.out.println( temp + " ");
                });


    }
    //Filter
    private static void streamFilter() {
        List<String > list = streamCollectData();
        list
                .stream()
                .sorted(Comparator.reverseOrder())
                .filter((temp)-> !"seo".equals(temp))
                .forEach((temp) ->{
                    System.out.println(temp + " ");
                });
    }
    //map
    private static void streamMap(){
        List<String> list = streamCollectData();
        list
                .stream()
                .sorted(Comparator.reverseOrder())
                .filter((temp) -> !"seo".equals(temp))
                .map((temp) -> temp.toUpperCase())
                .forEach((temp) ->{
                    System.out.println(temp + " ");
                });
    }

    //map configration
    private static void streamLimit(){
        List<String > list = streamCollectData();
        list
                .stream()
                .sorted(Comparator.reverseOrder())
                .filter((temp) -> !"seo".equals(temp))
                .map((temp) -> temp.toUpperCase())
                .limit(3)
                .forEach((temp) -> {
                    System.out.println(temp + " ");
                });
    }

    public static void main(String[] args) {

        System.out.println("=====================step2=====================step2");
        stremForEach();
        System.out.println("=====================step2step3=====================step2");
        streamDistinct();
        System.out.println("=====================step4=====================");
        streamSorted();
        System.out.println("=====================step5=====================");
        streamReverseSorted();
        System.out.println("=====================step6=====================");
        streamFilter();
        System.out.println("=====================Step 7=====================");
        streamMap();
        System.out.println("=====================Stttep 8=====================");
        streamLimit();




    }
}
