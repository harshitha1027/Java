package pack;

public class overiding
{
	public void display()
	{
		System.out.println("It is a dog");
		
	}
	public static class Dog extends overiding
	{
		public void display()
		{
		System.out.println("It is a golden dog");
		
		}
	
	
		
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.display();
		
	}
	}

}

