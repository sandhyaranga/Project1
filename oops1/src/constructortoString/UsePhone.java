package constructortoString;

public class UsePhone {
	public static void main(String [] args) {
		Battery b=new Battery(5000,true);
		Phone p=new Phone("OPPO",25000,"F17",false,b);
		p.setBrand("samsung");
		System.out.println(p);
	}
}
