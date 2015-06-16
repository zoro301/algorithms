package com.algorithms;

public class SingleNumber {

	public static void main(String[] args) {
		int[] nums = {1,3,1,4,2,6,3,4,6};
		int result = singleNumber(nums);
		System.out.println(result);
	}
	
	public static int singleNumber(int[] A) {
        int result = 0;
        for(int a: A){
            result ^= a;
        }
        return result;
    }
}
