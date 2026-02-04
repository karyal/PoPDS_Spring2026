package day12;

public class MyMethodTest {
	//static block will execute before main method
	static
	{
		System.out.println("PCPS");
	}
	
	public static void main(String[] args) {
		MyMethods.m2(); //Call static method
		new MyMethods().m1();//Call non-static method
		new MyMethods().m2();//Call static method
		new MyMethods().m1("Hello");
		new MyMethods().m1(34.98);
		
		new OverloadDemo().test();
		new OverloadDemo().test(34);
		new OverloadDemo().test(1, 4);
		double result = new OverloadDemo().test(45.67);
		System.out.println(result);
		
		Numbers nums1=new Numbers(56, 67);
		new MyMethods().m3(nums1); //Argument nums1
		
		Numbers nums2 = new Numbers(nums1);
		System.out.println(nums2);
		
		Numbers nums3 = new Numbers(5,8);
		System.out.println(nums3); //before swap 5,8
		nums3.swap(); //Call
		System.out.println(nums3); //after swap 8,5
		
		
		
		
		
		
		
	}

}
