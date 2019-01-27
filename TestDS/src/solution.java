import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class solution {
	
	  public static int solutiona(String S, int K) {
	        // write your code in Java SE 8
	        List<String> result = new ArrayList<>();
	        Pattern p = Pattern.compile("\\b.{1," + (K-1) + "}\\b\\W?");
	        Matcher m = p.matcher(S);
	        
	        while(m.find()) {
	            System.out.println(m.group());
	            result.add(m.group());
	        }
	        
	        return result.size();
	    }
	  
	  
	  public static void main(String[] args) {
		int x = solutiona("SMS messasges are really short", 12);
		System.out.println(x);
	}

}
