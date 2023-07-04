package questions;

public class Average {

	public static void main(String[] args) {
		int[] list = new int[] {
				1,2,4,6,7,10,14
		};
		int i = 0, size = list.length, sum = 0;
		
		do {
			sum += list[i];
			i++;
		} while (i < size);

		System.out.println("Average is " + ((float)sum/size));
	}

}
