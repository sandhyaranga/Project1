package forwhile;

public class Armstrong {
	public static void main (String[] args) {
		int a=153;
		int original=a;
		int temp=0;
		while(a!=0) {
			int r=(a%10);
			temp=temp+(r*r*r);
			a=a/10;
		}
		if(temp==original) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not an Armstrong");
			
			
			
			
			
			
			
			
		}
	}

}
