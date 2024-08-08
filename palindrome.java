package har;

public class palindrome {

	public static void main(String[] args) 
	{
		int x=212;
		int rem=0;
		int sum=0;
		
		while(x!=0)
		{
			rem=x%10;
			sum=sum*10+rem;
			x=x/10;
		
		
		}
		System.out.println(sum);
		
		
	
	if (x==sum) { 
		System.out.println("given number is a palindrome");
}
	else
{
		System.out.println("given number is not a palindrome");
}
			
		

}
}
