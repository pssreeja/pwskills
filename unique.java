package questions;
import java.util.*;
public class unique {

	public static void main(String[] args) {
		String s = "leetcode";
		boolean flag = false;
		char[] c = s.toCharArray();
		HashMap<Character, Integer> m = new HashMap<>();
		for (int i=0; i<s.length();i++) {
			if (!m.containsKey(c[i])) {
				m.put(c[i], 1);
				if (s.indexOf(c[i], i+1) == -1){
					System.out.println(i);
					flag = true;
					break;
				}
			}
		}
		if (!flag) 
			System.out.println(-1);
	}

}
