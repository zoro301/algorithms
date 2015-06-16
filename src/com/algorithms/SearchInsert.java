package com.algorithms;

public class SearchInsert {

	public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		int tartget = 7;
		int index = searchInsert(nums, tartget);
		System.out.println(index);
	}
	
	public static int searchInsert(int[] A, int target) {
        int low = 0;
        int high = A.length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(A[mid] == target){
                return mid;
            }else if(A[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}
