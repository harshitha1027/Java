package pack;
import java.util.*;
public class scannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Student Details");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Student name: ");
		String name=input.nextLine();
		//System.out.println("Student name: "+name);
		
		System.out.println("Enter roll number: ");
		String roll=input.nextLine();
		//System.out.println("Roll number: "+roll);
		

		System.out.println("Enter branch: ");
		String branch=input.nextLine();
		//System.out.println("Branch "+branch);
		

		System.out.println("Enter college: ");
		String college=input.nextLine();
		
		System.out.println("Student name: "+name);
		System.out.println("Roll number: "+roll);
		System.out.println("Branch "+branch);
		System.out.println("College: "+college);
		
	}

}
