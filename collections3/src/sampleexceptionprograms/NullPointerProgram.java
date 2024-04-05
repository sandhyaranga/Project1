package sampleexceptionprograms;

public class NullPointerProgram {
	public static void main(String[] args) {
		System.out.println("Start");
		try {
			String a=null;
			a.length();
			a.toUpperCase();
		
		}
		catch (NullPointerException npe) {
			System.out.println("Error is occuring,change the input");
		}
		System.out.println("End");
	}

}


