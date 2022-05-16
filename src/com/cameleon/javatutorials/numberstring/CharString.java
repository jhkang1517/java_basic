package com.cameleon.javatutorials.numberstring;

public class CharString {
    public static void main(String args[]) {
        /* Character , String
         * 자바는 문자(Character)와 문자열(String)을 구분한다.
         * 문자는 '(작은따옴표)로만 감싸야 한다.
         */
        System.out.println('생');
        System.out.println("생활코딩");
//        System.out.println('생활코딩'); // Error, 문자열을 작은 따옴표로 감쌌기 떄문 (Too many characters in character literal)
        System.out.println("생"); // 하나의 문자도 문자열이 될 수 있다.

        /*
         * 문자열 결합은 + 를 사용한다.
         */
        System.out.println("생활코딩"+"입니다");

        /*
         * 이스케이프 문자
         */
        System.out.println("egoing said \"Welcome programming world!\"");

        /*
         * 여러줄의 표시
         */
        System.out.println("HTML\nCSS\nJavaScript");
    }
}
