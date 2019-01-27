package ds.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {
	
	private int V;
	private LinkedList<Integer> adj[];
	
	@SuppressWarnings("unchecked")
	Graph(int v){
		V = v;
		adj = new LinkedList[v];
		for(int i = 0 ; i < v ;i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	void addEdge(int v , int w) {
		adj[v].add(w);
	}
	
	void DFS(int s) {
		       //mark all nodes  visited as false
				boolean visited[] = new boolean[V];
				
				//create a stack  for DFS
				Stack<Integer> stack = new Stack<Integer>();
				
				//mark the current node as visited and enqueu
				visited[s] = true;
				System.out.println("Starting at " + s);
				stack.add(s);
				
				while(!stack.isEmpty()) {
					int current = stack.pop();
					System.out.println(current + " ");
					
					//get all adjacent vertices of the dequed 
					//mark as visited
					
					Iterator<Integer> i = adj[current].listIterator();
					while(i.hasNext()) {
						int n = i.next();
						if(!visited[n]) {
							visited[n] = true;
							stack.add(n);
						}
					}
				}
			
	}

	void BFS(int s) {
		//mark all nodes  visited as false
		boolean visited[] = new boolean[V];
		
		//create a queue for BFS
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		//mark the current node as visited and enqueu
		visited[s] = true;
		System.out.println("Starting at " + s);
		queue.add(s);
		
		while(queue.size() != 0) {
			s = queue.poll();
			//System.out.println("Dequeing " + s);
			System.out.println(s + " ");
			
			//get all adjacent vertices of the dequed 
			//mark as visited
			
			Iterator<Integer> i = adj[s].listIterator();
			while(i.hasNext()) {
				int n = i.next();
				if(!visited[n]) {
					visited[n] = true;
					//System.out.println("queing " + n);
					queue.add(n);
				}
			}
		}
	}
}
