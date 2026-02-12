package day16;

class Class0{
	public Class0() {
		System.out.println("Hello");
	}
	public Class0(int x) {
		System.out.println(x);
	}
	public void f1() {
		System.out.println("Hello from f1 of Class0");
	}
}
public class Class1 extends Class0 {
	public Class1() {
		System.out.println("Hello");
	}
	public Class1(String str) {
		System.out.println(str);
	}
	@Override
	public void f1() {//Rewrite the method of super class
		System.out.println("Hello from f1() of Class1");
	}
}


















