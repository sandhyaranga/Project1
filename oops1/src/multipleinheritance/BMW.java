package multipleinheritance;

public class BMW implements Automobile,Car {
	public void findMileage(int speed) {
		if(speed > 0 && speed<=30) {
			System.out.println(60);
		}
		else if(speed > 30 && speed <=60) {
			System.out.println(80);
		}
		else {
			System.out.println(40);
		}
	}
	public String car(String brand, String colour) {
		return "BMW-XL"+" "+"WHITE";
		
	}
	
}
