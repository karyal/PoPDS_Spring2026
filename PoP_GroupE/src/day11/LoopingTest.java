package day11;

public class LoopingTest {

	public static void main(String[] args) {
		//print PCPS College
		//System.out.println("PCPS College");
		//1, 50, 13, 187
		//Loop Design
		//1. Start: 1
		//2. Stop: 187
		//3. Condition: start<=stop
		//4. Statement(s): System.out.println(start)
		//5. Modifier: ++ Increment
		
		//Example-2
		//Print 10-1
		int start=5;
		int stop = 1;
		while(stop<=start) {
			System.out.print(start+" ");
			start-=1;
		}
		System.out.println();
		
		//Example-1
		/*
		//Print 1-10.
		int start=1;
		int stop=10;
		while(start<=stop) {
			System.out.print(start+" ");
			start+=1;
		}
		*/
	}

}














