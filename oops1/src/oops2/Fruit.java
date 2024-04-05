package oops2;

public class Fruit {
	private String name;
	private int price;
	private String colour;
	public Fruit (String name,int price,String colour) {
		this.name=name;
		this.price=price;
		this.colour=colour;
	}
	public void setName (String name) {
		this.name=name;
	}
	public String getName () {
		return name;
	}
	public void setPrice (int price) {
		this.price=price;
	}
	public int getPrice () {
		return price;
	}
	public void setColour (String colour) {
		this.colour=colour;
	}
	public String getColour () {
		return colour;
	}
	public String toString () {
	return name+","+colour+" ,"+price ;
}
}
	
	

