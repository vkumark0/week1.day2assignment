package week1.day2assignments;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		String string1 = "changeme";
		char[] charArray = string1.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println("Character array of the string is " + charArray[i]);
		}
		for (int i = 0; i < charArray.length; i++) {
			char c = charArray[i];
			if (i % 2 != 0) {
				c = Character.toUpperCase(c);
				System.out.println(c);
			} else {
				System.out.println(c);
			}
		}
	}


}
