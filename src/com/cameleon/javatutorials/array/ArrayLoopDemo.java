package com.cameleon.javatutorials.array;

public class ArrayLoopDemo {

    public static void main(String[] args) {

        String[] members = {"최진혁", "최유빈", "한유람"};
        // 초기화, 종료조건, 반복실행
        for (int i = 0; i < members.length; i++) {
            String member = members[i];
            System.out.println(member + "이(가) 상담을 받았습니다.");
        }
    }
}
