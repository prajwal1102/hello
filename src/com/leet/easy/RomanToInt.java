package com.leet.easy;

import java.util.HashMap;

public class RomanToInt {

    public static int Roman(String s){
        HashMap<Character,Integer>  hm = new HashMap<Character,Integer>();
        hm.put('M',1000);
        hm.put('D',500);
        hm.put('C',100);
        hm.put('L',50);
        hm.put('X',10);
        hm.put('V',5);
        hm.put('I',1);

        //Convert the string to array of chars
        char[] ch = s.toCharArray();
        int total = 0;
        int subTotal = 0;


        //MLMVII

        total = hm.get(ch[ch.length-1]);

        for(int i = ch.length-2;i>=0;i--){
            if(hm.get(ch[i])<hm.get(ch[i+1]))
                total = total - hm.get(ch[i]);
            else
                total = total + hm.get(ch[i]);
        }

        return total;
    }

    public static void main(String[] arg){
        String rom = "XMVII";

        System.out.println(Roman(rom));
    }
}
