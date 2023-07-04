package questions;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 10, a = 1, b = 1, c = 1;
		
		System.out.print(c + ",");
		for (int i=0; i<n; i++) {
			System.out.print(c + ",");
			c = a + b;
			a = b;
			b = c;
		}
	}

}
