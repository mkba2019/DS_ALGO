
public class Test22222 {
	 public static String LetterCapitalize(String input) { 
		  
		    // code goes here   
		    /* Note: In Java the return type of a function and the 
		       parameter types being passed are defined, so this return 
		       call must match the return type of the function.
		       You are free to modify the return type. */
		    String[] split = input.split(" ");
		    String output =  " ";
		    for(String st:split) {
		      output =  output +  st.substring(0, 1).toUpperCase() + st.substring(1) + " ";
		    }
		    return output;
		  
		    
		  } 
		  
		  public static void main (String[] args) {  
		    // keep this function call here     
		    System.out.print(LetterCapitalize("hello world")); 
		  }   
}


