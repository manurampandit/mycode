/**
 * 
 */
package in.manurampandit.strings;

/**
 * @author manurampandit
 *
 */
public class StringReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Testing Agent
		
		String s= "amamsdfakslgadfglkandfhlkdanhlkadnhalkdnghadklghnadhlnkadnfhlkadnhlkadghadfgsdfgadfg";
		//printing using first method
		System.out.println(reverseString(s));
		//printing using second method
//		System.out.println(oReverseString(s));
	}
	
	/**
	 * Reverse a string using 'String' class. 
	 * compute in quadratic time
	 * @param str - String which has to be reversed
	 * @return
	 */
	public static String reverseString(String str){
		String rev="";
		for (int i =  str.length()-1; i >=0; i--) {
			rev+=str.charAt(i);
		}
		return rev;
	}
	/**
	 * Optimally reverse a string using 'StringBuilder' class. 
	 * compute in linear time
	 * @param str - String which has to be reversed
	 * @return
	 */
	public static String oReverseString(String str){
		StringBuilder rev=new StringBuilder();
		for (int i =  str.length()-1; i >=0; i--) {
			rev.append(str.charAt(i));
		}
		return rev.toString();
	}
}
