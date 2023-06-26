package questions;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {0,1,0,3,12};
		
		if (nums.length != 1)
			arrayFn(nums);
		for (int i : nums) {
			System.out.println(i);
		}
	}
	
	static void arrayFn(int[] n) {
		for (int i=0,j=1;j < n.length;) {
			if (n[i]==0) {
				if (n[j]!=0) {
					int t = n[j];
					n[j] = n[i];
					n[i] = t;
					i++;
				} 
				j++;
			}
		}
	}

}
