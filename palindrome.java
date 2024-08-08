package har;

public class palindrome {

	public static void main(String[] args) 
	{
		int x=212;
		int rem=0;
		int sum=0;
		int i=1;
		while(x!=0)
		{
			rem=x%10;
			sum=sum+rem*i;
			x=x/10;
		i*=10;
		
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
