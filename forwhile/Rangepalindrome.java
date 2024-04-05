package forwhile;

public class Rangepalindrome {
	public static void main (String [] args) {
		for(int i=100;i<=1000;i++) {
			int a=i;
			int original=a;
			int temp=0;
			while(a!=0) {
				int r=a%10;
				temp=temp+(r*r*r);
				a=a/10;
			}
			if(temp==original) {
				System.out.println(i);
			}
		}
	}

}
