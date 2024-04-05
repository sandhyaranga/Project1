package sampleexceptionprograms;

public class StringIndexprogram {
	public static void main(String[] args) {
		System.out.println("Start");
		try {
			String a="Abcdefg";
			System.out.println(a.charAt(2));
			System.out.println(a.charAt(8));
			
		}
		catch (NumberFormatException npe ) {
			System.out.println("Error is occuring,change the input");
		}
		System.out.println("End");
	}

}



