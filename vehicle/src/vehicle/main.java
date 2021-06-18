package vehicle;

public class main {

	public static void main(String[] args) {
//		vehicle v1 = new vehicle();
//		v1.setName("city");
//		System.out.println(v1.getName());
//		System.out.println(v1.count);
//		vehicle v2 = new vehicle("civic","black","2012","honda","8000");
//		System.out.println(v2.getColor());
//		v2.setColor("blue");
//		System.out.println(v2.getColor());
//		System.out.println(v2.getSpeed());
//		System.out.println(v1.count);
//		
//		System.out.println(v1.getVehicle());
	
//	Car c1=new Car("civic","black","2012","honda","8000",true,false);
//	System.out.println(c1.isLedScreen());
//	System.out.println(c1.getName());
	
	vehicle v1 = new vehicle("civic","black","2012","honda","8000");
	System.out.println(v1.getInfo());
	
	vehicle v2 = new Car("civic","black","2012","honda","8000",true,false);
	System.out.println(v2.getInfo());
	
	vehicle v3 = new Bike("civic","black","2012","honda","8000",true);
	System.out.println(v3.getInfo());
	}

}
