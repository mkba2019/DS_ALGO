package ds.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Shrtestpath {
		
	private class Node {
		List<Node> next;
	}
	
	public List<Node> shortestPath(Node a , Node b){
		if(a == null || b == null) return null;
		
		HashMap<Node,Node> parents = new HashMap<Node,Node>();
		LinkedList<Node> toVisit = new LinkedList<Node>();
		
		toVisit.add(a);
		parents.put(a,null);
		
		while(!toVisit.isEmpty()) {
			Node curr = toVisit.remove();
			if(curr == b) break;
			for(Node n:toVisit) {
				toVisit.add(n);
				parents.put(n, curr);
			}
		}	
			if(parents.get(b) == null) return null;
			
			List<Node> out = new LinkedList<Node>();
			Node cur = b;
			while(cur != null) {
				out.add(0, cur);
				cur= parents.get(cur);
			}
			return out;
		
		
	}

}
