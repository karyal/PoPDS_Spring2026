package day9;

public class ArrayTest {

	public static void main(String[] args) {
		//What is Array?
		//How to use Array?
		int ages[]=new int[4];
		ages[0]=18;
		ages[1]=23;
		ages[2]=16;
		ages[3]=19;
		System.out.println(ages[2]);
		//21 replaced by 16
		ages[2]=16;
		System.out.println(ages[2]);
		
		//Calculate the sum of values
		int sum = ages[0]+ages[1]+ages[2]+ages[3];
		System.out.println(sum);
		
		//Calculate the average of values
		int avg = sum/ages.length;
		System.out.println(avg);
		
		//Find the largest value
		//Find the smallest value
		//Find the specific value (i.e. 15) (Found/Not found)
	}

}









