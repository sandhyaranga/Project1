
public class Intpalindrome {
	public static void main(String[] args) {
		int a=121;
		int original=a;
		int temp=0;
		while(a!=0) {
			int r=a%10;
			temp=(temp*10)+r;
			a=a/10;
			} 
		if(original==temp) {
		System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}
}

 


