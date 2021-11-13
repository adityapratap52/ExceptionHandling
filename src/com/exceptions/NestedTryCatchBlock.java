package com.exceptions;

public class NestedTryCatchBlock {
    public static void main(String[] args) {
        try {
            int c = args.length;
            int c1 = args.length+1;
            int c2 = args.length+2;

//            int a=12/c;
            try {
//                if (c1==1) c1 = c1/(c1-c1);
            }catch (ArithmeticException e1){
                System.out.println("Exception: "+e1);
            }

            try {
                if (c2==2) {
                    int []arr = {5};
                    arr[12] = c2;
                }
            }catch (IndexOutOfBoundsException e1){          //or ArrayIndexOutOfBoundsException is same
                System.out.println("Exception: "+e1);
            }
        }catch (ArithmeticException e){
            System.out.println("Exception :"+e);
        }
        System.out.println("Main method is exit");
    }
}
