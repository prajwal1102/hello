package com.company;

public class StringCompress {
    public static String compress(String s){
        StringBuilder s1 = new StringBuilder();
        int count = 1;String cnt;
        for(int i=0;i<s.length();i++){

            if(i < s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                if(i==0)
                    s1.append(s.charAt(i));
                count++;
            }
            else
            {
                if(i==0)
                    s1.append(s.charAt(i));
                cnt = Integer.toString(count);
               // System.out.print(cnt);
                s1.append(cnt);
                if(i < s.length()-1)
                    s1.append(s.charAt(i+1));
                count = 1;
            }
        }
if(s.length()>=s1.length())
    return s1.toString();
else
    return s;
    }

    public static void main(String[] args){
        String s = "aaggg";
        String res = compress(s);
        System.out.println(res);


    }
}
