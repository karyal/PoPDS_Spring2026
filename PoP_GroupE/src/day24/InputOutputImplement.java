package day24;

import java.util.Scanner;

public class InputOutputImplement implements InputOutput{

	@Override
	public int readInteger() {
		return Integer.parseInt(new Scanner(System.in).nextLine());
	}

	@Override
	public double readDouble() {
		return Double.parseDouble(new Scanner(System.in).nextLine());
	}

	@Override
	public String readString() {
		return new Scanner(System.in).nextLine();
	}

	@Override
	public void printInteger(int value) {
		System.out.print(value);
		
	}

	@Override
	public void printDouble(double value) {
		System.out.print(value);
		
	}

	@Override
	public void printString(String value) {
		System.out.print(value);	
	}
}