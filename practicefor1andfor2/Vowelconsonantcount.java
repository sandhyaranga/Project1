	
package practicefor1andfor2;

public class Vowelconsonantcount {
public static void main (String [] args) {
	String a="python programming";
	int count=0;
	int count1=0;
	for(int i=0;i<a.length();i++) {
		if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u') {
			count=count+1;
		}
		else {
			count1=count1+1;
			
		}
}
System.out.println("vowels count: "+ count);
System.out.println("consonants count: "+ count1);
}
}
