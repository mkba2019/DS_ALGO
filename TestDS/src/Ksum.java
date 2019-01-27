import java.util.Arrays;

public class Ksum {
	
	public static int[] twoSum(int[] num, int target) {
    int [] results = new int[2];
    for(int  i = 0 ; i < num.length ; i ++) {
        for(int j=i+1 ; j <num.length ; j++) {
            if(num[i] + num[j] == target) {
                results[0] = i;
                results[1] = j;
            }

            
        }
    }
    
    return results;
    
}
	
	 public static int[] twoSum1(int[] num, int target) {
	        int [] results = new int[2];
	        int length = num.length;
	        
	        int curr_sum = num[0], start = 0, i;
	        for (i = 1; i <= length; i++)  
	        {
	        while(curr_sum > target) {
	        	curr_sum = curr_sum - num[start];
	        	start++;
	        }
	        if(curr_sum == target) {
	        	     int p = i-1; 
	                System.out.println("Sum found between indexes " + start 
	                        + " and " + p); 
	               // return 1;
	                results[0] = start;
	    	        results[1] = p;
	        }
	        
	        if (i < length) { 
	            curr_sum = curr_sum + num[i]; 
	        }
	              
	        } 
	      
	        
	        return results;
	        
	    }

public static void main(String[] args) {
	//on2
	int [] x = twoSum1(new int[] {3,2,4} , 6);
	System.out.println(Arrays.toString(x));
}

}
