package forcondition;

public class Sample1 {
	public static void main(String[] args) {
		String a="S@nDhY@6290!";
				for (int i=0; i<a.length(); i++) {
					if (a.charAt(i)>='A' && a.charAt(i)<='Z') {
						System.out.println(a.charAt(i)+" "+"-"+" "+"Uppercase");
					}
					else if (a.charAt(i)>='a' && a.charAt(i)<='z') {
						System.out.println(a.charAt(i)+" "+"-"+" "+"Lowercase");
					}
					else if (a.charAt(i)>='0' && a.charAt(i)<='9') {
					System.out.println(a.charAt(i)+" "+"-"+" "+"Numbers");
					}
				else {
					System.out.println(a.charAt(i)+" - "+"Special characters");
				}
				}
	}
}