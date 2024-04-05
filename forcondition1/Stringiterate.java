package forcondition1;

public class Stringiterate {
	public static void main (String[] args) {
		String a="Apple";
		for (int i=0; i<= a.length()-1; i++) {
			System.out.println(a.charAt(i));
		}
		for (int i=a.length()-1;i>=0 ; i--) {
			System.out.println(a.charAt(i));
		}
	}
}
