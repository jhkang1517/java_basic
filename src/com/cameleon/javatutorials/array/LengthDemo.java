package com.cameleon.javatutorials.array;

public class LengthDemo {

    public static void main(String[] args) {
        String[] classGroup = new String[4]; // 이미 공간이 4로 지정되어 있다.
        classGroup[0] = "최진혁";
        System.out.println(classGroup.length); // 몇 개의 값이 담겨질 수 있는지에 대해 알려준다.
        classGroup[1] = "최유빈";
        System.out.println(classGroup.length);
        classGroup[2] = "한이람";
        System.out.println(classGroup.length);
        classGroup[3] = "이고잉";
        System.out.println(classGroup.length);
    }
}
