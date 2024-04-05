package forcondition;

public class Uppercase {
	public static void main(String[] args) {
		String a="Language";
		for (int i=0; i<a.length();i++) {
			if (a.charAt(i)>='A' && a.charAt(i)<='Z') {
				System.out.println(a.charAt(i));
			}
		}
	}
}
