package stringrevision;

public class Equalatleastoneequal {
	public static void main(String[] args) {
		int a=99;
		int b=84;
		int c=99;
		int d=84;
		if((a==b) && (b==c) && (c==a) && (a==d) && (b==d) && (c==d)) {
			System.out.println("All are equal");
		}
		else if((a==b) || (b==c) || (c==a) || (a==d) || (b==d) || (c==d)) {
			System.out.println("Atleast two are equal");
		}
		else if((a!=b)&&(b!=c) &&(a!=c) && (a!=d) && (b!=d)& (c!=d)) {
			System.out.println("All are not equal");
		}
		else {
			System.out.println("Invalid input");
		}
		}
}
