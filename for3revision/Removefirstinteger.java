package for3revision;

public class Removefirstinteger {
	public static void main(String[] args) {
		String a="Hello2406World";
		String b="";
		char []c=a.toCharArray();
		boolean flag=true;
		for(int i=0;i<c.length;i++) {
			if(c[i]>='0' && c[i]<='9' && flag!=false) {
				flag=false;
			}
			else {
				b=b+c[i];
			}
			}
		for(int i=b.length()-1;i>=0;i--) {
			System.out.println(b.charAt(i));
		}
	}

}
