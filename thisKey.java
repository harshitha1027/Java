package pack;
import java.util.*;
public class thisKey {
	void display() {
		this.show();
		System.out.println("Enter age");
		Scanner input=new Scanner(System.in);
		int age=input.nextInt();
		System.out.println("AGE: "+age);
	}
	void show() {
		System.out.println("enter student name:");
		Scanner input=new Scanner(System.in);
		String name= input.nextLine();
		System.out.println("name: "+ name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisKey h=new thisKey();
		h.display();

	}

}
