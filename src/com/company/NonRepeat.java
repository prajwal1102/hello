package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class NonRepeat {
    public static char test1(String s){
        char unique = '1';
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(i!=j) {
                    if (s.charAt(i) == s.charAt(j))
                        break;
                }
                if(j==s.length()-1) {
                    unique = s.charAt(i);
                    return unique;
                }
            }
        }
        return unique;
    }
    /* Using hashmap will improve the complexity to 2 pass O(2n)*/
    public static Character test2(String s){
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i)))
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            else
                hm.put(s.charAt(i),1);
        }

        for(int i=0;i<s.length();i++){
            if(hm.get(s.charAt(i))==1)
                return s.charAt(i);

        }
        return '1';
    }

    public static void main(String[] args){
        String s = "maam";
        char c = test2(s);
        if(c == '1')
            System.out.println("No non repeating");
        else
            System.out.println("Unique value is: "+c);

        String str = "Battle of the Vowels: Hawaii vs. Grozny";
        String rem = "aeiou";

        String res = removechars(str,rem);
        System.out.println(res);

        String rev = "Battle of the Vowels: Hawaii vs. Grozny";
        String result = reverseSentence(rev);
        System.out.println(rev+" \n\n\n"+result);

    }

    public static String removechars(String str,String rem){
        ArrayList<Character> remArr = new ArrayList<Character>();

        StringBuffer result = new StringBuffer();
        for(int i=0;i<rem.length();i++){
            remArr.add(rem.charAt(i));
        }

        for(int i=0;i<str.length();i++){
            if(remArr.contains(str.charAt(i)))
                continue;
            else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    public static String reverseSentence(String str)
    {
        int first,last;
        first =str.length();
        last = str.length();
        StringBuffer buff = new StringBuffer();
        for(int i = str.length()-1;i>=0;i--){
            if(str.charAt(i)==' '||i == 0){
                buff.append(str.substring(first,last));
                buff.append(' ');
                last = i;
                first= i;
            }
            first --;
        }
        return buff.toString();
    }
}
