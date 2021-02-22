package com.leet.easy;

import java.util.HashMap;
import java.util.Map;

public class AddTwoSums {

        public static int[] twoSum(int[] nums, int target) {

            int[] result = new int[2];
            for(int i = 0;i<nums.length-1;i++) {
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        result[0] = nums[i];
                        result[1] = nums[j];
                        for(int ii:result) {
                            System.out.println(ii);
                        }

                    }
                }
            }
            return result;
        }

    public static int[] twoSum2(int[] nums, int target) {
            //One pass - Hash table solution
        int[] result = new int[2];
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        int complement;
        for(int i=0;i<nums.length;i++){

            complement = target - nums[i];
            if(m.containsKey(complement)){
                result[0] = m.get(complement);
                result[1] = i;
                for(int ii:result) {
                    System.out.println(ii);
                }
            return result;
            }else
            {
                m.put(nums[i],i);
            }

        }
        return result;
    }

        public static void main(String[] arg){
            int[] nums = {3,4,5,9};
            int target = 9;
            twoSum2(nums,target);

        }

}
