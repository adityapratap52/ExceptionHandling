package com.exceptions;

class MyException extends ArithmeticException{
    @Override
    public String toString() {
        return "This is not good practice";
    }

//    @Override
//    public String getMessage() {
//        return "This is good practice";
//    }
}

public class UserDefineException {
    public static void main(String[] args) {
        int value = 1200;
        try {
            if (value==1200) throw new MyException();
        }catch (MyException e){
            System.out.println("Ex1: "+ e.getMessage());
        }catch (Exception e){
            System.out.println("Ex2: "+e);
        }
        System.out.println("Main Method exit");
    }
}
