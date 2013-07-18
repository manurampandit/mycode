/**
 * 
 */
package in.manurampandit.utility;

/**
 * @author manurampandit
 * 
 */
public class ArrayUtility {
	private int[] arr;
	private int currentIndex;

	public ArrayUtility(int numOfElements) {
		this.currentIndex = 0;
		arr = new int[numOfElements];
	}

	/**
	 * @return the arr
	 */
	public int[] getArr() {
		return arr;
	}

	/**
	 * @param arr
	 *            the arr to set
	 */
	public void setArr(int[] arr) {
		this.arr = arr;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * 
	 * @param N
	 * @return
	 */
	public boolean insertInArray(int N) {
		try {
			arr[currentIndex++] = N;
		} catch (ArrayIndexOutOfBoundsException ex) {
			return false; // false in case array index is out of bound
		}
		return true;

	}

}
