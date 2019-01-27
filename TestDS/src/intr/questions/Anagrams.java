package intr.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams {
	
	public static boolean isAnagrams(String text1, String text2) {
		//create hashmap to store text1 character and its frequency
		Map<String, Integer> map1 = getMap(text1);
		
		//create hashmap to store text2 character and its frequency
		Map<String, Integer> map2 = getMap(text2);
				
		//compare both maps		
		return map1.equals(map2);
	}

	private static Map<String, Integer> getMap(String input) {
		char inpArray[] = input.toCharArray();
		Map<String, Integer> outputMap = new HashMap<String, Integer>();
		
		for (int i = 0 ; i < inpArray.length ; i++) {
			String ch = String.valueOf(inpArray[i]);
			if(outputMap.containsKey(ch)) {
				Integer currentCount = outputMap.get(ch);
				outputMap.put(ch, currentCount);
			} else {
				outputMap.put(ch, 1);
			}
		}
		return outputMap;
	}

	public static boolean isAnagrams_Sorting(String text1, String text2) {
		char[] charArray1 = text1.toCharArray();
		Arrays.sort(charArray1);
		char[] charArray2 = text2.toCharArray();
		Arrays.sort(charArray2);
		
		return Arrays.equals(charArray1, charArray2);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter  String 1 : ");
		String inp = s.nextLine();
		System.out.println("Please enter  String 2 : ");
		String inp2 = s.nextLine();
		boolean b = false;
		if(inp != null && inp2 != null)
          b = isAnagrams(inp, inp2);
        
        if(b) {
    		System.out.println(  inp + " and "  + inp2 + " are anagrams");
        } else {
    		System.out.println(  inp + " and "  + inp2 + " are not  anagrams");

        }
		s.close();
		
	}
}
