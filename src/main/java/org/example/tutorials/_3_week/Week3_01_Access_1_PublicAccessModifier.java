package org.example.tutorials._3_week;

public class Week3_01_Access_1_PublicAccessModifier {
    public String publicData = "public data";
    private String privateData = "private data";
    protected String protectedData ="protectedData";
    String defaultData = "dafult data";

    public static void main(String[] args) {
        Week3_01_Access_1_PublicAccessModifier accessModifier = new Week3_01_Access_1_PublicAccessModifier();
        System.out.println(accessModifier.publicData);
        System.out.println(accessModifier.defaultData);
        System.out.println(accessModifier.protectedData);
        System.out.println(accessModifier.privateData);

    }
}
