package pack;
import java.util.*;
public class calculator {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("enter numbers");
		Scanner number=new Scanner(System.in);
		System.out.println("enter first number");
		int a=number.nextInt();
		System.out.println("enter second number");
		int b=number.nextInt();
		
		System.out.println("enter your choice");
		int c=number.nextInt();
		switch(c) {
		case 1:
			System.out.println("Addition");
			System.out.println(a+b);
			break;
			
		case 2:
			System.out.println("Subtraction");
			System.out.println(a-b);
			break;
		case 3:
			System.out.println("Multipication");
			System.out.println(a*b);
			break;
		case 4:
			System.out.println("division");
			System.out.println(a/b);
			break;
			
		}

	}

}
