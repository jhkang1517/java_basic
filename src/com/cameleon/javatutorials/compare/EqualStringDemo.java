package com.cameleon.javatutorials.compare;

public class EqualStringDemo {
    public static void main(String[] args) {
        String a = "Hello world"; // Heap Area, String Constant Pool (주소, 값) 형태로 저장된다.
        String b = new String("Hello world");
        String c = "Hello world"; // "" 로 생성한 String 객체는 String Constant Pool 영역을 먼저 찾는다. 같다면 동일 주소값을 사용한다.
        System.out.println(a == b); // false
        System.out.println(a == c); // true
        System.out.println(a.equals(b)); // true
    }
}
