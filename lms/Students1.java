package lms;

public class Students1 {

	public static void main (String[] args) {
	    String a=args[0];
		String []b=a.split(",");
		String x=b[0];
		char y=b[1].charAt(0);
		String z=b[3];
	int num1=Integer.parseInt(b[2]);
	float num2=Float.parseFloat(b[4]);
	long num3=Long.parseLong(b[5]);
	boolean result=Boolean.parseBoolean(b[6]);
    System.out.println(x+" "+y+" "+z+" "+num1+" "+num2+" "+num3+" "+result);
		
		
	}

}
