package com.leet.easy;

import java.util.HashMap;
import java.util.Stack;

public class ValidParen {

	 public static boolean isValid(String s) {
	     
		 Stack<Character> stk = new Stack<Character>();
		 HashMap<Character,Character> hm = new HashMap<Character,Character>(); 
		 hm.put(')', '(');
		 hm.put(']', '[');
		 hm.put('}', '{');
		 
		
		 
		 for(int i = 0;i<s.length();i++) {
			 if(stk.empty())
			 {	 
				 stk.push(s.charAt(i));
				 continue;
			 }
			 
			 if(stk.peek() == hm.get(s.charAt(i)))
				 stk.pop();
			 else
				 stk.push(s.charAt(i));
		 }
		 
		 return stk.empty();
		 
	    }
	
	public static void main(String[] args) {

		String s = "{[]}";
		
		System.out.println(isValid(s));
	}

}
