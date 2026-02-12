package day13;

public class DoWhileTest {

	public static void main(String[] args) {
		//Print 1 to 5
		int start=1; //Start
		int stop=5; //Stop
		do {
			System.out.print(start+" "); //Statement(s)
			start+=1; //Modifier 2
		}while(start<=stop); //Condition
		System.out.println();
	}
}