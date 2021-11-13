package com.exceptions;

public class ThrowKeywords {
    static void demoClass(){
        int age = 18;
        try {
            if (age==18){       // Constructor in built in Exception is two types -> default constructor and parameterized constructor
                throw new  ArithmeticException("This is my exception");     // If you write string in constructor of AE then it is use getMessage() method
            }
        }catch (ArithmeticException e){
            System.out.println(e);          // It is call toString method
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoClass();
        }catch (ArithmeticException e){
            System.out.println("Rethrow exception");
        }
        System.out.println("Main method exit");
    }
}
