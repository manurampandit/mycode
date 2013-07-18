package in.manurampandit.math;
/**
 * WIll be given an array of numbers to be generated 
 * and an array indicating the frequency of outcome of each number
 * @author manurampandit
 *
 */
public class RandomNumberArbitaryProbability {

	public static void printRandomFrequencyBased(int[] arr, int[] freq){
		//generate a cumulative frequency table
		int[] cumFreq= new int[freq.length];
		cumFreq[0]=freq[0];
		for (int i = 1; i < cumFreq.length; i++) {
			cumFreq[i]=cumFreq[i-1] + freq[i];
			System.out.println(cumFreq[i]);
		}
		//Now find random between 0 to max cum fre
		//now start generating random number between 0 to cumFreq.length
		int random;
		for (int i = 0; i < 10; i++) {
			random=(int) (Math.random()*cumFreq[cumFreq.length-1]) +1;
//			System.out.println("random num gen:" + random);
			//now check its location till that number in cumFreq
			System.out.print(arr[findLocationInCumArray(cumFreq, random)] +", ");
		}
	}
	/**
	 * find ceiling based on cum frequency 
	 * @param cumFreq
	 * @param num
	 * @return
	 */
	public static int findLocationInCumArray(int[] cumFreq, int num){
		//as cum freq is sorted, we can use binary search
		int low=0, max=cumFreq.length-1,mid;
		while (low<max) {
			mid=(low+max)/2;
			if(num>cumFreq[mid])
				low=mid+1;
			else
				max=mid;
		}
		return low;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr=new int[]{1,3,5,7};
		int[] freq=new int[]{1,2,2,2};
		printRandomFrequencyBased(arr, freq);

	}
	

}
