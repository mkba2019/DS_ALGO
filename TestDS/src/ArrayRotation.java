
public class ArrayRotation {
	
	 public static int[] solution(int[] A, int K) {
	       final int[] result = new int[A.length];
	       final int size = A.length;
	       
	       for(int i= 0 ;i <size ;i++) {
	           int index = (i + K) % size;
	    	   System.out.println(" AT iteration i = " + i  + " rotation " + K + " index value is "  + index);
	           result[index] = A[i];
	       }
	       
	       return result;
	    }
	 
	 public static void main(String[] args) {
		int[]  A = {3,8,9,7,6};
		int K = 3;
		
		for(int i : solution(A, K)) {
			System.out.print(i);
			System.out.print(" ");
		}
		
	}

}
