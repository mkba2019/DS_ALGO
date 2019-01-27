import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class DynamicArrayTest {
	
	private DynamicArray<String> array;

	
	@Before
     public void setup() {
    	 array = new DynamicArray<String>(2);
     }

	@Test
	public void getAndSetTest() {
		array.set(0,"a");
		assertEquals(0, array.get(0));
	}
}
