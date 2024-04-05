package sampleexceptionprograms;

public class Checkpassword {
	public static void main(String[] args) throws PasswordException{
		System.out.println("Start");
		try {
			String password="Dontusemypassword";
			if(password.length() >=8) {
				System.out.println("Password is ok");
			}
				else {
					System.out.println("Password length is not ok and create password more than or equal to 8 alphanumeric characters");
				}
		}
				catch(Exception pe) {
					pe.printStackTrace();
					}
				System.out.println("End");
		}
}
	


