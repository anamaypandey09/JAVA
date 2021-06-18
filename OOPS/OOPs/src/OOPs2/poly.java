package OOPs2;

public class poly {

	//Method Overloading-Compile time Polymorphism
	//Different number of arguments
	void test(int a) {
		System.out.println("1");
	}
	void test() {
		System.out.println("2");
	}
	
	//Sequence of Arguments
	void test(int a, String b) {
		System.out.println("1");
	}
	void test(String b, int a) {
		System.out.println("2");
	}
	
	
	//Type Of Arguments
	void test(char a) {
		System.out.println("1ch");
	}
	void test(String b) {
		System.out.println("2");
	}
	
	public static void main(String[] args) {
		poly p = new poly();
		p.test('@');

	}

}
