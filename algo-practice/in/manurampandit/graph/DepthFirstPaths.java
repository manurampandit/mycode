/**
 * 
 */
package in.manurampandit.graph;

import java.util.Stack;

import in.manurampandit.datastructures.Graph;

/**
 * @author manurampandit
 * 
 */
public class DepthFirstPaths {

	private boolean[] marked;
	private int[] edgeTo;
	private int start;

	public DepthFirstPaths(Graph G, int source) {
		// for (int i = 0; i <G.V(); i++) {
		if (!marked[source]) {
			dfs(G, source);
			// }
		}
	}

	/**
	 * 
	 * @param G
	 * @param v
	 */
	void dfs(Graph G, int v) {
		marked[v] = true;
		for (int w : G.adj(v)) {
			if (!marked[w]) {
				dfs(G, w);
				edgeTo[w] = v;
			}
		}
	}

	/**
	 * Return true if a path exist to a node v
	 * 
	 * @param v
	 * @return
	 */
	public boolean hasPathTo(int v) {
		return marked[v];
	}

	/**
	 * Return iterator to a path betweeen v and source node
	 * 
	 * @param v
	 * @param source
	 * @return
	 */
	public Iterable<Integer> pathTo(int v, int source) {
		Stack<Integer> path = new Stack<Integer>();
		if (!hasPathTo(v))
			return null;
		for (int x = v; x != source; x = edgeTo[v]) {
			path.push(x);
		}
		path.push(source);
		return path;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
