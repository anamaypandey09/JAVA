
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle1 = new Vehicle();
		System.out.println(vehicle1.getName());
		vehicle1.setName("city");
		System.out.println(vehicle1.getName());
		
		
		Vehicle vehicle2 = new Vehicle("Honda Civic","Black","2012","Honda","800");
		System.out.println(vehicle2.getColor());
		vehicle2.setColor("Green");
		System.out.println(vehicle2.getColor());
		System.out.println(vehicle2.getSpeed());

		Car car1 = new Car("tesla","dusk","2021","moderator","1200",true,false);
		System.out.println(car1.getPowerSteering());
		System.out.println(car1.getName());
		
	
		
	}

}
