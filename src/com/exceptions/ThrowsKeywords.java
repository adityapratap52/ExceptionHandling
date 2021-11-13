package com.exceptions;

public class ThrowsKeywords {
    static void print() throws  IllegalAccessException{         // Step1 - use throws keyword or try-catch
        throw new IllegalAccessException();
    }
    public static void main(String[] args) throws IllegalAccessException{        // Step2- use throws and try-catch

        print();
        System.out.println("End program");
    }
}
