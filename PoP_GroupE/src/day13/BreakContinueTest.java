package day13;

public class BreakContinueTest {

	public static void main(String[] args) {
		//Break
		/*
		for(int i=1; i<=10; i++) {
			System.out.print(i+" "); 
			if(i==5)
				break; //exit from block i.e. loop
		}
		*/
		
		//Continue
		for(int i=1; i<=10; i++) {
			if(i==5)
				continue; //move to line number 16 for increment
			System.out.print(i+" ");
		}
		
		
		
		
		
		
		
		
	}

}








