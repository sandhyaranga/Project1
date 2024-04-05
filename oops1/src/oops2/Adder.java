package oops2;

public class Adder {
	public String add(int a,int b) {
		return "Ans= "+(a+b);
		}
	public int add (int a,int b,int c) {
		return a+b+c;
	}
	public float add (int a,float b) {
		return a+b;
	}
	public void add(int a,float b,long c) {
		System.out.println(a+b+c);
	}
	public double add(long a,float b) {
		return a+b;
	}
}
