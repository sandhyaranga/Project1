package forwhile;

public class Armstrongrange {
	public static void main(String [] args) {
		int a=151;
		int original=a;
		int temp=0;
		int count=0;
		while(a!-0) {
			int r=a%10;
			temp=(temp*10)+r;
			a=a/10;
		}
		if(original==temp) {
			
			
			
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not a Palindrome Number");
		}
	}

}
