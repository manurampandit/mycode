/**
 * 
 */
package in.manurampandit.general;

/**
 * @author manurampandit
 *
 */
public class QuickFindUF {
	private int[] id;
	
	public QuickFindUF(int N){
		id=new int[N];
		for (int i = 0; i < N; i++) {
			id[i]=i;
		}
	}
	/**
	 * 
	 * @param p
	 * @param q
	 * @return
	 */
	public boolean isConnected(int p,int q){
		return id[p]==id[q];
	}
	/**
	 * Union of p & q element -- O(N) time
	 * @param p
	 * @param q
	 */
	public void union(int p, int q){
		int pid=id[p];
		int qid=id[q];
		//replace all elements having id as pid with qid
		for (int i = 0; i < id.length; i++) {
			if(id[i]==pid)
				id[i]=qid;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}

}
