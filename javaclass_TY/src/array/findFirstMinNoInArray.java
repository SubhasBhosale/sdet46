package array;

public class findFirstMinNoInArray 
{
public static void main(String[] args)
{
	int []arr= {7,2,3,9,5};
	int a=arr[0];
	for (int i = 0; i < arr.length; i++)
	{
		if(arr[i]<a)
		{
			a=arr[i];
		}
	}
	System.out.println(a);
}
}
