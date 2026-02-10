package day15;

public class Test {

	public static void main(String[] args) {
		Class5 obj5=new Class5();
		obj5.setNum1(45);
		obj5.setNum2(32);
		MyCalculator mc = new MyCalculator();
		System.out.println(obj5);
		obj5 = mc.calculateSum(obj5);
		System.out.println(obj5);
		
		/*
		//Class-4 Test
		Class4 c4obj1=new Class4();
		System.out.println(c4obj1);
		c4obj1.setNum1(34);
		c4obj1.setNum2(54);
		System.out.println(c4obj1.getNum1());
		System.out.println(c4obj1.getNum2());
		
		//Parameterized Constructor
		c4obj1=new Class4(67, 78);
		System.out.println(c4obj1);
		c4obj1.setNum1(34);
		c4obj1.setNum2(54);
		System.out.println(c4obj1.getNum1());
		System.out.println(c4obj1.getNum2());
		
		//Copy Constructor
		c4obj1=new Class4(c4obj1);
		Class4 c4obj2=new Class4();
		System.out.println(c4obj2);
		c4obj2.setNum1(34);
		c4obj2.setNum2(54);
		System.out.println(c4obj2.getNum1());
		System.out.println(c4obj2.getNum2());
		*/
		
		/*
		//Class-3 Test
		Class3 c3obj1=new Class3();
		c3obj1.setNum1(34);//Super Class
		c3obj1.setNum2(32); //Sub Class
		int tmp=c3obj1.getNum1(); //Super Class
		int tmp2=c3obj1.getNum2(); //Sub Class
		System.out.println(c3obj1); //toString -> Sub Class
		*/
		
		/*
		//Class-2 Test-1
		Class2 c2obj1=new Class2(); //Default Constructor
		System.out.println(c2obj1); //toString
		c2obj1.setNum2(90); //Setter
		int tmpNum=c2obj1.getNum2(); //Getter
		System.out.println(tmpNum);
		
		//Class-2 Test-2
		
		//Class-2 Test-3
		*/
		/*
		//Class1 Test-1
		Class1 obj1=new Class1();
		obj1.setNum1(34);
		int num1=obj1.getNum1();
		System.out.println(num1);
		
		//Class1 Test-2
		 obj1=new Class1(54);
		 num1=obj1.getNum1();
		 System.out.println(num1);
		 
		 //Class1 Test-3
		 Class1 obj2=new Class1(obj1);
		 num1=obj2.getNum1();
		 System.out.println(num1);
		 */
	}

}
