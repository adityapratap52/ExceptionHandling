package com.exceptions;

public class FinallyKeywords {
    static void first(){
        try {
            System.out.println("Inside of first method");
            throw new RuntimeException();
        }finally {
            System.out.println("This is finally block of first method");
        }
    }
    static void second(){
        try {
            System.out.println("Inside of second method");
            return;
        }finally {
            System.out.println("This is finally block of second method");
        }
    }
    static void third(){
        try {
            System.out.println("Inside of third method");
        }finally {
            System.out.println("This is finally block of third method");
        }
    }
    public static void main(String[] args) {
        try {
           first();
        }catch (RuntimeException re){
            System.out.println("Exception Caught");
        }
        second();
        third();
    }
}
