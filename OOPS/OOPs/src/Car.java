
//Inheritance
public class Car extends Vehicle {

	private boolean powerSteering = false;
	private boolean ledScreen = true;
	
	public Car( String name, String color,String model,String company, String engine,boolean powerSteering, boolean ledScreen) {
	//super for sending args to parent class
		super(name, color, model, company,engine);
		this.ledScreen = ledScreen;
		this.powerSteering = powerSteering;
	
			
		}
	
	
	
	public void setPowerSteering(boolean powerSteering ) {
		this.powerSteering = powerSteering;
	}
	public void setledScreen(boolean ledScreen ) {
		this.ledScreen = ledScreen;
	}
	
	public boolean getPowerSteering() {
		 return this.powerSteering;
	}
	public boolean setledScreen() {
		return this.ledScreen;
	}
	
	
}

