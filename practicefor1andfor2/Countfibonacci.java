package practicefor1andfor2;

public class Countfibonacci {
	public static void main (String [] args) {
		int a=0;
		int b=1;
		int c=0;
		int total=0;
		for(int i=1;i<=7;i++) {
			c=a+b;
			total=total+a;
			a=b;
			b=c;
		}
		System.out.println(total);
	}
}
