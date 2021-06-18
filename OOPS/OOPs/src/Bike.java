
public class Bike extends Vehicle {

	

		private boolean fourStroke = true;
		public Bike(String name, String color,String model,String company, String engine, boolean fourStoke) {
			super(name, color, model, company,engine);
			this.fourStroke = fourStroke;
		}
		
		public String getInfo() {
			return "This is Bike";
		}
		
	}


