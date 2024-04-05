package oops2;

public class Vehicle {
	String brand;
	int price;
	String color;
	public String findNetPrice(int price,int tax) {
		return  "Net Amount = "+(price+tax);
	}
}
