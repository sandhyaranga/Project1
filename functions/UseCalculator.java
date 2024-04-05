package functions;

public class UseCalculator {
	
	public static void main(String [] args) { 
		Calculator c=new Calculator();
		System.out.println(c.add());
		c.sub();
		System.out.println(c.findOddOrEven(7));
		System.out.println(c.findGreatest(34,576,68,987));
		System.out.println(c.primenumber(17));
		c.fibonacci();
		System.out.println(c.palindrome("mom"));
		c.duplicate("banana");
		int [] num = {9,8,4,9,8,4,3,2,1};
		System.out.println(c.group(num));
}
	}
