package day3;

public class LaptopTest {
	public static void main(String[] args) {
		int num1; //Variable declare - basic type - default 0
		Laptop l1; //Object declare - Class type - default - null
		l1=new Laptop(); //Allocate memory
		l1.mfgBy="Lenovo";
		l1.model="LIP9090";
		System.out.println(l1.mfgBy+", "+l1.model);
		
	}
}
