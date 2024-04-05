package sampleJava8;

public class UseMax {
	public static void main(String[] args) {
		int []z= {5,10,20,50};
		FindMax fm=new FindMax();
		Max m=fm::findMax;
		System.out.println(m.max(z));
	}
}
	


