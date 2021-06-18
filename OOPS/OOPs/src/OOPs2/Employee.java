package OOPs2;

public class Employee {
	
	static class employee{
		private int emp_id;
		public void setemp_id(int eid) {
			emp_id=eid;
			
		}
		public int getemp_id() {
			return emp_id;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		employee e = new employee();
		e.setemp_id(12);
		System.out.println(e.getemp_id());
	}

}
