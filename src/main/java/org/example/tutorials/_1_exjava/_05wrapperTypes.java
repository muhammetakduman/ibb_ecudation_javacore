package org.example.tutorials._1_exjava;

import com.sun.jdi.FloatType;

public class _05wrapperTypes {
    public static void main(String[] args) {

        //PRIMITIVE (null veremeyiz)
        byte  primitiveTypeByte =127;
        System.out.println(primitiveTypeByte);

        short primitiveTypeShort = 32767;
        long primitiveTypeLong  = 524165465465L;
        char primitiveTypeChar = 'a';
        double  primitiveTypeDouble = 14.23;




        //WRAPPER
        Byte wrapperTypeByte = 127;
        System.out.println(wrapperTypeByte);
        Short wrapperTypeShort = 32767;
        Integer wrapperTypeInt = 214748647;
        Long wrapperTypeLong = 988545654984654L;
        Float wrapperTypeFlot = 14.23f;

    }
}
