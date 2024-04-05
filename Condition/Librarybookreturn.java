package Condition;

public class Librarybookreturn {
	public static void main (String[] args) {
		int noOfDays=20;
				
		if (noOfDays>=1 && noOfDays<=5) {
			
			System.out.println("Fine Rs "+noOfDays*2);
		}
		else if(noOfDays>=6 && noOfDays<=10) {
			System.out.println("Fine Rs "+noOfDays *5);
		}
		else if (noOfDays>=11 && noOfDays <=30) {
			System.out.println("Fine Rs "+noOfDays *7);
		}
		
	else {
		System.out.println("Membership will be cancelled");
	}
}
}

