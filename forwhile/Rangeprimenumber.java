package forwhile;

public class Rangeprimenumber {
	public static void main (String [] args) {
		for(int i=5;i<=50;i++) {
			int a=i;
			int original=a;
			int temp=0;
			while(a!=0) {
				int r=a%10;
				temp=temp+(r*r*r);
				a=a/10;
			}
			if(temp==origina) {
				System.out.println(i);
			}
		}
	}

}

}
