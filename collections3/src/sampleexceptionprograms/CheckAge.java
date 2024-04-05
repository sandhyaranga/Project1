package sampleexceptionprograms;

public class CheckAge {
	public static void main(String[] args) throws AgeException {
		System.out.println("Start");

		try {
			int age = 17;
			if (age >= 18) {
				System.out.println("Eligible");
			} else {
				throw new AgeException("Not Eligible");
			}
		} catch (AgeException ae) {
			ae.printStackTrace();
		}
		finally {
		System.out.println("The election has come to an end");
	}
}
}
