package assignment1;

import java.util.Iterator;

public class q_5 {

	public static void main(String[] args) 
	{
		System.out.println("prime no from 1 to 100 : ");
		for (int i = 0; i <= 100; i++) 
		{
			int count=0;
			for (int j = 1; j <= i; j++) 
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if (count==2) 
			{
				System.out.print(i+" ");
			}
		}
	}

}
