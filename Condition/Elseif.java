package Condition;

public class Elseif {
	public static void main (String[] args) {
		int a=20000;
		int b=3000;
		int c=2000;
		if (a>b && a>c) {
			System.out.println("a is biggest");
		}
		else if (b>a && b>c) {
			System.out.println("b is biggest");
		}
		else {
			System.out.println("c is biggest");
		}
	}

}
