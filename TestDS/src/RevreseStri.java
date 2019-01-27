import java.util.Scanner;

public class RevreseStri {
	
	 public static String FirstReverse(String str) { 
		  
		    // code goes here   
		    /* Note: In Java the return type of a function and the 
		       parameter types being passed are defined, so this return 
		       call must match the return type of the function.
		       You are free to modify the return type. */
		       if(str == null || str.length()<0) {
		           return "cant be reversed";
		       }
		       char[] arr = str.toCharArray();
		       String reverse = "";
		       for(int j = str.length()-1; j >= 0 ; j--){
		    	   reverse = reverse + str.charAt(j);
		       }
	         return "";
		    
		  } 
		  
		  public static void main (String[] args) {  
		    // keep this function call here     
		    //Scanner s = new Scanner(System.in);
		    System.out.print(FirstReverse("hello world")); 
		  } 
}


