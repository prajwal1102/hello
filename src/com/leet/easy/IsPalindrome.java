package com.leet.easy;

public class IsPalindrome {
    public static boolean isPalindromeStr(int x) {
        String s = String.valueOf(x);

        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-(i+1)))
                return false;

        }
        return true;
    }

    public static boolean isPalindromeRev(int x) {

        int orig = x;
        int rev = 0;
        while(x>0){
            rev = rev*10 + x%10;
            x = x/10;
        }
        System.out.println(rev);

        if(rev == orig)
            return true;
        else
            return false;

    }

    public static boolean isPalindrome(int x){
        int rev = 0;

        if(x%10 ==0)
            return false;
        while(x>rev){
            rev = rev*10 + x%10;
            x=x/10;
        }
        System.out.println(rev+"   "+x);
        if(rev == x||x == rev/10)
            return true;
        else
            return false;
    }
    public static void main(String[] arg){

        System.out.println(isPalindrome(10));
    }
}
