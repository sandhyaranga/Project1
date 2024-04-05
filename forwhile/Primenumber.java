package forwhile;

public class Primenumber {
	public static void main(String [] args) {
		for(int i=5;i<=50;i++) {
			boolean result=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					result=false;
				}
			}
			if(result==true) {
				System.out.println(i+"is prime");
				
				}
			}
		}
	}



