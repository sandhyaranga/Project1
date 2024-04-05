package sampleexceptionprograms;

public class MultipleCatchProgram {
	public static void main(String[] args) {
		System.out.println("Start");
		try {
			String []a= {"Sandhya","Saanvi","Lakshmi"};
			System.out.println(a[2].charAt(8));
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			ae.printStackTrace();
		}
		catch(IndexOutOfBoundsException ie) {
			ie.printStackTrace();
		}
		catch(RuntimeException re) {
			re.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("End");
	}
}
