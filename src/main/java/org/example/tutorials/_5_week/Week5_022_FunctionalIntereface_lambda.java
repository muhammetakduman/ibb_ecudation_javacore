package org.example.tutorials._5_week;

interface MathOperation1 {
    int operation(int a , int b);
}

@FunctionalInterface
interface MathOperation2 {
    int operation(int a, int b);
}

public class Week5_022_FunctionalIntereface_lambda {
    public static void main(String[] args) {
        MathOperation1 addtion1 = new MathOperation1() {
            @Override
            public int operation(int a, int b) {
                return a+b;
            }
        };
        System.out.println(addtion1.operation(5,10));
        //java 1.8 update lambda Experssion..
        MathOperation2 addition2 =  (a,b) -> a +b;
        System.out.println(addition2.operation(5,10));
    }
}
