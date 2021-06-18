package OOPs2;

public class abstrctinterface{

	//all methods are public and abstract
	
	interface I1{
		
		void show();
		void add(int a, int b);
	}
	
	static class Test implements I1{
		
		public void show() {
			System.out.println("1");
			
		}
		public void add() {
			
		}
		
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.show();
	}
	
}

