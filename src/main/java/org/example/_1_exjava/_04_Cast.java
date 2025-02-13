package org.example._1_exjava;

//donusum
public class _04_Cast {
    public static void main(String[] args) {
        //1-) Widening - Implicit Cast
        byte cast1Byte = 100;
        int cast1Int = cast1Byte;
        System.out.println(cast1Int);

        //Narrowing Cast - Explicit Cast
        int cast2Int = 99999999;
        byte cast2Byte = (byte) cast2Int;
        System.out.println(cast2Byte);

        // char => Int
        char cast3Char ='&';
        int ascii1 = cast3Char;
        System.out.println(cast3Char + "harfi ascci olarak karşılığı :"+ascii1);

        int cast3Int = 38;
        char ascii2 = (char) cast3Int;
        System.out.println(cast3Int+" ascii karsiligi :"+ ascii2);

        //4-) String => int
        String cast4String ="10";
        int cast4Int = Integer.valueOf(cast4String);
        int cast4Int2 = Integer.parseInt(cast4String);
        System.out.println(cast4Int+20);
        System.out.println(cast4String+20);
        System.out.println(cast4Int2+20);

        //5 int => String
        int cast5Int =55;
        String cast5String1 =  String.valueOf(cast5Int);
        String cast5String2 = cast5String1.toString();
        System.out.println(cast5String1);
        System.out.println(cast5String2);



    }
}
