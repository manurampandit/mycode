/**
 * 
 */
package in.manurampandit.strings;

/**
 * @author manurampandit
 * 
 */
public class LSDSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] input= new String[]{"aba","abc","aab","aaa","aba"};
		sort(input,3);
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
	}

	public static void sort(String[] a, int W) { // W--> fixed length strings
		int R = 256;
		int N = a.length;
		String[] aux = new String[N];
		for (int d = W - 1; d >= 0; d--) {
			int[] count = new int[R + 1];
			for (int i = 0; i < N; i++)
				count[a[i].charAt(d) + 1]++;
			for (int r = 0; r < R; r++)
				count[r + 1] += count[r];
			for (int i = 0; i < N; i++)
				aux[count[a[i].charAt(d)]++] = a[i];
			for (int i = 0; i < N; i++)
				a[i] = aux[i];
		}
	}

}
