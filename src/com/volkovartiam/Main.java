package com.volkovartiam;

public class Main {

    public static void main(String[] args) {
        int i=0 ;
        System.out.println(i) ;
        i = i + 1 ;
        System.out.println(i) ;

        for (int x = 0 ; x < 5; x++ ) {
            x = x ;
            System.out.println("x = " + x) ;
        }

        int a = 1;
        int b = 2;
        int sum = a + b ;
        System.out.println("sum = " + sum );

        System.out.println(" a < b " + (a < b) );
        System.out.println(" a > b " + (a > b) );

        String hello = "Hello" ;
        String world = "World" ;

        System.out.println("Hello World!") ;
        System.out.println(hello +  " " +  world + "!") ;

    }
}


