package com.leet.easy;

import java.util.HashMap;

public class AlienDic {
    public static boolean isAlienSorted(String[] words, String order) {

        char[] ch = order.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();

        for(int i=0;i<ch.length;i++){
            hm.put(ch[i],i+1);
        }
        int[] flags = new int[words.length];
        String word1;
        String word2;
        int wordLength;

            for (int i = 0; i < words.length-1; i++) {
                if(words[i].length()>words[i+1].length())
                    wordLength = words[i+1].length();
                else
                    wordLength = words[i].length();
               for(int j=0;j < wordLength;j++)
               {
                if()

                flags[i] = hm.get(words[i].charAt(j));
                flags[i+1] = hm.get(words[i+1].charAt(j));
                if(flags[i]>flags[i+1]){
                    return false;
                }
               }


        }
        return true;
    }

    public static void main(String[] args){

        String order = "hlabcdefgijkmnopqrstuvwxyz";

        String[] words = {"hello","leetcode"};

        Boolean test = isAlienSorted(words,order);

        System.out.println(test);
    }
}
