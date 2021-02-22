package com.company;

import javax.swing.text.StyledEditorKit;
import java.util.HashMap;

public class IsUnique {

    public static boolean unique1(String s){
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i)))
                return false;
            hm.put(s.charAt(i),i);
        }
        return true;
    }

    //abca
    public static boolean unique2(String s){
        for(int i =0;i<s.length();i++){
            Character c = s.charAt(i);
            for(int j=i+1;j<s.length();j++){
                if(c == s.charAt(j))
                    return false;
            }
        }
        return true;


    }

    public static boolean isUniqueChars(String s){
        if(s.length()>128) return false;

        boolean char_set[] = new boolean[128];
        for(int i=0;i<s.length();i++){
            int val = s.charAt(i);
            if(char_set[val]) {
                return false;
            }
            char_set[val] = true;
            }
        return true;

        }



    public static void main(String[] args) throws InterruptedException {
       String s = "qwertyuiopasdfghjklzxcvbnm12345678fsldjflksdjfs;lijfl;skdjdslk";
       long startTime = System.currentTimeMillis();
       Boolean b = unique2(s);
       //Thread.sleep(100);
       long endTime = System.currentTimeMillis();
       long lapsedTime = endTime - startTime;
       System.out.println(b+" Time taken is "+lapsedTime);

       int asciVal = '1';
       System.out.println(asciVal);
    }
}
