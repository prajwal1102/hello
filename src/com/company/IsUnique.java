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

    public static void main(String[] args){
       String s = "abhdga";
       Boolean b = unique1(s);
       System.out.println(b);
    }
}
