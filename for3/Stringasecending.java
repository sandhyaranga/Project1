package for3;
public class Stringasecending {
	public static void main(String [] args) {
		String a="bottle";
		char temp=0;
		char [] b=a.toCharArray();
		for(int i=0;i<b.length;i++) {
			for(int j=i+1;j<b.length;j++) {
				if(b[i] > b[j]) {
					temp=b[i];
			        b[i]=b[j];
			        b[j]=temp;
				}
			}
			System.out.println(b[i]);
			
		}
	}
	

}
