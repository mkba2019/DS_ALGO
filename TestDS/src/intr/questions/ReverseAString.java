package intr.questions;

import java.util.Scanner;

public class ReverseAString {
	
	public static String reverse(String text) {
		if(text == null || text.length() == 0 ) return "Cant convert  string";
		char[] arr = text.toCharArray();
		
		int left = 0 ;
		int right = text.length()-1;
		
		for(left =0 ; left < right ; left++,right--) {
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
		}
		return String.valueOf(arr);
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a String: ");
		String inp = s.nextLine();
		System.out.println("Reverse of the String:--> " + inp + " is:--> " + reverse(inp));
		s.close();
		
	}

}
