
public class FindUnpairedElementArray {
	
	public static int findUnPaired(int arr[]) {
		int temp = 0 ;
		for(int i = 0 ; i < arr.length ; i++) {
			temp = temp ^ arr[i];
		}
		return temp;
	}
	
	public static void main(String[] args) {
		int[] array = new int[]{9,8,9,7 ,8, 7,6 };
		System.out.println("Unpaired element is----> " + findUnPaired(array));
	}

}
