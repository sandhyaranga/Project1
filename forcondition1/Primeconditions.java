package forcondition1;

public class Primeconditions {
	public static void main (String[] args) {
		int num1=7;
		int temp=1;
		for (int i=7; i<num1; i++) {
			if (num1 % i==0) {
				temp++;
			}
			
		}
		if(temp==1) {
			System.out.println("prime");
		}
		else {
			System.out.println("Not a Prime");
		}
	}

}
