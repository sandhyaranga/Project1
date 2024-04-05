package sampleJava8;

public class UseClass {
	public static void main(String[] args) {
		Calculator add=(a,b)->a+b;
		System.out.println(add.math(10,20));
			Calculator multi=(a,b)->a*b;
		System.out.println(multi.math(10,5));
		Calculator max=(a,b) -> {
			if(a>b) {
				return a;
			}
			else {
				return b;
			}
		};
		System.out.println(max.math(10,20));
	}

}
