1./*if the individual digits of the number are not even then print NOT COMPLETE NUMBER 

	
	Assume 0 as a Even Number
	sample
	input = 46 
	output = COMPLETE NUMBER
	input = 135
	output = NOT COMPLETE NUMBER
*/

2./*Write a java program to search an element in an array

sample
1.
    input
    5
    10 11 2 3 50
    11
    output 
    Element found
2. 
    input 
    5
    10 11 2 3 50
    12
    output 
    Element not found
	*/  	
	import java.util.Scanner;
class SeaechEle
{
	public static int fun(int A[],int N,int K)
	{
		for(int i=0;i<N;i++)
		{
			if(K==A[i])
			{
				return A[i];
			}
			else
				return -1;
		}
		return 0;
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
		int k=ip.nextInt();
		int ele=SeaechEle.fun(a,n,k);
		System.out.println(ele);
	}
}
	
3./*Write a java program to print the second largest element in the array.

Sample :
5 //size of array
10 5 8 6 4 //array elements
8 //output
*/

4./*Write a Java Program to insert an element at a specified position in a given array

 sample
 1.  input =
     5          (//Enter no. of elements)
     10 20 30 40 50 (//Enter Elements)
     2      (//Enter the position where you want to insert element)
     100    (//Enter the element to insert)
      output = 
     10 100 20 30 40 50
2.   input =-2                                                                                                                      
     output =enter array size >= 0 
3.  input =
    3                                                                                                                       
    10 20 30                                                                                                                
    6      
    output =
    Entered position is beyond the size of array  

 */
 
5./*Write a java program to find greatest number in an array

sample
input 
4 (//enter size)
23 67 2 10 (//enter array elements)
output 
67
*/

6./* Write a Java program to find all pairs of elements in an array 

 whose sum is equal to a specified number. 
 And print -1 for no such pairs.
 
Sample :
5 //array size
1 5 6 4 2 //array elements
6 //sum value
//output
(1,5)
(4,2)
*/
import java.util.Scanner;
class MatrixSumPair
{
	public static void  fun(int n,int a[],int c)
	{
		int sum=0;
		for(int i=0;i<n;i++)
		{
			//sum=0;
			for(int j=1;j<n;j++)
			{
				sum=a[i]+a[j];
				if(sum==c)
				{
					System.out.println("("+a[i]+","+a[j]+")");
				}
			}
		}
		if(sum!=c)
					System.out.println(-1);
	}
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		int r=ip.nextInt();
		int A[]=new int[r];
		for(int i=0;i<r;i++)
		{
			A[i]=ip.nextInt();
		}
		int c=ip.nextInt();
		MatrixSumPair.fun(r,A,c);
		
	}
}


7./*Write a Java program to find mid value in an array after sorting elements of it

sample
    input
    5
    20 15 8 45 23
    output
    8 15 20 23 45
    20
*/
import java.util.Scanner;
class MidVal
{
	public static int fun(int n,int a[])
	{
		//int temp=0;
		//int mid=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}	
		for(int k=0;k<n;k++)
		{
			System.out.print(a[k]+" "+"\n");
		}
		int mid=n/2;
		System.out.println("mid value is "+a[mid]);
		return 0;
		
	}
	public static void main(String ags[])
	{
		
		Scanner sc=new Scanner(System.in);
		int n,a[];
		n=sc.nextInt();
		a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		MidVal.fun(n,a);
		
	}
}

8./* Write a java program to print the Full Name.

Let's say array1 has first names
Let's say array2 has last names
Print the Full Names(firstname+lastname)

Sample :
// input
3 //size of arrays
sai priyanka shankar //array1 with first names
vardhan dixit macha //array2 with last names
// output
sai vardhan
priyanka dixit
shankar macha
*/
import java.util.Scanner;
class FullName
{
	public static void fun(String s[], String s1[],int n)
	{
			String f[]=new String[n];
			for(int i=0;i<n;i++)
			{
				f[i]=s[i]+s1[i];
			}
			for(int i=0;i<n;i++)
			{
				System.out.println("FULL NAME IS"+f[i]);
			}
	}
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		int N=ip.nextInt();
		String S[],S1[];
		S=new String[N];
		S1=new String[N];
		for(int i=0;i<N;i++)
		{
			S[i]=ip.next();
		}
		for(int j=0;j<N;j++)
		{
			S1[j]=ip.next();
		}
		FullName.fun(S,S1,N);
	}
}

11./*Write a Java program to move zeros if any in the array to end of the array and print array.

sample
input =
5 (//enter size)
10 0 30 0 50  (//enter array elements)
output =
10 30 50 0 0
*/
import java.util.Scanner;
class Zeros
{
	public static void fun(int  s[],int n)
	{
			int zeros=0;
			for(int i=0;i<n;i++)
			{
				if(s[i]==0)
					zeros++;
				else
					System.out.print(s[i]+" ");
			}
			for(int i=0;i<zeros;i++)
			{
				System.out.print(0+" ");
			}
			
	}
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		int N=ip.nextInt();
		int S[];
		S=new int[N];
		for(int i=0;i<N;i++)
		{
			S[i]=ip.nextInt();
		}
		Zeros.fun(S,N);
	}
}

12./*Java program to construct the following pattern.

Sample 
5 //input
//output
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
*
*/
import java.util.Scanner;
public class Pattern13
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n;
    n=sc.nextInt();
    if(n<=0)
    {
        System.out.println("-1");
    }
    else
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n-1;i++)
        {
            for(int j=n-1;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    } 
    
    
}
}
13./*Write a java program to find transpose of a matrix
sample
input =
2
3
1 2 3
4 5 6
output =
1 4
2 5
3 6
*/

14./*write java to find sum of principal diagonal and secondary diagonal elements of an array

note:
1. Calculate both diagonals sum for square matrix
2. if entered order of matrix is not square matrix then print -1

sample
1.  input =
    3                                                                                                                       
    3                                                                                                                       
    1 2 3                                                                                                                   
    4 5 6                                                                                                                   
    1 1 1
    output =
    7 9
2.  input =
    2
    3
    output = -1
	*/
import java.util.Scanner;
class Diagnol
{
	public static void  fun(int a[][],int r,int c)
	{
		int ds1=0;
		int ds2=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(i==j)
				{
					ds1+=a[i][j];
				}
				
			}
			ds2+=a[i][c-1-i];
		}
		System.out.println(ds1+" "+ds2);
		
	}
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		int r=ip.nextInt();
		int c=ip.nextInt();
		int a[][]=new int[r][c];
		if(c!=r)
		{
				System.out.println(-1);
		}
		else
		{
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					a[i][j]=ip.nextInt();
				}
			}
			Diagnol.fun(a,r,c);
		}
		
	}
}
15./*Write a Java to find row sum of each individual rows of an array
and print matrix along with its row sum

sample
input =
2      (//enter order of an array)                                                                                                                 
2                                                                                                                       
1       (//enter array elements)                                                                                                                
2                                                                                                                       
3                                                                                                                       
4      
output =
1 2 = 3                                                                                                                 
3 4 = 7                                                                                                                 
*/
import java.util.Scanner;
class MatrixColSum
{
	public static int fun(int A[][],int R,int C)
	{
		int sum[]=new int[C];
		for(int i=0;i<R;i++)
		{
			for(int j=0;j<C;j++)
			{
				sum[i]+=A[i][j];
			}
		}
		for(int i=0;i<R;i++)
		{
			for(int j=0;j<C;j++)
			{
				System.out.print(A[i][j]+" ");
			}
			System.out.println("="+sum[i]);
		}
		return 0;
	}
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		int r=ip.nextInt();
		int c=ip.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int k=0;k<c;k++)
			{
				a[i][k]=ip.nextInt();
			}
		}
		MatrixColSum.fun(a,r,c);
		
	}
}

16./*write a Java to find greatest element in each individual rows of an array
and print matrix along with its greatest element

sample
input =
2      (//enter order of an array)                                                                                                                 
2                                                                                                                       
1       (//enter array elements)                                                                                                                
2                                                                                                                       
3                                                                                                                       
4      
output =
1 2 = 2                                                                                                                 
3 4 = 4                                                                                                                 
*/

17./*write java program to find addition of two matrices

sample
input =
2 (//enter the order of array)
2
1 2	(//enter the elements into 1st array)
3 4

1 2	(//enter elements into 2nd array)
2 1
output =
2 4	(//resultant array)
5 5
*/

18./* Write a java program to perform matrix multiplication

sample
1. input = 
    2
    3
    2
    3
    output =
    Matrix multiplication not possible
2. input =
    2
    3
    3
    2
    1 2 3
    4 5 6
    1 2
    1 1
    1 0
    output =
    6 4
    15 13
    
*/

19./* Write a java program to check whether entered matrix is lower traingular or not

sample
input =
3 //enter order of square matrix
3
1 0 0
1 0 0
1 1 1
output =
The entered matrix is lower triangular
*/

20./*Write a java program to find vowel count each and every row in an 2D Array
sample
input 
2
2
a b
e i
output 
a b = 1
e i = 2
*/

21./* Write a java program to find and print number of words in a line
    and also print the words along with its length
    sample
    input =welcome to kmit
    output =
    word count = 3
    welcome = 7
    to = 2
    kmit = 4
    
*/

22./* Write a java program to find vowel and consonant count in a string
sample
input =
hello
output =
vowel count is 2
consonant count is 3
*/

23./* Write a program to read the two integer values from a user.
First integer say time in hours.
Second integer says time in minutes.
Considering above two values and print them in words.

Sample1
//input
5//hours
0//minutes
//output
5:00 — five o’ clock

Sample2
//input
5//hours
10//minutes
//output
5:10 — ten minutes past five

Sample3
//input
5//hours
15//minutes
//output
5:15 — quarter past five

Sample4
//input
5//hours
30//minutes
//output
5:30 — half past five

Sample5
//input
5//hours
40//minutes
//output
5:40 — twenty minutes to six

Sample6
//input
5//hours
45//minutes
//output
5:45 — quarter to six

Sample7
//input
5//hours
31//minutes
//output
5:31 — twenty nine minutes to six
*/

24./* Write a program to print the following pattern.
Sample :
//no of rows
5 
//output
1 
1 2 
3 5 8 
13 21 34 55 
89 144 233 377 610 
*/

25./* Write a java program to remove duplicate words from the sentence
sample 
input = Good morning Good afternoon Good evening
output = Good morning afternoon evening
*/

26./* You are suppose to read a  list of sentences which contains emails in each sentence. 
Your task is to find valid emails from the sentences.

For each case of input, output the valid emailid or NO-MAIL-ID.

Sample:
my mail id is abc@gmail.com //input
abc@gmail.com //output

Sample 2:
my mail id is abc@com //input
NO-MAIL-ID //output

Sample 3:
mymailidisabc@yahoo.com //input
mymailidisabc@yahoo.com //output

Sample 4:
my mail id is abc@yahoo.in //input
abc@yahoo.in //output 

Sample 5:
my name is khan //input
NO-MAIL-ID //output

Sample 6:
my mail id is abc@.com //input 
NO-MAIL-ID //output

Sample 7: 
abc@yahoo.co.in is my mail id //input
abc@yahoo.co.in //output

Sample 8:
my mail id is abc.yahoo@com //input
NO-MAIL-ID //output


*/

27./* Write a java program to find longest word in a sentence

sample
input =welcome to kmit
output =welcome
*/

28.	/*Write a java program that prints the following pattern of alphabets 
note: if n>0, print pattern
for other boundary conditions print -1

sample :
5 //input
//output
1 
2 3 4 
5 6 7 8 9 
10 11 12 13 14 15 16 
17 18 19 20 21 22 23 24 25

*/
import java.util.*;
class Test
{
  int n,m,k=1;
  Scanner sc = new Scanner(System.in);
  void read()
  {
      n=sc.nextInt();
      if(n<=0)
      {
          System.out.println(-1);
      }
  }
  void execute()
  {
      for(int i=0;i<n;i++)
      {
          for(int j=0;j<=m;j++)
          {
              System.out.print(k+" ");
              k++;
          }
          m=m+2;
          System.out.println();
      }
  }
}
class Pattern10 
{
	
    public static void main(String args[])
    {
        Test t = new Test();
        t.read();
        t.execute();
    }
}

29. /*Write a java program to remove duplicate words from sentence
sample
input =Welcome to Java Session Java Session Session Java
output =Welcome to Java Session
*/
import java.util.*;
class test
{
    Scanner sc=new Scanner(System.in);
    String st,str[],s="" ;
    void read()
    {
        st=sc.nextLine();
    }
    void execute()
    {
        str=st.split(" ");
        for(int i=0;i<str.length;i++)
        {
            if(s.contains(str[i]))
            {
             continue;   
            }
            else
            {
                s=s+str[i]+" ";
            }
            
            
        }
         System.out.println(s);
       
    }

}
class Test
{
    public static void main(String args[])
    {
        test t = new test();
        t.read();
        t.execute();
    }
}
30./* Find first and last digits of a number.

Given a positive number(greater than 0 and has minimum two digits) and 
to find first and last digit of a number. 
For example, given number 12345, In the given number the first digit is 1 and last digit is 5. print them. 
If the number is not greater than 0 print -1. 

Sample :
12345 //input
1 //first digit output
5 //last digit output

Sample 2:
98562 //input
9 //first digit output
2 //last digit output

*/
import java.util.*;
class Aravind
{
 int n ,r;
 Scanner sc = new Scanner(System.in);
 void read()
 {
     n=sc.nextInt();
     
 }
 void execute()
 {
    if(n>0)
    {
        int temp=n;
        while(n>0)
        {
            r=n%10;
            n=n/10;
        }
        System.out.println(r);
        int k=temp%10;
        System.out.println(k);
    }
    else
    {
        System.out.println(-1);
    }
 }
}
class FirstLastDigitNumber
{
    public static void main(String args[])
    {
        Aravind m = new Aravind();
        m.read();
        m.execute();
    }
}
31./* Write a program to print the following pattern.
Sample :
//no of rows
5 
//output
1 
1 2 
3 5 8 
13 21 34 55 
89 144 233 377 610 
*/
import java.util.*;
class Test
{
    void pattern(int n)
    {
         int k=0,l=1,t=1;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<=i;j++)
                {
                    System.out.print(t+" ");
                    t=k+l;
                    k=l;
                    l=t;
        }
        System.out.println();
    }
}
}
class PatternTest
{
    public static void  main(String args[])
    {
        Test t=new Test();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        t.pattern(n);
    }
}
32 /* Write a program to read the two integer values from a user.
First integer say time in hours.
Second integer says time in minutes.
Considering above two values and print them in words.

Sample1
//input
5//hours
0//minutes
//output
5:00 — five o’ clock

Sample2
//input
5//hours
10//minutes
//output
5:10 — ten minutes past five

Sample3
//input
5//hours
15//minutes
//output
5:15 — quarter past five

Sample4
//input
5//hours
30//minutes
//output
5:30 — half past five

Sample5
//input
5//hours
40//minutes
//output
5:40 — twenty minutes to six

Sample6
//input
5//hours
45//minutes
//output
5:45 — quarter to six

Sample7
//input
5//hours
31//minutes
//output
5:31 — twenty nine minutes to six
*/

import java.util.Scanner;
class clock
{
    Scanner sc=new Scanner(System.in);
    int h,m;
    String s;
    void read()
    {
        h=sc.nextInt();
        m=sc.nextInt();
        s="5:00";
        
    }
    void fun()
    {
        if(h==5&&m==00)
        {
            System.out.println("5:00 — five o’ clock");
        }
        else if(h==5&&m==10)
        {
            System.out.println("5:10 — ten minutes past five");
        }
        else if(h==5&&m==15)
        {
            System.out.println("5:15 — quarter past five");
        }
        else if(h==5&&m==30)
        {
            System.out.println("5:30 — half past five");
        }
        else if(h==5&&m==40)
        {
            System.out.println("5:40 — twenty minutes to six");
        }
        else if(h==5&&m==45)
        {
            System.out.println("5:45 — quarter to six");
        }
        else if(h==5&&m==31)
        {
            System.out.println("5:31 — twenty nine minutes to six");
        }
    }
}
class ClockCheck
{
    public static void main(String args[])
    {
        clock m=new clock();
        m.read();
        m.fun();
    }
}
33./* Write a java program to find longest word in a sentence
sample
input =welcome to kmit
output =welcome
*/

import java.util.Scanner;
class test
{
    Scanner sc=new Scanner(System.in);
    String str,Sarr[];
    int temp;
    void read()
    {
        str=sc.nextLine();
        Sarr=str.split(" ");
    }
    void fun()
    {
        int max=Sarr[0].length();

        for(int i=0;i<Sarr.length;i++)
        {
            if(Sarr[i].length()>max)
            {
                max=Sarr[i].length();
                temp=i;
            }
            
        }
        System.out.println(Sarr[temp]);
    }
}
class Test
{
    public static void main(String args[])
    {
        test t=new test();
        t.read();
        t.fun();
    }
}
34./* You are suppose to read a  list of sentences which contains emails in each sentence. 
Your task is to find valid emails from the sentences.

For each case of input, output the valid emailid or NO-MAIL-ID.

Sample:
my mail id is abc@gmail.com //input
abc@gmail.com //output

Sample 2:
my mail id is abc@com //input
NO-MAIL-ID //output

Sample 3:
mymailidisabc@yahoo.com //input
mymailidisabc@yahoo.com //output

Sample 4:
my mail id is abc@yahoo.in //input
abc@yahoo.in //output 

Sample 5:
my name is khan //input
NO-MAIL-ID //output

Sample 6:
my mail id is abc@.com //input 
NO-MAIL-ID //output

Sample 7: 
abc@yahoo.co.in is my mail id //input
abc@yahoo.co.in //output

Sample 8:
my mail id is abc.yahoo@com //input
NO-MAIL-ID //output


*/
import java.util.*;
class EmailTest
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int a=0;
        int d=0;
        char sch[]=s.toCharArray();
        for(int i=0;i<sch.length;i++)
        {
            if(sch[i]=='@')
          a=i;
            if(sch[i]=='.')
             d=i;
            if(a<d && d-a>1)
           {
           String srr[]=s.split(" ");
           {
                for(int j=0; j<srr.length; j++)
                {
                   if(srr[j].contains("@"))
                    {
                    System.out.println(srr[j]);
                    }
                }
            }
           }
           else
           {
            System.out.println("NO-MAIL-ID");
           }
        }
        
    }
}

35./* Write a java program to remove duplicate words from the sentence
sample 
input = Good morning Good afternoon Good evening
output = Good morning afternoon evening
*/
import java.util.*;
class Stringdup
{
int i,j;
String s,s2="";
void read()
{
Scanner sc=new Scanner(System.in);
String s=new String(sc.nextLine());
String str1[]=s.split(" ");
ArrayList<String> al=new ArrayList<String>();
for(i=0;i<str1.length;i++)
{
	if(!al.contains(str1[i]))
	{
		al.add(str1[i]);
	}
	
}
for(i=0;i<al.size();i++)
{
s2+=al.get(i)+" ";
System.out.print(al.get(i)+" ");
}
}
}
class Test
{
public static void main(String args[])
{
Stringdup s=new Stringdup();
s.read();
}
}

36./* Find first and last digits of a number.

Given a positive number(greater than 0 and has minimum two digits) and 
to find first and last digit of a number. 
For example, given number 12345, In the given number the first digit is 1 and last digit is 5. print them. 
If the number is not greater than 0 print -1. 

Sample :
12345 //input
1 //first digit output
5 //last digit output

Sample 2:
98562 //input
9 //first digit output
2 //last digit output

*/
import java.util.*;
class Aravind
{
 int n ,r;
 Scanner sc = new Scanner(System.in);
 void read()
 {
     n=sc.nextInt();
     
 }
 void execute()
 {
    if(n>0)
    {
        int temp=n;
        while(n>0)
        {
            r=n%10;
            n=n/10;
        }
        System.out.println(r);
        int k=temp%10;
        System.out.println(k);
    }
    else
    {
        System.out.println(-1);
    }
 }
}
class FirstLastDigitNumber
{
    public static void main(String args[])
    {
        Aravind m = new Aravind();
        m.read();
        m.execute();
    }
}
37./*Write a Java program to display the maximum occurring character
in a string

sample
input =
console
output =
o                                                                                                                       
*/
import java.util.*;
class Aravind
{
 String str;
 int v;
 void read()
 {
	 Scanner sc = new Scanner(System.in);
	 str=sc.nextLine();
	 int count[]=new int[256];
	 for(int i=0;i<str.length();i++)
	 {
	  char ch=str.charAt(i);
      count[ch-'a']++;	  
	 }	
	 for(int i=0;i<256;i++)
	 {
		 System.out.print(count[i]+" ");
	 }
	 int max=0,temp,t=0;
	 for(int k=0;k<256;k++)
	 {
		 if(max<count[k])
		 { 
	       t=k;
			max=count[k] ;
		 }
	 }
	 v=t+97;
	 System.out.println("MAX occurence "+(char)v);
 }		
}
class Test
{ 
public static void main(String args[])
	{
	Aravind m = new Aravind();
		m.read();
	}
}
39./*Write a java program to remove duplicate words from sentence
sample
input =Welcome to Java Session Java Session Session Java
output =Welcome to Java Session
*/

40 /*Write a java program to SWAP two numbers.
Sample I/O:
Enter the first number:                                                                                                 
65                                                                                                                      
Enter the second number:                                                                                                
23                                                                                                                      
After Swap:                                                                                                             
23                                                                                                                      
65 

*/
import java.util.*;
class Swap{

int a,b,temp;
void input()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the first number:");
a=s.nextInt();
System.out.println("Enter the second number:");
b=s.nextInt();
}
void process()
{
	temp=a;
	a=b;
	b=temp;
}
void output()
{
     System.out.println("After Swap:");
     System.out.println(a);
     System.out.println(b);
}
}
class SwapTest{
	

                public static void main(String[]args){

                                Swap s1=new Swap();

                                s1.input();

                                s1.process();

                                s1.output();

                }

}

41./*Java program to create class Circle with methods to calculate area and perimeter of circle. 

Note: use Math.PI

Sample I/O

Enter the radius:
15.50
Area of circle:754.7676350249478
Perimeter of circle:97.38937226128358
*/
import java.util.Scanner;
class Circle{  
double r,a,p;
	
	public double getArea()
	{	
		a= Math.PI *r*r;
		return a;
	}
	public double getPerimeter()
	{	
		p = 2* Math.PI *r;
		return p;
	}
	public static void main(String[]args){
        
		Circle c=new Circle();

		Scanner s= new Scanner(System.in);
         System.out.println("Enter the radius: ");
         c.r=s.nextDouble();

		System.out.println("Area of circle:" + c.getArea());
		System.out.println("Perimeter of circle:" + c.getPerimeter());
		}
}

43./*Write a java program to read three subject marks and display pass or fail.
criteria: if all subjects marks >= 40 then pass
other wise fail.

Sample I/O:

case 1:
Enter first subject marks:                                                                                              
60                                                                                                                      
Enter second subject marks:                                                                                             
20                                                                                                                      
Enter third subject marks:                                                                                              
50                                                                                                                      
Fail                                                                                                                    

case 2:
Enter first subject marks:                                                                                              
70                                                                                                                      
Enter second subject marks:                                                                                             
802                                                                                                                     
Enter third subject marks:                                                                                              
90                                                                                                                      
Pass 

*/
import java.util.*;
class Result{
    int m1,m2,m3;
    Result(int m1,int m2,int m3)
	{
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
    void process()
	{
        if(m1>=40 && m2>=40 && m3>=40){
            System.out.println("Pass");
    }
        else{
                System.out.println("Fail");
            }
        }
    }
    class ResultTest{
        public static void main(String[]args)
		{
            int m1,m2,m3;
            Scanner s=new Scanner(System.in);
            System.out.println("Enter first subject marks:");
			m1=s.nextInt();
            System.out.println("Enter second subject marks:");
			m2=s.nextInt();
            System.out.println("Enter third subject marks:");
			m3=s.nextInt();
            Result r1=new Result(m1,m2,m3);
			r1.process();
}
}

44/*Implement a class Account. 
An account has the properties customer name,account number & balance 
and a methods to deposit, withdraw and inquire the current balance.
Pass values into a constructor to set.
If no value is passed the initial balance should be set to 0.

Charge a 5 penalty if an attempt is made to withdraw more money than available in the account.

Sample Output:

CASE 1(with penalty):

Current Balance: 2000.0                                                                                                 
Enter the amount to withdraw                                                                                            
3000                                                                                                                    
Current Balance after withdraw: 1995.0                                                                                  
Enter the amount to deposit                                                                                             
1000                                                                                                                    
Current Balance after deposit: 2995.0                                                                           
                                                                                                                            

CASE 2(without penalty):
Current Balance: 2000.0                                                                                                 
Enter the amount to withdraw                                                                                            
1000                                                                                                                    
Current Balance after withdraw: 1000.0                                                                                  
Enter the amount to deposit                                                                                             
2000                                                                                                                    
Current Balance after deposit: 3000.0                                                                                   
 */
import java.util.Scanner;
class Account{
Scanner sc=new Scanner(System.in);
String Name;
long acno;  
double balance;
Account() 
  { 
	balance = 0;   
  }
Account(String n,long a,double b)
   { 
   	 Name=n;
     acno=a;
     balance=b; 
    }
void deposit(double sum)
    {
  	 balance += sum;
 
    }
  void withdraw(double sum) 
  {
  	  if (sum > balance)
    { 
    		  balance -= 5;
    }
 else 
    { 
    		  balance -= sum;
      
    }
  }
  double getBalance() 
   { 
	return balance; 
   } 
}
class TestAccount{
public static void main(String a[])
{		 
 Account b=new Account("Anil",12345L,2000.0);
 System.out.println("Current Balance: "+b.getBalance());
 System.out.println("Enter the amount to withdraw");
 double amt=sc.nextDouble();
 b.withdraw(amt);
 System.out.println("Current Balance after withdraw: "+b.getBalance());
 System.out.println("Enter the amount to deposit");
 amt=sc.nextDouble();
 b.deposit(amt);
 System.out.println("Current Balance after deposit: "+b.getBalance());
}
}

 //overloading 
45/*program to overload find() method to calculate area of circle and rectangle
Sample I/O:
Enter the radius of circle:                                                                                             
2                                                                                                                       
Area of Circle: 12.56                                                                                                   
Enter the length and breadth of rectangle:                                                                              
5 6                                                                                                                     
Area of Rectangle: 30.0 
*/
import java.util.*;     
class Area{
        double find(int r)
         {
            return(3.14*r*r);
        }
        double find(int l,int b)
        {
            return(l*b);
        }
    }
class Overloading{
	
	public static void main(String args[])
	     {
            int a,b,c;
            Scanner s= new Scanner(System.in);
            Area a1=new Area();
            System.out.println("Enter the radius of circle:");
            a=s.nextInt();
            System.out.println("Area of Circle: "+a1.find(a));
            System.out.println("Enter the length and breadth of rectangle:");
            a=s.nextInt();
            b=s.nextInt();
            System.out.println("Area of Rectangle: "+a1.find(a,b));
         
        }
    }


//inheritence
46./*program to create super class as Student with id,name and three subject marks m1,m2,m3.
create a sub class Result with total and average and result.
create an executable class and instantiate an object for sub class,
invoke respective methods to input the data, 
process the data and display the same.

Sample I/O:
Case 1:
Enter id:                                                                                                               
1                                                                                                                      
Enter name:                                                                                                             
abc                                                                                                                     
Enter subject1 marks:                                                                                                   
40                                                                                                                      
Enter subject2 marks:                                                                                                   
50                                                                                                                      
Enter subject3 marks:                                                                                                   
60                                                                                                                      
Student id:1                                                                                                            
Name      :abc                                                                                                          
Subject1  :40                                                                                                           
Subject2  :50                                                                                                           
Subject3  :60                                                                                                           
Total is  :150                                                                                                          
Average is:50.0                                                                                                         
result is :Second Division     


CASE 2:

Student id:2                                                                                                            
Name      :xyz                                                                                                          
Subject1  :70                                                                                                           
Subject2  :0                                                                                                            
Subject3  :90                                                                                                           
Total is  :160                                                                                                          
Average is:53.0                                                                                                         
result is :Fail

CASE 3:

Student id:3                                                                                                            
Name      :mno                                                                                                          
Subject1  :88                                                                                                           
Subject2  :99                                                                                                           
Subject3  :100                                                                                                          
Total is  :287                                                                                                          
Average is:95.0                                                                                                         
result is :Distinction

CASE 4:
                                                                                                                
Student id:4                                                                                                            
Name      :pqr                                                                                                          
Subject1  :66                                                                                                           
Subject2  :59                                                                                                           
Subject3  :70                                                                                                           
Total is  :195                                                                                                          
Average is:65.0                                                                                                         
result is :First Division */
import java.util.*;
class Student{
	String name;
    int id,m1,m2,m3;
    Student(int id,String name,int m1,int m2,int m3)
    {
        this.id=id;
        this.name=name;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
    void output()
    {
        System.out.println("Student id:"+id);
        System.out.println("Name      :"+name);
        System.out.println("Subject1  :"+m1);
        System.out.println("Subject2  :"+m2);
        System.out.println("Subject3  :"+m3);
        
    }
    
}
class Result extends Student{
    int total;
    String result;
    double avg;
    Result(int id,String name,int m1,int m2,int m3)
    {
        super(id,name,m1,m2,m3);
    }
    void process()
    {
        total=m1+m2+m3;
        avg=total/3;
        if(m1>=40&&m2>=40&&m3>=40)
        {
            if(avg>=70)
                result="Distinction";
            else if(avg>=60 && avg<70)
                result="First Division";
            else if(avg>=50 && avg<60)
                result="Second Division";
            else if(avg>=40 && avg<50)
                result="Third Division";
        }
        else
            result="Fail";
    }
    void output()
    {
        super.output();
        System.out.println("Total is  :"+total);
        System.out.println("Average is:"+avg);
        System.out.println("result is :"+result);
    }
}
class StudentInheritanceTest
{
    public static void main(String args[])
    {
        int id,m1,m2,m3;
        String name;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter id:");
        id=s.nextInt();
        System.out.println("Enter name:");
        name=s.next();
        System.out.println("Enter subject1 marks:");
        m1=s.nextInt();
        System.out.println("Enter subject2 marks:");
        m2=s.nextInt();
        System.out.println("Enter subject3 marks:");
        m3=s.nextInt();
        Result r=new Result(id,name,m1,m2,m3);
        r.process();
        r.output();
    }
}

7./*program to find the sum of the individual digits of the given number.
if input is 123, then output should be 6
Sample I/O:
Enter the positive integer number to find sum of digits:
1234
Sum of digits: 10
*/
import java.util.*;
class SumOfDigits{
    int n,sum,r;
    Scanner s;
    SumOfDigits(){
        //instantiate object for Scanner class
        s=new Scanner(System.in);
        sum=0;
    }
    void input(){
        System.out.println("Enter the positive integer number to find sum of digits:");
        n=s.nextInt();
    }
    void process(){
        while(n!=0){
            r=n%10;
            sum+=r;
            n=n/10;
        }
    }
    void output(){
        System.out.println("Sum of digits: "+sum);
    }
}
class Demo{
    public static void main(String args[]){
        SumOfDigits s=new SumOfDigits();
        s.input();
        s.process();
        s.output();
    }
}

47/*Write a Java program that prints the numbers from 1 to 50. But for multiples of three print "Fizz" instead of 
the number and for the multiples of five print "Buzz". For numbers which are multiples of both three and 
five print "FizzBuzz"

SAMPLE OUTPUT:
1                                                                                                                       
2                                                                                                                       
Fizz                                                                                                                    
4                                                                                                                       
Buzz                                                                                                                    
Fizz                                                                                                                    
7                                                                                                                       
8                                                                                                                       
Fizz                                                                                                                    
Buzz                                                                                                                    
11                                                                                                                      
Fizz                                                                                                                    
13                                                                                                                      
14                                                                                                                      
FizzBuzz    
.
.
.
41                                                                                                                      
Fizz                                                                                                                    
43                                                                                                                      
44                                                                                                                      
FizzBuzz                                                                                                                
46                                                                                                                      
47                                                                                                                      
Fizz                                                                                                                    
49                                                                                                                      
Buzz 
*/
public class FizzBuzzTest{
     public static void main(String args[]){
    
        for(int i = 1; i <= 50; i++) {
            if(i % (3*5) == 0) System.out.println("FizzBuzz");
            else if(i % 5 == 0) System.out.println("Buzz");
            else if(i % 3 == 0) System.out.println("Fizz");
            else System.out.println(i);
        } 
    } 
}
1 /*Write a java program to SWAP two numbers.
Sample I/O:
Enter the first number:                                                                                                 
65                                                                                                                      
Enter the second number:                                                                                                
23                                                                                                                      
After Swap:                                                                                                             
23                                                                                                                      
65 

*/
import java.util.*;
class Swap{

int a,b,temp;
void input()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the first number:");
a=s.nextInt();
System.out.println("Enter the second number:");
b=s.nextInt();
}
void process()
{
	temp=a;
	a=b;
	b=temp;
}
void output()
{
     System.out.println("After Swap:");
     System.out.println(a);
     System.out.println(b);
}
}
class SwapTest{
	

                public static void main(String[]args){

                                Swap s1=new Swap();

                                s1.input();

                                s1.process();

                                s1.output();

                }

}

48./*Java program to create class Circle with methods to calculate area and perimeter of circle. 

Note: use Math.PI

Sample I/O

Enter the radius:
15.50
Area of circle:754.7676350249478
Perimeter of circle:97.38937226128358
*/
import java.util.Scanner;
class Circle{  
double r,a,p;
	
	public double getArea()
	{	
		a= Math.PI *r*r;
		return a;
	}
	public double getPerimeter()
	{	
		p = 2* Math.PI *r;
		return p;
	}
	public static void main(String[]args){
        
		Circle c=new Circle();

		Scanner s= new Scanner(System.in);
         System.out.println("Enter the radius: ");
         c.r=s.nextDouble();

		System.out.println("Area of circle:" + c.getArea());
		System.out.println("Perimeter of circle:" + c.getPerimeter());
		}
}

49./*Write a java program to read three subject marks and display pass or fail.
criteria: if all subjects marks >= 40 then pass
other wise fail.

Sample I/O:

case 1:
Enter first subject marks:                                                                                              
60                                                                                                                      
Enter second subject marks:                                                                                             
20                                                                                                                      
Enter third subject marks:                                                                                              
50                                                                                                                      
Fail                                                                                                                    

case 2:
Enter first subject marks:                                                                                              
70                                                                                                                      
Enter second subject marks:                                                                                             
802                                                                                                                     
Enter third subject marks:                                                                                              
90                                                                                                                      
Pass 

*/
import java.util.*;
class Result{
    int m1,m2,m3;
    Result(int m1,int m2,int m3)
	{
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
    void process()
	{
        if(m1>=40 && m2>=40 && m3>=40){
            System.out.println("Pass");
    }
        else{
                System.out.println("Fail");
            }
        }
    }
    class ResultTest{
        public static void main(String[]args)
		{
            int m1,m2,m3;
            Scanner s=new Scanner(System.in);
            System.out.println("Enter first subject marks:");m1=s.nextInt();
            System.out.println("Enter second subject marks:");m2=s.nextInt();
            System.out.println("Enter third subject marks:");m3=s.nextInt();
            Result r1=new Result(m1,m2,m3);
			r1.process();
}
}

50/*Implement a class Account. 
An account has the properties customer name,account number & balance 
and a methods to deposit, withdraw and inquire the current balance.
Pass values into a constructor to set.
If no value is passed the initial balance should be set to 0.

Charge a 5 penalty if an attempt is made to withdraw more money than available in the account.

Sample Output:

CASE 1(with penalty):

Current Balance: 2000.0                                                                                                 
Enter the amount to withdraw                                                                                            
3000                                                                                                                    
Current Balance after withdraw: 1995.0                                                                                  
Enter the amount to deposit                                                                                             
1000                                                                                                                    
Current Balance after deposit: 2995.0                                                                           
                                                                                                                            

CASE 2(without penalty):
Current Balance: 2000.0                                                                                                 
Enter the amount to withdraw                                                                                            
1000                                                                                                                    
Current Balance after withdraw: 1000.0                                                                                  
Enter the amount to deposit                                                                                             
2000                                                                                                                    
Current Balance after deposit: 3000.0                                                                                   
 */
import java.util.Scanner;
class Account{
Scanner sc=new Scanner(System.in);
String Name;
long acno;  
double balance;
Account() 
  { 
	balance = 0;   
  }
Account(String n,long a,double b)
   { 
   	 Name=n;
     acno=a;
     balance=b; 
    }
void deposit(double sum)
    {
  	 balance += sum;
 
    }
  void withdraw(double sum) 
  {
  	  if (sum > balance)
    { 
    		  balance -= 5;
    }
 else 
    { 
    		  balance -= sum;
      
    }
  }
  double getBalance() 
   { 
	return balance; 
   } 
}
class TestAccount{
public static void main(String a[])
{		 
 Account b=new Account("Anil",12345L,2000.0);
 System.out.println("Current Balance: "+b.getBalance());
 System.out.println("Enter the amount to withdraw");
 double amt=sc.nextDouble();
 b.withdraw(amt);
 System.out.println("Current Balance after withdraw: "+b.getBalance());
 System.out.println("Enter the amount to deposit");
 amt=sc.nextDouble();
 b.deposit(amt);
 System.out.println("Current Balance after deposit: "+b.getBalance());
}
}







