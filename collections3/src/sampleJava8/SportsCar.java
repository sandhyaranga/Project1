package sampleJava8;

public class SportsCar implements Car {
	public int netPrice(int price) {
		return price+(price*5/100);
	}
	public String regNum(String reg) {
		return reg;
	}
	public String model(String model) {
		return "SportsCar model is"+model;
	}
	}


