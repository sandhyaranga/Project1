package sampleexceptionprograms;

public class NumberFormat {
	public static void main(String[] args) {
		System.out.println("Start");
		try {
			String a="TNO786";
			int i=Integer.parseInt(a);
		
		}
		//catch (NumberFormatException npe ) {
			//System.out.println("Error is occuring,change the input");
			//System.out.println(npe);
			//npe.printStackTrace();
		//}
		finally {
			System.out.println("DB is closed");
		}
		System.out.println("End");
	}

}



