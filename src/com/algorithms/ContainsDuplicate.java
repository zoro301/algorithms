package com.algorithms;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = {1,2,4,6,1,3};
		boolean isContain = containsDuplicate(nums);
		System.out.println(isContain);
	}
	
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}
