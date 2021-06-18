package vehicle;

public class Bike extends vehicle  {
private boolean fourStroke = true;
	public Bike(String name, String color,String model,String company,String engine,boolean fourStroke) {
		super(name,color,model,company,engine);
		this.fourStroke = fourStroke;
	}
	public boolean isFourStroke() {
		return fourStroke;
	}
	public void setFourStroke(boolean fourStroke) {
		this.fourStroke = fourStroke;
	}
	public String getInfo() {
		return "This is a bike";
	}
}
