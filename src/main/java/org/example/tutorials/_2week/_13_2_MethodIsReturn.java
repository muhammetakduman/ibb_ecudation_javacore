package org.example.tutorials._2week;

public class _13_2_MethodIsReturn {
    public String metotReturluParametresiz(){
        return "metot retunrlu parametresiz";
    }

    public Integer metotReturnluParametreli(int number){
        return number;
    }

    public static void main(String[] args) {
        _13_2_MethodIsReturn isReturn1 = new _13_2_MethodIsReturn();

        String result1  = isReturn1.metotReturluParametresiz();
        System.out.println(result1);

        Integer result2 = isReturn1.metotReturnluParametreli(123456);
        System.out.println(result2);


    }
}
