package practicequestions;

public class Questionsforpractice {
	public static void main (String [] args) {
	int a=1000000;
		if(a>=1 && a<10) {
			System.out.println("digit -"+1);
		}
		else if(a>=10 && a<99) {
			System.out.println("digit -"+2);
		}
		else if(a>=10 && a<1000) {
			System.out.println("digit -"+3);
		}
		else if(a>=1000 && a<10000) {
			System.out.println("digit -"+4);
		}
		else if(a>=10000 && a<100000) {
			System.out.println("digit -"+5);
		}
		else if(a>=100000 && a<1000000) {
			System.out.println("digit -"+6);
		}
		else {
			System.out.println("above 10 lakhs");
		}
}
}
			 
			
			
			
			


