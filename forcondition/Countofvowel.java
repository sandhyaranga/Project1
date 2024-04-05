package forcondition;

public class Countofvowel {
	public static void main (String[] args) {
		String a="Fantasy Program";
		int count=0;
		for (int i=0; i< a.length(); i++) {
			if (a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u') {
			count=count+1;
			}
		}
			System.out.println("Count of vowels"+" "+count);
			
		}
}

