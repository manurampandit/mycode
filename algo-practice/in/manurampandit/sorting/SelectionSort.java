/**
 * 
 */
package in.manurampandit.sorting;

/**
 * Selection sort algo
 * @author manurampandit
 *
 */
public class SelectionSort {

	/**
	 * sort an array via selection sort
	 * @param a
	 */
	public static void sort(Comparable[] a){
		int smallest;
		for (int i = 0; i < a.length; i++) {
			smallest=i;
			//find (i+1)th smallest number 
			for (int j = i+1; j < a.length; j++) {
				if(isLess(a[j],a[smallest]))
					smallest=j;
			}
			//swap (i+1)th smallest with the ith index
			exchange(a, i, smallest);
		}
	}
	
	/**
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
