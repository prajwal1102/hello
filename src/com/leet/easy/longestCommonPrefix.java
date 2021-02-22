package com.leet.easy;

public class longestCommonPrefix {

	public static String longCommonPrefix(String[] strs) {
        String common = "";
        if(strs == null  || strs.length == 0)
        	return common;
        
        int wordLength = strs[0].length();
        
        if(strs.length==1)
        	return strs[0];
        
        for (int i = 0; i < strs.length-1; i++) {
            if(strs[i].length()>strs[i+1].length() && (wordLength > strs[i].length() || wordLength > strs[i+1].length()))
                wordLength = strs[i+1].length();
            else if(wordLength > strs[i].length() || wordLength > strs[i+1].length())
                wordLength = strs[i].length();
        }
        for(int i=0;i<wordLength;i++)  {
        	for(int j=0;j<strs.length-1;j++){
        		if(strs[j].charAt(i)==strs[j+1].charAt(i) && j==strs.length-2) {
        			common = common + strs[j].charAt(i);
        		
        		}
        		
        		if(strs[j].charAt(i)==strs[j+1].charAt(i))
        			continue;
                if(strs[j].charAt(i)!=strs[j+1].charAt(i))
                    i = wordLength;
                    j=strs.length;
        			break;
        	}
        }
        
        return common;
    }
	
	public static void main(String[] args) {
		
		String[] s = {"ab", "a"};
		System.out.print(longCommonPrefix(s));

	}

}
