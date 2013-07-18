/**
 * 
 */
package in.manurampandit.utility;

import java.util.Scanner;

/**
 * @author manurampandit
 * 
 */
public class QuickFind {

	private int[] id;

	/**
	 * Initialize with N values=i
	 * 
	 * @param N
	 */
	public QuickFind(int N) {
		id = new int[N];
		for (int i = 0; i < N; i++) {
			id[i] = i;
		}
	}

	/**
	 * checks if p and q are connected
	 * 
	 * @param p
	 * @param q
	 * @return true if they are connected, false otherwise
	 */
	public boolean isConnected(int p, int q) {
		return (id[p] == id[q]);
	}

	/**
	 * union of two nodes p&q.
	 * 
	 * @param p
	 * @param q
	 */
	public void union(int p, int q) {
		int pid = id[p];
		int qid = id[q];
		for (int i = 0; i < id.length; i++) {
			if (id[i] == pid)
				id[i] = qid;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int N = in.nextInt();
		QuickFind qf = new QuickFind(N);
		while (in.hasNext()) {
			int p = in.nextInt();
			int q = in.nextInt();
			if (!qf.isConnected(p, q)) {
				qf.union(p, q);
				System.out.println(p + " " + q);
			}
		}

	}

}
