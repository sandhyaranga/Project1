package lms;

public class Splitchar {
	public static void main(String[] args) {
		String a=args[0];
		String[]b=a.split(",");
		String x=b[0];
		int y=Integer.parseInt(b[1]);
		char result=x.charAt(y);
		System.out.println(result);
	}

}
