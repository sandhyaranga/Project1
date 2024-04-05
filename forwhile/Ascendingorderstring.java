package forwhile;

public class Ascendingorderstring {
	public static void main(String [] args) {
		String a="bottle";
		String temp="0";
		for(int i=0;i<a.length();i++) {
			for(int j=i+1;j<a.length();j++) {
				if(a.charAt(i)>a.charAt(j)) {
					temp=a.charAt(i);
					a.charAt(i)=a.charAt(j);
					a.charAt(j)=temp;
					
				}
				
			}
			
		}
	}

}
