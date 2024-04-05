package practicefor1andfor2;

public class Integerodd {
	public static void main (String [] args) {
	int [] num= {1,2,3,4,56,7,8,9,10};
	int count=0;
	int count1=0;
	for(int i=0;i<num.length;i++) {
		if(num[i]%2==0) {
			count=count+1;
		}
		else {
			count1=count1+1;
		}
	}
	System.out.println("Even number count:"+count);
	System.out.println("Odd number count: "+count1);
	}
	}
