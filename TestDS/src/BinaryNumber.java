
public class BinaryNumber {
	
	public static void main(String[] args) {
		System.out.println(solution(110000100));
	}
	
	
	
		
		public static  int solution(int N) {
        // write your code in Java SE 8
        int max = 0 , count = 0 ;
        N |= N-1;
        
        while(N != N>>1) {
            N >>= 1 ;
            if((N &1 ) ==1 ) {
                if(count > max) 
                max = count;
                count = 0 ;
            } else {
                count++;
            }
        }
    
    return max;

}

}
