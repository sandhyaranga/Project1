package day1;

public class UsePen {
	public static void main(String[]args){
		Pen p=new Pen();
		p.brand="Reynolds";
		p.colour="Red";
		p.price=20;
		Pen p1=new Pen();
		p1.brand="Montex";
		p1.colour="Blue";
		p1.price=30;
		Pen p2=new Pen();
		p2.brand="Fabercastle";
		p2.colour="Green";
		p2.price=40;
		p.taxPercentage=10;
		p.taxAmount=p.price* p.taxPercentage/100;
		p.netPrice=p.price+p.taxAmount;
		System.out.println (p.brand+" "+p.colour+" "+p.price);
		System.out.println (p1.brand+" "+p1.colour+" "+p1.price);
		System.out.println (p2.brand+" "+p2.colour+" "+p2.price);
		System.out.println (p.netPrice);
		
		
	}

}
