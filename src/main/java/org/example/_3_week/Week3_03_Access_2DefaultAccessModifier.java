package org.example._3_week;

public class Week3_03_Access_2DefaultAccessModifier {
    public static void main(String[] args) {
        Week3_01_Access_1_PublicAccessModifier accessModifier = new Week3_01_Access_1_PublicAccessModifier();
        System.out.println(accessModifier.publicData);
        System.out.println(accessModifier.protectedData);
        System.out.println(accessModifier.defaultData);
    }
}
