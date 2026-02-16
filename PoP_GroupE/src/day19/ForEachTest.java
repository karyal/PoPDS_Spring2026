package day19;

import java.util.ArrayList;
import java.util.List;

public class ForEachTest {

	public static void main(String[] args) {
		List nums=new ArrayList();
		nums.add(34);
		nums.add(32);
		nums.add(21);
		nums.add(67);
		nums.add(78);
		System.out.println(nums);
		
		//Print individually
		for (Object num: nums) { //for each next loop
			System.out.println(num);
		}
	}

}
