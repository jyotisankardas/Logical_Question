package Nine;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		String s="java";
		String s1="avajn";
		char[] charArray = s.toCharArray();
		char[] charArray1 = s1.toCharArray();
		Arrays.sort(charArray);
		Arrays.sort(charArray1);
		boolean equals = Arrays.equals(charArray, charArray1);
		
		System.out.println(equals);
	}

}