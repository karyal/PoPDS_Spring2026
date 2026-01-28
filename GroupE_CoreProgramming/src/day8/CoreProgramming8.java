package day8;

public class CoreProgramming8 {

	public static void main(String[] args) {
		//Relational Operators
		int num1;
		int num2;
		
		//Equals to ==
		num1=5;
		num2=5;
		boolean result1 = (num1==num2); //int
		System.out.println(result1); //false
		System.out.println((10.23==34.98)); //float/double
		System.out.println(('A'=='A'));
		System.out.println((true==false));
		System.out.println(("pcps"=="pcps"));
		
		//Not Equals to !=
		num1=8;
		num2=5;
		boolean result2 = (num1!=num2);
		System.out.println(result2); //false
		
		//Greater Than >
		//Left value is GT Right Value -> true
		num1=8;
		num2=5;
		boolean result3 = (num1>num2);
		System.out.println(result3);//
		result3 = (num2>num1);
		System.out.println(result3);//
		result3 = (num2>num2); //int
		System.out.println(result3);//
		System.out.println((12.45>12.46));//float
		System.out.println(('A'>'a'));
		//System.out.println((true>false));//Cann't compare String >
		//System.out.println(("pcps">"PCPS")); //Cann't compare String >
		
		//Less Than < 
		//Left value is less than right value - true
		num1=34;
		num2=56;
		boolean result4=(num1<num2);
		System.out.println(result4);//true
		result4=(num2<num1);
		System.out.println(result4);//false
		//compare float
		//compare boolean
		//compare character
		//compare String
		
		
		//Greater than or equals to >=
		//Left value is greater than or equals to right value - true
		num1=9;
		num2=9;
		boolean result5 = (num1>=num2);
		System.out.println(result5);
		
		num1=7;
		num2=9;
		result5 = (num1>=num2);
		System.out.println(result5);
		
		//Less than or equals to <=
		//Example
		
	}
}




















