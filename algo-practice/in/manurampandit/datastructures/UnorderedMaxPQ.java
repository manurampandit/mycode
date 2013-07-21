package in.manurampandit.datastructures;

/**
 * 
 * @author manurampandit
 * TODO: implement iterator and other priority queue implementation
 * @param <Key>
 */
public class UnorderedMaxPQ<Key extends Comparable<Key>> {

	private Key[] pq;
	private int N; //no. of elements
	
	/**
	 * constructor to initialize priority queue
	 * Typecast done because java does not allow generic arrays
	 * @param capacity -- the max. size of priority queue
	 */
	public UnorderedMaxPQ(int capacity){
		pq= (Key[])new Comparable[capacity];
	}
	/**
	 * check if priority queue is empty
	 * @return
	 */
	public boolean isEmpty(){
		return N==0;
	}
	/**
	 * Insert an item 
	 * @param k - item
	 */
	public void insert(Key k){
		pq[N++]=k;
	}
	/**
	 * return true if x is less than y
	 * @param x
	 * @param y
	 * @return
	 */
	private static boolean isLess(Comparable x, Comparable y){
		return x.compareTo(y)<0;		
	}
	
	public Key delMax(){
		Key max=pq[0];
		int index=0;
		for (int i = 1; i < N; i++) {
			if(isLess(max, pq[i])){
				max=pq[i];
				index=i;
			}
		}
		exchange(pq, index, N-1);
		return pq[--N];
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
	
	public int size(){
		return N;
	}
	/**
	 * Test method
	 * @param args
	 */
	public static void main(String[] args) {
		UnorderedMaxPQ<Integer> unPQ= new UnorderedMaxPQ<>(5);
		unPQ.insert(2);
		unPQ.insert(12);
		unPQ.insert(22);
		unPQ.insert(20);
		unPQ.insert(11);
		System.out.println("Maximum no. deleted:" + unPQ.delMax());
		System.out.println("size of priority queue now is:" + unPQ.size());
		
		System.out.println("Maximum no. deleted:" + unPQ.delMax());
		System.out.println("size of priority queue now is:" + unPQ.size());
		
	}

}
