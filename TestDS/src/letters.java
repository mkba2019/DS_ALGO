public class letters {	
	
	 public static String LetterChanges(String str) { 
		 String out1 = shiftConsonants(str);
		 String out2 = capitalizeVowels(out1);
		 return out2;
	 }
		  
		  public static void main (String[] args) {  
		    // keep this function call here  
			  //Input:"hello*3"

//Output:"Ifmmp*3"


//Input:"fun times!"

//Output:"gvO Ujnft!"
		    System.out.print(LetterChanges("fun times!")); 
		  }
		  
		  
		  private static final String CONSONANTS = "abcdefghijklmnopqrstuvwxyz";
		  private static final String VOWELS = "aeiou";
		  
		  private static String shiftConsonants(String input) {
		      char[] chars = input.toLowerCase().toCharArray();
		      for (int i = 0; i < chars.length; i++) {
		          int idx = CONSONANTS.indexOf(chars[i]);
		          if (idx != -1)
		              chars[i] = CONSONANTS.charAt((idx + 1)% CONSONANTS.length());
		      } 
		      return new String(chars);
		 }
		  
		  private static String capitalizeVowels(String input) {
		      char[] chars = input.toLowerCase().toCharArray();
		      for (int i = 0; i < chars.length; i++) {
		          int idx = VOWELS.indexOf(chars[i]);
		          if (idx != -1)
		              chars[i] = Character.toUpperCase(VOWELS.charAt(idx));
		      }
		      return new String(chars);
		 }
		  
}
