package oops2;

public class UseCar {
	public static void main(String [] args) {
	 Car car=new Car();
	 car.brand="Civic";
	 car.price=100000;
	 car.color="White";
	 car.isPetrol=true;
	 car.noOfSeats=5;
	 System.out.println(car.brand+" "+car.price+" "+" "+car.color+" "+car.isPetrol+" "+car.noOfSeats+" "+car.findNetPrice (car.price,5000)+car.findMileage(45));
	}
}
