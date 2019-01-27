package ds.graph;

public class GraphTest {
	public static void main(String[] args) {
		Graph g = new Graph(8);
		g.addEdge(0, 1);
		g.addEdge(1, 0);
		g.addEdge(1, 4);
		g.addEdge(4, 1);
		g.addEdge(4, 6);
		g.addEdge(6,4);
		g.addEdge(0, 6);
		g.addEdge(6, 0);
		g.addEdge(1, 5);
		g.addEdge(5, 1);
		g.addEdge(5,3);
		g.addEdge(3, 5);
		g.addEdge(3, 0);
		g.addEdge(0, 3);
		g.addEdge(5, 2);
		g.addEdge(2, 5);
		g.addEdge(2, 7);
		g.addEdge(7, 2);
		

	
		
	
		System.out.println("Breadth First search from startIndex:" + 0 + " is as follows --->");
		g.BFS(0);
		
		
		System.out.println("Depth First search from startIndex:" + 0 + " is as follows --->");
		g.DFS(0);
		


		
		
		


		

	}
	

}
