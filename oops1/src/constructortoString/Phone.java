package constructortoString;

import encapsulation.Employee;

public class Phone {
	private String brand;
	private int price;
	private String model;
	private boolean isMadeInIndia;
	private Battery battery;
	public Phone(String brand, int price, String model,boolean isMadeInIndia,Battery battery) {
	this.brand=brand;
	this.price=price;
	this.model=model;
    this.isMadeInIndia=isMadeInIndia;
    this.battery=battery;
		
	}
	public void setBrand (String brand){
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice (int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setModel (String model) {
		this.model=model;
	}
	public String getModel() {
		return model;
	}
	
	public boolean setisMadeInIndia () {
		return  isMadeInIndia;
	}
	public void setisMadeInIndia (boolean isMadeInIndia) {
		this.isMadeInIndia=isMadeInIndia;
	}
	public void setBattery(Battery battery) { 
		this.battery=battery;
		}
	public Battery getBattery() {
		return battery;
	}
	public String toString() {
		return brand+" "+price+" "+model+" "+isMadeInIndia+" "+battery;
	}
	}
	