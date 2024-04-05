package sampleexceptionprograms;

public class ProgramNullPointer1 {
	public static void main(String[] args) {
		System.out.println("Start");
		String a=null;
			a.length();
			a.toUpperCase();
		System.out.println("Error is occuring,change the input");
	    System.out.println("End");
	}
}
