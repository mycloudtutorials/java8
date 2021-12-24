package com.mycloudtutorials.lambdas;

public class IntTypeImpl {
    public static void main(String[] args) {
        IntType intType = (int a) -> {
            if (a % 2 == 0) {
                return "Even";
            }
            else {
                return "Odd";
            }
        };

        System.out.println(intType.check(7));
        System.out.println(intType.check(8));

    }
}
