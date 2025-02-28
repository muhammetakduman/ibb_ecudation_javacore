package org.example.tutorials._2week;

public class House extends oopExHouse {
    public static void main(String[] args) {
        House house1 = new House();
        House house2 = new House();
        house1.glassShape = "Square";
        System.out.println(house1.glassShape);
        System.out.println(house2.doorColor);
        System.out.println(house2.roofColor);
        System.out.println(house1.wasBuildYear);
    }
}
