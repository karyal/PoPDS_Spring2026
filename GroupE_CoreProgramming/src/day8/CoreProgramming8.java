package day8;
import java.util.Scanner; //Library to read value form keyboard
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
		
		//Increment Operator
		num1=0;
		num1=num1+1;
		System.out.println(num1);//1
		num1=num1+5;
		System.out.println(num1);//6
		num1++; //increase by 1 num1=num1+1
		System.out.println(num1);
		num1+=7;
		num1=num1+7;
		System.out.println(num1);
		
		//Decrement Operator
		num1--; //Decrease by 1
		num1-=2;
		num1=num1-2;
		System.out.println(num1);
		
		//Conditional Operator
		int x, y;
		x=1;
		y=1;
		String result = (x==y)?"Equals":"Not Equals";
		System.out.println(result);
		
		//Example-1
		int pop=-1;
		int PM =40;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Marks of PoP : ");
		pop = Integer.parseInt(sc.nextLine());
		String result6 = (pop>=PM)?"PASS":"FAIL";
		System.out.println("Result : "+result6);
	}
}




















