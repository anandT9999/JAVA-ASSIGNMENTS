import java.util.*;
public class 10001stprime{

		
	public static void main(String[] args) {
		
		int i,n=10001,num=1,count=0;
		
		while(count<n)
		{
			num=num+1;
			
			for(i=2;i<=num;i++)
			{
				if(num%i==0)
				{
					break;
				}
			}
			
			if(i==num)
			{
				count=count+1;
			}
		}
		
		System.out.println(n+" th Prime no is : "+num);

	}

}