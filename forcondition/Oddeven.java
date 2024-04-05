package forcondition;

public class Oddeven {
	public static void main(String[] args) {
		for (int i=20; i<=100; i++)
		{
			if (i%2==0) {
				System.out.println(i+"-"+"Even");
			}
			else {
				System.out.println(i+" "+"Odd");
			}
		}
	}
}
