package sampleJava8;

public interface Car {
	public int netPrice(int price);
	public String regNum(String reg);
	public static String type(String type) {
		return type;
	}
	public default String model(String mod) {
		return mod;
	}

}
 