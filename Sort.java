import java.io.*;
import java.util.*;
class Sort
{
	public static void main(String []args)
	{
		int num[]=new int[20];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ARRAY limit");
		int n=sc.nextInt();
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			num[i]=sc.nextInt();
		}
			for(int i=0;i<n;i++)
			{
				for(int j=i;j<n;j++)
				{
					int temp;
					if(num[i]>num[j])
					{
						temp=num[i];
						num[i]=num[j];
						num[j]=temp;
					}
				}
			}
		
		System.out.println("Sorted array is:=");
		for(int i=0;i<n;i++)
		System.out.println(" "+num[i]);
  	}
}
