package streamObject;

public class Car {
	private String brand;
	private int price;
	private String colour;
	private boolean isPetrol;
	private int noOfSeats;
	public Car (String brand,int price,String colour,boolean isPetrol,int noOfSeats) {
		this.brand=brand;
		this.price=price;
		this.colour=colour;
		this.isPetrol=isPetrol;
		this.noOfSeats=noOfSeats;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public boolean isPetrol() {
		return isPetrol;
	}
	public void setPetrol(boolean isPetrol) {
		this.isPetrol = isPetrol;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public String toString() {
		return (brand+","+price+","+colour+","+isPetrol+","+noOfSeats);
	}

}
