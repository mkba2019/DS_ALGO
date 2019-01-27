package intr.questions;

public class CycleLinkedList {

	public boolean hasLoop(Node node) {
		Node fast  = node;
		Node slow = node;
		
		if(fast != null && fast.next != null) {
			slow= slow.next;//one node
			fast = fast.next.next;//2 node
			
			if(slow == fast) return true;
		}
		return false;
		
		
	}
}
