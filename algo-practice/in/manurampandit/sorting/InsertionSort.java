/**
 * 
 */
package in.manurampandit.sorting;

/**
 * Insertion sort algo
 * @author manurampandit
 */
public class InsertionSort  {

	/**
	 * sort an array via insertion sort
	 * @param a
	 */
	public static void sort(Comparable[] a){
		int j;
		for (int i = 1; i < a.length; i++) {
			//insert i at its position in a[0] to a[i-1]
			for (j = i; j >0; j--) {
				if(isLess(a[j],a[j-1]))
					exchange(a, j,j-1);
				else
					break;
			}
		}
	}
	
	/**
	 * Test method -TDD
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] a= new Integer[]{3,55,13,13,55,11,-2,13,1};
		sort(a);
		System.out.println("**********Sorted Array:*************");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		
	}

	/**
	 * Checks if x is less than y
	 * 
	 * @param x
	 *            -- First instance
	 * @param y
	 *            --Second instance
	 * @return true if x is less than y else return false
	 */
	private static boolean isLess(Comparable<Comparable<?>> x, Comparable<?> y) {
		return x.compareTo(y) < 0;
	}
	
	/**
	 * Swap value of x and y indices 
	 * @param a -- array
	 * @param x --first index
	 * @param y --second index
	 */
	private static void exchange(Comparable[] a, int x, int y){
		Comparable t= a[x];
		a[x]=a[y];
		a[y]=t;
	}

}
