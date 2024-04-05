package forwhile;

public class Rangearmstrong {
	public static void main (String [] args) {
		for(int i=200;i<=400;i++) {
			int a=i;
			int original=a;
			int temp=0;
			while(a!=0) {
				int r=a%10;
				temp=(temp*10)+r;
				a=a/10;
			}
			if(original==temp) {
				System.out.println(i);
			}
		}
	}
	

}
