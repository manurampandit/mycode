/**
 * 
 */
package in.manurampandit.problems.strings;

import java.util.Scanner;

/**
 * @author manurampandit
 * 
 */
public class StringSimilarityLongestCommonPrefix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int T;
		Scanner in = new Scanner(System.in);
		T= in.nextInt();
		String input;
	//	String[] inSuffixes;
		for (int i = 0; i < T; i++) {
			input= in.next();
			//The below code can give out of memory because of size of inputs
	//		inSuffixes= getSuffixes(input); //max 10^5 inputs
			int sum=0;
			for (int j = 0; j < inSuffixes.length; j++) { //10^5
				sum+=computeLengthPrefix(inSuffixes[j],input);  
			}
			System.out.println(sum);
		}
	}

	/**
	 * Method return all suffixes of s (compute in O(N) time )
	 * 
	 * @param s
	 *            -- input string
	 * @return
	 */
	public static String[] getSuffixes(String s) {
		int N = s.length();
		String[] suffixes = new String[N];
		for (int i = 0; i < N; i++) {
			suffixes[i] = s.substring(i);
		}
		return suffixes;
	}

	/**
	 * Compute length of longest prefix (Compute in sub-linear time
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
