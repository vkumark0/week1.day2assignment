package week1.day2assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		int lengthtext1 = text1.length();
		System.out.println("Length of first string is " + lengthtext1);
		int lengthtext2 = text2.length();
		System.out.println("Length of second string is " + lengthtext2);
		if (lengthtext1 == lengthtext2) {
			char[] charArray1 = text1.toCharArray();
			for (int i = 0; i < charArray1.length; i++) {
				System.out.println("Character array of 1st string is " + charArray1[i]);
				Arrays.sort(charArray1);
				System.out.println("Sorted first character array is " + charArray1[i]);
			}
			char[] charArray2 = text2.toCharArray();
			for (int i = 0; i < charArray2.length; i++) {
				System.out.println("Character array of 2nd string is " + charArray2[i]);
				Arrays.sort(charArray2);
				System.out.println("Sorted second character array is " + charArray2[i]);
			}

		}
	}
}
			
			
			
			
			
			
			


