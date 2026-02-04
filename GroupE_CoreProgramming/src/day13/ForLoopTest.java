package day13;

public class ForLoopTest {

	public static void main(String[] args) {
		//v4
		int start=1;//start
		int stop=6; //stop
		for(;;) {
			System.out.println(start+ " "); //statement
			start++;//modifier
			if(start==stop)
				break;
		}
		
		
		//v3
		/*
		for(int i=1; i<=5; i++) {
			System.out.print(i+" ");
		}
		*/
		//v2
		/*
		int stop=5;
		for(int start=1; start<=stop; start++) {
			System.out.print(start+" ");
		}
		System.out.println();
		*/
		
		//v1
		/*
		int start=1;
		int stop=5;
		for(; start<=stop; start++) {
			System.out.print(start+" ");
		}
		*/
	}

}
