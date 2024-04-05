package abstractclass;

public abstract class Vehicle {
	public int findNetPrice (int amount,int taxPercentage) {
		return amount*taxPercentage/100;
	}
	public abstract void findMileage (int speed);
}	


