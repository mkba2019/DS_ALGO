package linkedlist;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;
	
class LinkedListTest {
     private LinkedList linkedList;
     
	@Before
    public void setup() {
		linkedList = new LinkedList();
    }

	@Test
	public void AddFront() {
		linkedList.addFront(1);
		linkedList.addFront(2);
		linkedList.addFront(3);
		
		Assert.assertEquals(3, linkedList.getFirst());
		Assert.assertEquals(1, linkedList.getLast());

		
	}
	@Test
	public void getFirst() {
		
	}
	@Test
	public void getLast() {	
		
	}
	@Test
	public void AddBack() {
		
	}
}
