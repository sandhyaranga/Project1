package practicefor1andfor2;

public class Primenumber {
	public static void main (String [] args) {
		int a=17;
		boolean b=true;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				b=false;
			}
			}
		if (b==true) 
		{
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a Prime Number");
		}
	}
}
			
		
		
	
