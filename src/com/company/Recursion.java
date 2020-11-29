package com.company;

public class Recursion {

    public static int Factorial(int n){
        if(n>1)
        {
            return n * Factorial(n-1);
        }
        else
            return 1;
    }

    public static void main(String args[]){
       // System.out.println("Factorial value: "+Factorial(15));

        String s = "hat";
        System.out.println("  "+s.substring(1));
    }
}
