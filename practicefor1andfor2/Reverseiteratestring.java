package practicefor1andfor2;

public class Reverseiteratestring {
	public static void main (String [] args) {
		String a="fantasyworld";
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
			}
		System.out.println(b);
		}
}
