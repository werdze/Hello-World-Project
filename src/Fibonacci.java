import java.util.Scanner;


public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.println("Enter the nth fibonacci number:");
		Scanner x = new Scanner( System.in );
		int n = 0;//x.nextInt();
		for(int i = 0; i<=9; i++)
			System.out.println(fibo(i));
	}
	
	public static long fibo(int n)
	{
		long ans = 0;
		//ans = n + (n-1)/n;
		
		
		ans = (long) Math.pow(n, 1.5)/ - 1;
		
		
		return ans;
	}
	
	
}
