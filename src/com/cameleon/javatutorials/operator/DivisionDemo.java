package com.cameleon.javatutorials.operator;

public class DivisionDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        float c = 10.0F;
        float d = 3.0F;

        System.out.println(a/b); // 정수간 연산은 정수로 표현
        System.out.println(c/d); // 실수간 연산은 실수로 표현
        System.out.println(a/d); // 정수, 실수 연산은 실수로 표현
    }
}
