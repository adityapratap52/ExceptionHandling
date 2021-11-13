package com.exceptions;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        try {
            int []arr = {1,2,3,4,5};
            System.out.println(arr[5]);
            int b = 10/0;
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
