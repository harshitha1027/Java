package pack;

public class inheritance {
	int salary=70000;
	public static class Engineer extends inheritance{
		int bonus=10000;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engineer e1=new Engineer();
		System.out.println("salary: "+e1.salary+"\nBonus: "+e1.bonus);

	
	}
}
