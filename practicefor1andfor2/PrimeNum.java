package practicefor1andfor2;

public class PrimeNum {
	public static void main (String[] args) {
	int [] num= {13,17,19,23,22,24,26,28};
	boolean b= true;
	for(int i=2;i<num[i];i++) {
		if(num[i]%i==0) {
			b=false;
		}
	}
	if(b==true) {
		System.out.println("Prime Number");
		}
	else {
		System.out.println("Not a Prime Number");
	}
}
}
