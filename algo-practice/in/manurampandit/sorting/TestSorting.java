/**
 * 
 */
package in.manurampandit.sorting;

/**
 * Class contain method to check if array is sorted 
 * @author manurampandit
 */
public class TestSorting {

	/**
	 * Test method
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] a= new Integer[] {1,3,4,5,8,10};
		
		if(TestSorting.isSorted(a)){
			System.out.println("array is sorted");
		}
		else{
			System.out.println("array is not sorted");
		}
		
		System.out.println("*******Negative test case*********");
		a= new Integer[]{0,4,7,-4,9};
		if(TestSorting.isSorted(a)){
			System.out.println("array is sorted");
		}
		else{
			System.out.println("array is not sorted");
		}
		System.out.println("**********Blank array -- its sorted*********");
		a= new Integer[]{};
		if(TestSorting.isSorted(a)){
			System.out.println("array is sorted");
		}
		else{
			System.out.println("array is not sorted");
		}
		
	}

	/**
	 * Checks if an array is sorted
	 * 
	 * @param a
	 *            -array which has to be checked
	 * @return true if array is sorted else false
	 */
	private static boolean isSorted(Comparable[] a) {
		// iterate over the array and check if any element is less than its
		// Preceding element
		for (int i = 0; i < a.length - 1; i++) {
			if (isLess(a[i + 1], a[i]))
				return false;
		}
		return true;
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

}
