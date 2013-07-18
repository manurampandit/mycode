/**
 * 
 */
package in.manurampandit.strings;

/**
 * @author manurampandit
 * 
 */
public class CountingSortCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char[] smthing="hgdgfd".toCharArray();
		char[] sort= sortedChar(smthing);
		for (int i = 0; i < smthing.length; i++) {
			System.out.print(sort[i] + ",");
		}
	}

	/**
	 * 
	 * @param str
	 * @return
	 */
	public static char[] sortedChar(char[] str) {
		int N = str.length;
		int R = 26; // assuming only small case 26 letters
		char[] aux = new char[N];
		int[] count = new int[R + 1];
		// computing frequency
		for (int i = 0; i < N; i++) {
			count[str[i]-97 + 1]++;
		}
		// computing cumulates
		for (int r = 0; r < R; r++) {
			count[r + 1] += count[r];
		}

		for (int i = 0; i < N; i++) {
			aux[count[str[i] -97]++] = str[i];
		}

		return aux;
	}

}
