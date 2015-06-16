package com.algorithms;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate2 {
	
	private static int[] dataArray = {1,2,1,2,4,5,7,9,2,7,9};
	public static void main(String[] args) {
		boolean isContain = containsNearbyDuplicate(dataArray,2);
		System.out.println(isContain);
	}
	
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
 }
}
