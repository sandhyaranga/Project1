package oops2;

public class Mango extends Fruit {
	private float weight;
	private boolean isTasty;
	
public Mango(String name, int price, String colour, float weight, boolean isTasty) {
		super(name, price, colour);
		this.weight = weight;
		this.isTasty = isTasty;
	}
public void setWeight (float weight ) {
	this.weight=weight;
}
public float getWeight() {
	return weight;
}
public void setIsTasty (boolean isTasty) {
	this.isTasty=isTasty;
}
public boolean getIsTasty () {
	return isTasty;
}
public String findWeight (float weight) {
	if(weight >=1  && weight <=5) {
		return "goodQuality";
	}
	else if (weight > 5 && weight <=10) {
		return "verygood Quality";
	}
	else {
		return "notgood Quality";
	}
}
	public String toString() {
	return super.toString()+" "+isTasty+" "+weight;
}
}


