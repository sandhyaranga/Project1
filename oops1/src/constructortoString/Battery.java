package constructortoString;

public class Battery { 
	private int capacity;
	private boolean isLithium;
	private Battery battery;
	public Battery(int capacity,boolean isLithium) {
		this.capacity=capacity;
		this.isLithium=isLithium;
	}
	public void setCapacity (int capacity) {
		this.capacity=capacity;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setIsLithium (boolean isLithium ) {
		this.isLithium=isLithium;
	}
	public boolean getIsLithium() {
		return isLithium;
	}
	public void setBattery(Battery battery) { 
		this.battery=battery;
		}
	public Battery getBattery() {
		return battery;
		}
	public String toString() {
		return capacity+" "+isLithium;
	}
	}	


