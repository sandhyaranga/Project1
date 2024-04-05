package Condition;

public class Vowelconsonant {
	public static void main (String[] args) {
		String a="Try";
		if (a.contains("a")|| a.contains("e")|| a.contains("i") || a.contains("o") ||a.contains("u")) {
			System.out.println(a+" "+"is a vowel");
		}
		else {
			System.out.println(a+" "+"Not a vowel");
		}
}
}