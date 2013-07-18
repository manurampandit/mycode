/**
 * 
 */
package in.manurampandit.strings;

/**
 * @author manurampandit
 * 
 */
public class LongestCommonPrefix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "matchingcomes";
		String s2 = "matchStick is my";

		// boundary cases
		s1 = "asdfasdfasdg";
		s2 = "baefgasdfga";

		s1 = "aaaaaaaaaaaaaaaaaaaaab";
		s2 = "aaaaaaaaaaaaaaaaaaaaaa";

		// blank test case
		s1 = "";
		s2 = "";
		System.out.println("Length of longest prefix:"
				+ computeLengthPrefix(s1, s2));
	}

	/**
	 * 
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static int computeLengthPrefix(String s1, String s2) {
		// Traverse til smallest length
		int length = s1.length() < s2.length() ? s1.length() : s2.length();
		int i;
		for (i = 0; i < length; i++) {
			if (s1.charAt(i) != s2.charAt(i))
				break;
		}
		return i;
	}

}
