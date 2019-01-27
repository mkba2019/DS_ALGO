package intr.questions;

import java.util.Arrays;

public class PermutaionDetector {
	
	public boolean isPermutation(String text, String perm) {
		if(text.length() != perm.length()) return false;
		return (sort(text).equalsIgnoreCase(sort(perm)));
	}
	
	private String sort(String s) {
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	
	public static void main(String[] args) {
		PermutaionDetector a = new PermutaionDetector();
		System.out.println("Permutaion of abc and cba --> " + a.isPermutation("abc", "cba"));
		System.out.println("Permutaion of abc and xyz --> " + a.isPermutation("abc", "xyz"));
		System.out.println("Permutaion of abc and xyzhshsh --> " + a.isPermutation("abc", "xyzhshsh"));


	}

}
