package linkedlist;

public class LinkedList {

	private static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
		}
	}
	
	private Node head;

	public void addFront(int i) {
		// TODO Auto-generated method stub
		//create a new node
		Node newNode = new Node(i);
		
		//if head
		if(head== null) {
			head= newNode;
			return;
		}
		
		//set new node to head
		newNode.next=head;
		//final step head to point
		head= newNode;
		//
	}

	public int getFirst() {
		// TODO Auto-generated method stub
		return head.data;
	}

	public int getLast() {
		// TODO Auto-generated method stub
		if(head== null) {
			throw new IllegalArgumentException("empty list");
		}
		Node current = head;
		
		while(current.next !=null) {
			current= current.next;
		}
		return current.data;
	}
	
	public void addBack(int data) {
		//create the new node
		Node newNode = new Node(data);
		//if first element
		if(head == null) {
			head = newNode;
		}
		
		//start at the head
		Node current = head;
		
		//go till end 
		while(current.next !=null) {
			current= current.next;
		}
		//point last element next  to new node
		current.next = newNode;
	}
	
	public int size() {
		if(head == null) return 0;
		//brute force
		int count = 1;
		Node current = head;
		
		while(current.next != null) {
			current = current.next;
			count++;
		}
		return count;
	}
	
	public void clear() {
		head = null;
	}
	
	public void deleteValue(int data) {
		//head is null
		if(head == null) {
			throw new IllegalArgumentException("cant delete");
		}
		
		if(head.data == data) {
			head = head.next;
			return;
		}
		
		//middle
		Node current = head;
		while(current.next != null) {
			if(current.next.data == data) {
				current.next = current.next.next;
				return;
			}
		}
	}
	
}
