package com.company;

import java.util.ArrayList;

public class Palindrome {

    public static void main(String args[]){


ArrayList<String> al = new ArrayList<String>();
al.add("abbba");
al.add("malayalam");
al.add("avvgb");
       // System.out.println(str.charAt(0));
for(int i =0;i<al.size();i++) {
    String s = LongestPaliS(al.get(i));
    System.out.println(al.get(i) +" --> "+s);
}


    }
    public static String LongestPaliS(String str)
    {
        String longestPali = str.substring(0,1);
        for(int i=0;i<str.length();i++){
            String s1 = getPali(str,i,i);
            String s2 = getPali(str,i,i+1);
            if(s1.length()>longestPali.length())
                longestPali=s1;
            if(s2.length()>longestPali.length())
                longestPali=s2;
        }
        return longestPali;
    }

    public static String getPali(String str,int B, int F)
    {

        while(B>=0 && F<str.length() && str.charAt(B)==str.charAt(F))
        {
            B--;
            F++;
        }
        return str.substring(B+1,F);
    }
    public static String LongestPali(String str)
    {
        int start =0;
        int end =0;
        int len1=0;
        int len2 =0;
        int len =0;
        int lenmax = 0;
        for(int i=0;i<(str.length());i++){
            len1 = lengthCheck(str,i,i);
            len2 = lengthCheck(str,i,i+1);
            len = Math.max(len1,len2);
if (len>=lenmax) {
    lenmax = len;
    start = i-(lenmax-1) / 2;
    end = i + lenmax / 2;
}

        }
        System.out.println(lenmax+" "+start+" "+end);
        return str.substring(start,end+1);
    }

    public static int lengthCheck(String str,int B, int F)
    {
        while(B>=0 && F<str.length() && str.charAt(B)==str.charAt(F))
        {
            B--;
            F++;
        }
        return F-B-1;
    }
}
