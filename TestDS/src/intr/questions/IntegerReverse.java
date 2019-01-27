package intr.questions;

import java.util.Scanner;

public class IntegerReverse {
	
	public static int reverseInt(int num) {
		boolean isNegative = num > 0 ? false :true;
		if(isNegative) num = num * -1;
		
		int reverse = 0 ;
		int lastDigit = 0 ;
		
		while(num >= 1) {
			lastDigit = num % 10;
			reverse = reverse * 10 + lastDigit;
			num = num /10;
		}
		
		return isNegative == true  ? reverse*-1 : reverse;
	}
	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	System.out.println("Please enter an Integer: ");
	int inp =  s.nextInt();
	System.out.println("Reverse of the Integer :--> " + inp + " is:--> " + reverseInt(inp));
	s.close();
	}
	

}
