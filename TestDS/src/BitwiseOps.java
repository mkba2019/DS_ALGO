
public class BitwiseOps {

	//if both 1 return 1 or return 0
	public static int bitwiseAnd(int x, int y) {
		return x  & y;
	}
	
	//returns 1 if at least one corresponding bit of two operands is 1.
		public static int bitwiseOR(int x, int y) {
			return x  | y;
		}
		
		//returns 1 if the corresponding bits of two operands are opposite
	public static int bitwiseXOR(int x, int y) {
					return x  ^ y;
				}
	
	
	public static void main(String[] args) {
		System.out.println(bitwiseAnd(25,10));
		System.out.println(bitwiseOR(25,10));
		System.out.println(bitwiseXOR(25,12));

	}
	
	
}
