/**
 * Chapter 1 Arrays and Strings
 * -Question 1.3
 * Design an algorithm and write code to remove the duplicate characters in a string
 * without using any additional buffer. NOTE: One or two additional variables are fine.
 * An extra copy of the array is not
 * FOLLOW UP
 * Write the test cases for this methods	
 * @author Kazushi Kawamura
 */
package chapterone;

public class RemoveDuplicateChars {

	public static void main(String[] args) {
		String s[] = {"aaaa", "aab","aaabb", "no"};
		for (int i = 0; i < s.length; i++) {
			System.out.println(removeDuplicateChars(s[i].toCharArray()));
		}

        System.out.println(removeDuplicateChars(null));
	}
	
	/**
	 * remove duplicate characters from char string.
	 * @param str
	 * @return
	 */
	public static char[] removeDuplicateChars(char[] str) {
		if (str == null) { // if the param is null, it's a bit ugly..
			char[] c = {};
			return c;
		}

		for (int i = 0; i < str.length; i++) {
			for (int j = i+1; j < str.length; j++) {
				if (str[i] == str [j]) { // if the character is duplicated
					str[i] = 0;
				}
			}
		}
		for (int i = 0; i < str.length; i++) {
		}
		return str;
	}
}
