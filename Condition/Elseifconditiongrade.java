package Condition;

public class Elseifconditiongrade {
	public static void main (String[] args) {
		int a=101;
		if (a>=90 && a<=100) {
			System.out.println("O Grade");
		}
		else if(a>=80 && a<=89) {
			System.out.println("A Grade");
		}
		else if (a>=60 && a<=79) {
			System.out.println("B Grade");
		}
		else if (a>=50 && a<=59) {
			System.out.println("Average");
			}
		else if (a>=30 && a<=49) {
			System.out.println("Below Average");
		}
		else if (a<30) {
		System.out.println("Fail");
	}
	else {
		System.out.println("Invalid input");
	}
}
}
