package com.algorithms;

/**
 * ·­×ªÕûÊý
 * @author zoro301
 *
 */
public class ReverseInteger {

	public static void main(String[] args) {
		long result = reverseInteger(123);
		System.out.println(result);
	}
	
	public static long reverseInteger(int x){
		long result = 0;
		while(x != 0){
			result = result * 10 + x % 10;
			x = x / 10;
			if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
				return 0;
			}
		}
		return result;
	}

}
