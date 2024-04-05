package for3revision;

public class Primenumber {
	public static void main(String[] args) {
		int a=19;
		boolean b=true;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				b=false;
			}
		}
		if(b==true) {
			System.out.println ("Prime");
		}
		else {
			System.out.println ("Not a prime");
		}
		}
	}
			
			

