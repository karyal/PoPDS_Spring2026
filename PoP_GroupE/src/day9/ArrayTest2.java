package day9;

public class ArrayTest2 {

	static int MAX=5; //Global Variable
	
	public static void main(String[] args) {
		//Array declare and initialize
		int ages[]= {15, 16, 19, 22, 23}; //Local Variable
		System.out.println(MAX);
		printValues(ages); //Sending values to method - ages (argument)
		System.out.println(ages[3]);
	}
	
	public static void printValues(int ages[]) { //array as parameter
		System.out.println(MAX);
		System.out.println(ages[0]+", "+ages[1]);
		//scope - visibility of variable
	}

}
