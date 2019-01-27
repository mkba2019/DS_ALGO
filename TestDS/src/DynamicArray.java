@SuppressWarnings("hiding")
public class DynamicArray<String> {
	private Object[] data;
	private int size;
	private int initialCapacity;
	
	public DynamicArray(int initialCapacity) {
		super();
		this.initialCapacity = initialCapacity;
	}
	
	public DynamicArray(Object[] data, int size, int initialCapacity) {
		super();
		this.data = data;
		this.size = size;
		this.initialCapacity = initialCapacity;
	}
	//rANDONM ACCESS
	@SuppressWarnings("unchecked")
	public String get(int index) {
		return (String) data[index];
	}
	
	public void set(int index,String value) {
		data[index] = value;
	}
	
	public void insert(int index, String value) {
		//check the size 
		if(size == initialCapacity) {
			resize();
		}
		//copy up
		for(int j= this.size ;j > index ; j--) {
			data[j] = data[j-1];
		}
		
		//insert
		data[index] = value;
		size++;
		
		//re arrange array
	}
	
	public void resize() {
		Object[] newData = new Object[initialCapacity * 2];
		for(int i= 0; i <initialCapacity ; i++) {
			newData[i] = data[i];
		}
		data = newData;
		initialCapacity = initialCapacity*2;
	}
	
	public void delete(int index) {
		for(int j = index; j < size-1 ; j++) {
			data[j] = data[j+1];
		}
		size--;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	@SuppressWarnings("unchecked")
	public boolean contains(String value) {
		for(int i = 0 ; i<= size ; i++) {
			if((String)data[i] == value) {
				return true;
			}
		}
		return false;
	}
	
	public void print() {
		for(int i = 0 ; i<= size ; i++) {
			System.out.println("data[i "+ data[i]);
		}
	}
	
	public void add(String value) {
		if(initialCapacity == size) {
			resize();
		}
		data[size] = value;
		size++;
	}
}
