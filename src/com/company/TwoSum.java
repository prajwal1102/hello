package com.company;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int[] a = new int[2];
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], i);
        }
        int j, k;
        for (int i = 0; i < nums.length; i++) {
            j = target - nums[i];
            if (hm.containsKey(j) && hm.get(j) != i) {
                k = hm.get(j);
                a[0] = k;
                a[1] = i;
            }
        }
        return a;
    }

    public static int[] twosumone(int[] nums, int target) {
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    int[] a = new int[2];

    int j, k;
        for(int i = 0; i<nums.length;i++)
    {
        j = target - nums[i];

        if (hm.containsKey(j) && hm.get(j) != i) {
            k = hm.get(j);
            a[0] = k;
            a[1] = i;
            break;
        }
        hm.put(nums[i], i);
    }
        return a;
}

    public static void main(String args[]){
        int[] arr = new int[]{3,3};
        int t = 6;
        int[] ans;
        ans = twosumone(arr,t);
        for(int i=0;i<ans.length;i++) {
            System.out.print(ans[i]);
            System.out.print(" ");
        }
    }

}
