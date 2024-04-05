package oops3;

public class UseBMW {
	public static void main(String[] args) {
    BMW b1=new BMW();
    System.out.println("COLOUR: "+b1.findColour("WHITE")+","+"BRAND: "+b1.findBrand("BMW 1")+","+" "+"WEIGHT: "+b1.findnetWeight(1234.56789d)+","+"COMFORT: "+b1.isComfortable(true));
}
}
