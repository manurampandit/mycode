/**
 * 
 */
package in.manurampandit.graph;

import in.manurampandit.datastructures.Graph;

/**
 * @author manurampandit
 * 
 */
public class GraphProcessingAlgos {
	/**
	 * Count no. of edges adjacent to v or degree of v O(n)
	 * 
	 * @param G
	 *            --Graph
	 * @param v
	 *            --vertices
	 * @return degree
	 */
	public static int degree(Graph G, int v) {
		int count = 0;
		for (int w : G.adj(v)) {
			count++;
		}
		return count;
	}

	/**
	 * Compute maximum degree in a graph G O(n^2)
	 * 
	 * @param G
	 *            --Graph
	 * @return - max degree in a graph
	 */
	public static int maxDegree(Graph G) {
		int max = 0;
		for (int i = 0; i < G.V(); i++) {
			if (degree(G, i) < max)
				max = degree(G, i);
		}
		return max;
	}

	/**
	 * 
	 * @param G
	 * @return
	 */
	public static int computeAverageDegree(Graph G) {
		return 2 * G.E() / G.V();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
