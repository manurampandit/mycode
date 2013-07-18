/**
 * 
 */
package in.manurampandit.strings;

/**
 * @author manurampandit
 *
 */
public class ArrayOfSuffixes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String in= "abcde";
		String[] suffixes= getSuffixes(in);
		for (int i = 0; i <suffixes.length; i++) {
			System.out.println(suffixes[i]);
		}
	}
	/**
	 * 
	 * @param in
	 * @return
	 * Note: if StringBuilder is used than it will take more time
	 */
	public static String[] getSuffixes(String in){
		String[] retSuffix= new String[in.length()];
		for (int i = 0; i < in.length(); i++) { //Take linear time
			retSuffix[i] = in.substring(i);
		}
		return retSuffix;
	}

}
