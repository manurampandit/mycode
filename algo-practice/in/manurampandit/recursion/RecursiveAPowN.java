/**
 * 
 */
package in.manurampandit.recursion;

/**
 * @author manurampandit
 *
 */
public class RecursiveAPowN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("power of (2,3):" + pow(2,3));
		System.out.println("power of (11,4):" + pow(11,4));
	}
	/**
	 * compute a^n recursively
	 * @param a
	 * @param n
	 * @return
	 */
	public static int pow(int a, int n){
		if(n==0)
			return 1;
		else 
			return a*pow(a,n-1);
	}

}
