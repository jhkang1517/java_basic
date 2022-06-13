package com.cameleon.javatutorials.loop;

public class WhileDemo2 {

    public static void main(String[] args) {
        int i = 0;
        // i의 값이 10보다 작다면 true, 크다면 false가 된다.
        while (i < 10) {
            System.out.println("Coding Everybody" + i);
            // 반복문의 중괄호의 마지막 라인에 도달하면 반복문을 검사한다.
            i++;
        }
    }
}
