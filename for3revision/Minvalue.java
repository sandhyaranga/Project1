package for3revision;

public class Minvalue {
	public static void main(String[] args) {
		int []num= {24,2879,345678,12345,99};
		int min=num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]< min) {
				min=num[i];
			}
		}
		System.out.println(min);
		int count=1;
		for(int i=1;i<=min;i++) {
			count=count*i;
		}
		System.out.println(count);
		}
}


	
