package com.exceptions;

public class BasicOfException {
    static void output(){
        // In main method
        int a = 0;
        int b = 5;

        try {
            System.out.println(b/a);
            System.out.println("This is not print");
        }catch (ArithmeticException e){
//            System.out.println(e);              // It is print only exception
            e.printStackTrace();                 // It is print exception and which method is throwing exception both
        }
        System.out.println("output method is exiting");
    }

    public static void main(String[] args) {
        // In main method
        /*
        int a = 0;
        int b = 5;

        // without try-catch block
//        System.out.println(b/a);
//        System.out.println("This is not print");

        // with try-catch block
        try {
            System.out.println(b/a);
            System.out.println("This is not print");
        }catch (ArithmeticException e){
//            System.out.println(e);              // It is print only exception
            e.printStackTrace();                 // It is print exception and which method is throwing exception both
        }
        System.out.println("Main method is exiting");
         */

        output();
    }
}
