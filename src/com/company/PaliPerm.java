package com.company;

import java.util.HashMap;
import java.util.Map;

public class PaliPerm {

    public static void main(String[] args){
        String s = "ABBBABHass";
        Boolean res = palperm(s);

        System.out.println(res);
    }
    public static Boolean palperm(String s){
        int count=0;
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            if(hm.containsKey(s.charAt(i))){
                int a = hm.get(s.charAt(i));
                hm.put(s.charAt(i),++a);
            }
            else {
                hm.put(s.charAt(i),1);
            }
        }
        int foundone = 0;
        for(Map.Entry mapElement : hm.entrySet()){
            Character key = (Character)mapElement.getKey();
            int value = ((int)mapElement.getValue());
            System.out.println(key + " : " + value);

            if(value%2==1){
                foundone++;
            }
            if(foundone>1)
                return false;

        }
        return true;
    }
}
