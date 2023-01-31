package com.demo;

public class Exception {
    public static void main(String[]args){
        int[]num={1,2,3,4,5};
        try{
            System.out.println("num" +num[3]);
            System.out.println("num" +num[6]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();

        }
        System.out.println("program executed completely");


    }
}
