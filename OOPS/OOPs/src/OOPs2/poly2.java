package OOPs2;

//Method over riding
	
	class Test{
		void show() {
			System.out.println("1");
		}
	}
	
	class XYZ extends Test{
		void show() {
			System.out.println("2");
		}
		public static void main(String[] args) {
			Test t = new Test();
			t.show();
			
			XYZ x = new XYZ();
			x.show();
			//If want to use test from xyz class use super keyword
		}
	}
	
	

	//methodoverriding



