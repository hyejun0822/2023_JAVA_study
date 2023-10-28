
public class BitOperator2 {

	public static void main(String[] args) {
		int x = 0b00001101;
		int y = 0b00001010;
		
		System.out.print("x & y = " + (x&y) + "    ");
		System.out.print("x | y = " + (x|y) + "    ");
		System.out.print("x ^ y = " + (x^y) + "    ");
		System.out.println("~x = " + (~x) + "    ");
		System.out.print("x >> 1 = " + (x>>1) + "    ");
		System.out.print("x << 1 = " + (x<<1) + "    ");
		System.out.print("x >>> 1 = " + (x>>>1));
	}

}
