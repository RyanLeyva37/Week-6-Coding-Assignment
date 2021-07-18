package com.promineo.ryanleyva1.week6;

import java.util.Set;

public class TestClass {

    public static void main(String[] args){
        StringBuilder builder = new StringBuilder(" ");
        if( true && 1 ==1){
            System.out.println("yes");
        }
        int[] myNumbers = new int[5];

        for(int i = 0; i <=100; i++){
            if( i % 2 == 0)
            System.out.println(i);
        }

        multiplyName("test", 5);

        System.out.println(createStringCount(5));
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static void multiplyName(String s, int times){
        String newString = "";
        for(int i = 0; i < times; i++){
            newString+= s;
        }
        System.out.println(newString);
    }

    public static String createStringCount(int i){

        String newString = "";
        for(int i1 = 0; i1 <= i; i1++){
            newString+= i1;
        }
        return newString;
    }

}
