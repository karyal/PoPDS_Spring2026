package day16;

//Interface is a container of abstract methods and final variables
interface Inferfac1 {
	public void f1(); //must override in sub class
	public void f2(); //must override in sub class
}

class Class03 implements Inferfac1{
	@Override
	public void f1() {
		System.out.println("Hello from f1");
	}
	@Override
	public void f2() {
		System.out.println("Hello from f2");
	}
}
public class Class3{

}
