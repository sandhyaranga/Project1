package sampleexceptionprograms;

public class ArrayIndexprogram {
	public static void main(String[] args) {
		System.out.println("Start");
		try {
			int []a= {6,12,18,24};
			System.out.println(a[2]);
			System.out.println(a[4]);
		}
		catch (NumberFormatException npe ) {
			System.out.println("Error is occuring,change the input");
		}
		System.out.println("End");
	}
}


