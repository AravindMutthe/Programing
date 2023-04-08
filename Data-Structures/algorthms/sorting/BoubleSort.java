import java.util.Scanner;
class BoubleSort
{
	public static void intfun1(int a[],int  n )	//deepak tutorials
	{
		for(int i=0;i<n;i++)	//performance no of rounds i.e n-1
		{
			int flag=0;
			for(int j=0;j<n-1-i;j++)	//performance swapping of adjacent elements except last element of priv round 
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)	//means already sorted 
			{
				break;
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
	public static void Stringfun(String a[] )	
	{
		
		for(int i=0;i<a.length;i++)	
		{
			int flag=0;
			for(int j=0;j<a.length-1-i;j++)	
			{
				if(a[j].compareTo(a[j+1])>0)
				{
					String temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)	
			{
				break;
			}
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
	}
		
		
	
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=ip.nextInt();
		}
		BoubleSort.intfun1(a,n);
		//BoubleSort.intfun2(a);
		String s[]=new String[n];
		for(int i=0;i<n;i++)
		{
			s[i]=ip.nextLine();
		}
		
		BoubleSort.Stringfun(s);
		
	}
}

/*
* "it performance n-1 rounds" to sort list
* BS is a simple sorting algorithm, that works by repeatedly stepping through the list to be sorted.
* Comparing each pair of adjacent items and swapping them if they are in the wrong order.
  it is repeated until no swaps are needed.
* it is a comparison sort. Although the algorithm is simple,
  most of the other sorting algorithms are more efficient for large lists.
======>  worst-case and average complexity both О(n2).
* insertion sort, tend to have better performance than bubble sort.
* bubble sort is not a practical sorting algorithm when n is large.


public static void intfun2(int[] a) 
	{
		boolean sorted = false;
		int temp;
		while(!sorted) 
		{
			sorted = true;
			for (int i = 0; i < a.length - 1; i++) 
			{
				if (a[i] > a[i+1]) 
				{
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					sorted = false;
				}
			}
		}
*/