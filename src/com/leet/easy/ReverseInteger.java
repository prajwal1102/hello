package com.leet.easy;

public class ReverseInteger {
    public static int reverse(int x) {

        int value =1;
        int y =0,z = 0 ;
        String s = "+";
        int i = 1;
        if(x<0) {
            i = -1;
        x = x*i;
        }
        int len = String.valueOf(x).length();
        while(len > 0){

            y = x%10;
            x = x/10;
            //s = String.valueOf(y);
           // s.concat(String.valueOf(y));
           s= s+String.valueOf(y);
           // y = x;
            len--;

        }
        System.out.println(s);
        y = Integer.parseInt(s);
        y = y * i;
        return y;
    }

    public static void main(String[] arg){
        int num = 1534236469;

        System.out.println(reverse(num));
    }

}
