package sampleexceptionprograms;

public class ArithmeticProgram {
	public static void main(String[] args) {
		System.out.println("Start");
		try {
			int num1=10;
			int num2=0;
			int result=num1/num2;
		}
		catch (ArithmeticException ae) {
			System.out.println("Error is occuring,change the input");
		}
		System.out.println("End");
	}

}
