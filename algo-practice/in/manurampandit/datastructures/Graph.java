/**
 * 
 */
package in.manurampandit.datastructures;

import java.io.InputStream;
import java.util.Scanner;

/**
 * @author manurampandit
 * 
 */
public class Graph {
	// No of vertices
	private final int V;
	// No of Edges
	private int E;
	// adjacency list
	private Bag<Integer>[] adj;

	// For each vertex assign and adjacency list bag
	public Graph(int V) {
		this.V = V;
		this.E = 0;
		adj = (Bag<Integer>[]) new Bag[V];
		for (int i = 0; i < V; i++) {
			adj[i] = new Bag<Integer>();
		}
		// TODO: create graph with V vertices
	}

	/*
	 * add edge from vertex a to vertex b As it is undirected graph, edge in
	 * both direction will be added
	 */
	void addEdge(int a, int b) {
		adj[a].add(b);
		adj[b].add(a);
		E++;
		// TODO: To add two edges a & b
	}

	public int V() {
		return V;
	}

	public int E() {
		return E;
	}

	public Iterable<Integer> adj(int v) {
		return adj[v];
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no. of vertices:");
		Graph G = new Graph(in.nextInt());
		System.out.println("Enter no of edges");
		//Add edges to the vertices
		int E= in.nextInt();
		//Now enter edges from vertex no to other no.
		for (int i = 0; i < E; i++) {
			System.out.println("Enter u, v:");
			G.addEdge(in.nextInt(), in.nextInt());
		}
		//her go printing
		System.out.println("***********");
		System.out.println("Printing starts:");
		for (int v = 0; v < G.V(); v++)
			for (int w : G.adj(v))
				System.out.println(v + "-" + w);

	}

}
