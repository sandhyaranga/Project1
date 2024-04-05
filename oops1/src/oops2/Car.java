package oops2;

public class Car  extends Vehicle{
	boolean isPetrol;
	int noOfSeats;
	public int findMileage(int speed ) {
		if(speed >0 && speed<=20) {
			return 60;
		}
		else if(speed > 20 && speed <=40) {
			return 40;
		}
		else { 
			return 20;
		}
	}
}	

