package sampleJava8;

public class UseCar {
	public static void main(String[] args) {
		SportsCar s=new SportsCar();
		System.out.println(s.netPrice(500000));
		System.out.println(s.regNum("TN071234"));
		System.out.println(Car.type("Petrol"));
		System.out.println(s.model(" ABC"));
	}
}

