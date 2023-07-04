package questions;

public class LargestOfThree {

	public static void main(String[] args) {
		int a=2, b=20, c=8;
		
		if (a > b) 
			if (a > c)
				System.out.println("Largest number is " + a);
			else
				System.out.println("Largest number is " + c);
		else if (b > c)
			System.out.println("Largest number is " + b);
		else
			System.out.println("Largest number is " + c);


	}

}
