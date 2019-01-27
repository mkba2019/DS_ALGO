import java.util.Arrays;

public class FindMissingNumArry {
	
	
	 public static int solution(int[] A) {

Arrays.sort(A);

System.out.println(Arrays.toString(A));
return 0;
	     
	 }
	 
	 
	 public static void main(String[] args) {
		 int[] arr = new int[] { 0,1,0,0,1,0,1};
		System.out.println(solution(arr));
	}

}
