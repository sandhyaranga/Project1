package practicequestions;

public class teststring {
public static void main(String [] args) {
	String str="TesTing";
	char a=str.charAt(0);
	char b=str.charAt(str.length()-1);
			if(a==b) {
				System.out.println("Two characters are equal");
			}
			else {
				System.out.println("Two characters are not equal");
			}
}
}
