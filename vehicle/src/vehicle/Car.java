package vehicle;

public class Car extends vehicle{

	private boolean powerSteering=false;
	private boolean ledScreen=true;
	
	public Car(String name, String color,String model,String company,String engine,boolean powerSteering,boolean leadScreen) {
		super(name,color,model,company,engine);
		this.ledScreen=ledScreen;
		this.powerSteering=powerSteering;
		
	}

public String getName() {
	return "Name of the vehicle is: " + super.getName();
	
}
	public boolean isPowerSteering() {
		return powerSteering;
	}

	public void setPowerSteering(boolean powerSteering) {
		this.powerSteering = powerSteering;
	}

	public boolean isLedScreen() {
		return ledScreen;
	}

	public void setLedScreen(boolean ledScreen) {
		this.ledScreen = ledScreen;
	}
	
	public String getInfo() {
		return "This is a car";
	}
	
	
}
