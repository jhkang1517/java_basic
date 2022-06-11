package com.cameleon.javatutorials.condition;

public class Login2Demo {

    public static void main(String[] args) {
        String id = args[0];
        String password = args[1];
        if(id.equals("egoing")) {
            if (password.equals("111111")) {
                System.out.println("right");
            } else {
                System.out.println("id is correct, but password is wrong");
            }
        } else {
            System.out.println("id was wrong");
        }
    }
}
