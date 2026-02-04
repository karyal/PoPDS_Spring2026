package day13;

public class ForLoopTest2 {
	
	public static void main(String[] args) {
		//Convert 'A' to 'a'
		char ch='A';
		System.out.println(ch);
		//System.out.println((int)ch);
		int tmp=(int)ch;
		tmp=tmp+32;
		System.out.println((char)tmp);
		/*
		for(int i=0; i<=256; i++) {
			//try to convert int to char
			System.out.println(i+ " = "+(char)i); //int cast to char
		}
		*/
		
	}
	
}