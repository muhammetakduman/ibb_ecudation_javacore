package org.example._2week;

public class _16_1Array {
    public static String[] arrayMethod1() throws ArrayIndexOutOfBoundsException {
        String[] city = new String[6];
        city[0] = "Eruzurum";
        city[1] = "Van";
        city[2] = "Dadas";
        city[3] = "Elazig";
        city[4] = "İzmir";
        city[5] = "istanbul";
        System.out.println(city);
        System.out.println("Eleman sayısı: "+city.length);
        System.out.println(city[0]);
        System.out.println("Son eleman : "+city[5]);
        return city;
    }
    //psvm
    public static void main(String[] args) {
        arrayMethod1();
    }
}//endclass
