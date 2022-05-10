import java.util.*;
public class Main {

	public static void main(String[] args) {
	
		int n = 100;
		long squareSum = (long)Math.pow(((n*(n+1))/2),2);
		long ans = 0;
		long sum = 0;
		
		for(int i=1;i<=100;i++)
		{
			sum = (long)Math.pow(i, 2);
			ans += sum;
		}
		System.out.println(squareSum-ans);
	}
}