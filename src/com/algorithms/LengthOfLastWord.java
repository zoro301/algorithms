package com.algorithms;

public class LengthOfLastWord {

	public static void main(String[] args) {
		String str = "word ";
		int result = lengthOfLastWord(str);
		System.out.println(result);
	}
	
	public static int lengthOfLastWord(String s) {
        if(s == null || " ".equals(s) || s.length() == 0){
            return 0;
        }
        String[] strs = s.trim().split(" ");
        String lastWord = strs[strs.length - 1];
        return lastWord.length();
    }
}
