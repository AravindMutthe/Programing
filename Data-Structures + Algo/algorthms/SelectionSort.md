# Selection-Sort:

```java
import java.util.Scanner;
class SelectionSort
{
	public static void sortfun1(int a[],int n)
	{
		int min,temp=0;
		for(int i=0;i<n;i++)	// swaps or places that smallest value into its proper location.
		{
			min=i;
			for(int j=i+1;j<n;j++) // finds Smallest element index in list 
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void sortfun2(String a[],int n)
	{
		int min;
		String temp="";
		for(int i=0;i<n;i++)
		{
			min=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j].compareTo(a[min])<0)
				{
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
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
		SelectionSort.sortfun1(a,n);
		int k=ip.nextInt();
		String s[]=new String[k];
		for(int i=0;i<k;i++)
		{
			s[i]=ip.nextLine();
		}
		SelectionSort.sortfun2(s,k);
		
	}
}
```
* selection sort is a combination of searching and sorting.
* Selecting the lowest element(initial) requires scanning all n elements (this takes n − 1 comparisons) and then swapping it into the first position.
* in the selection sort, the inner loop finds the next smallest (or largest) value and the outer loop places that value into its proper location.
* Finding the next lowest element requires scanning the remaining n − 1 elements and so on, for (n − 1) + (n − 2) + ... + 2 + 1 = n(n − 1) / 2 ∈ Θ(n2) comparisons.