package com.cameleon.javatutorials.condition;

public class SwitchDemo {

    public static void main(String[] args) {
        System.out.println("switch(1)");
        switch(1){
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
        }

        System.out.println("switch(2)");
        switch(2){
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
        }

        System.out.println("switch(1, break)");
        switch(1){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
        }

        System.out.println("switch(default)");
        switch(999){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("default");
        }
    }
}
