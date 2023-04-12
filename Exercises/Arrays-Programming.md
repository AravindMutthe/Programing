
# Arrays:

1. Write a Java program to find sum and average of all elements in an array.

```
sample
input =6 (//enter array size)
10 20 30 40 50 -10   (//enter array elements)
output =
140       (//sum)
23.333334 (//average)
```

```java
import java.util.*;
class ArrSumAvg
{
int n, sum = 0;
float average;
Scanner s;
int a[];
ArrSumAvg()
{
s= new Scanner(System.in);
n = s.nextInt();
a = new int[n];
}
void input()
{
for(int i = 0; i < n ; i++)
{
a[i] = s.nextInt();
}
}
void calculate()
{
for(int i = 0; i < n ; i++)
{
sum = sum + a[i];
}
average = (float)sum / n;
}
void output()
{
System.out.println(sum);
System.out.println(average);
}
}
class Test
{
public static void main(String args[])
{
ArrSumAvg a=new ArrSumAvg();
a.input();
a.calculate();
a.output();
}
}
```


2. Write a Java program to add two array elements and store the result in third array.

```
sample
input =5    (//enter array size)
-10 20 5 3 2    (//enter 1st array elements)
8 10 3 4 6      (//enter 2nd array elements)
output =
-2 30 8 7 8
```

```java
import java.util.*;
class ArrSumAvg
{
int n, sum = 0;
float average;
Scanner s;
int a[],b[],res[];
ArrSumAvg()
{
s= new Scanner(System.in);
n = s.nextInt();
a = new int[n];
b = new int[n];
res = new int[n];

}
void input()
{
for(int i = 0; i < n ; i++)
{
a[i] = s.nextInt();
}
for(int i = 0; i < n ; i++)
{
b[i] = s.nextInt();
}
}
void calculate()
{
for(int i = 0; i < n ; i++)
{
res[i] = a[i]+b[i];
}

}
void output()
{
for(int i = 0; i < n ; i++)
{
System.out.print(res[i]+"");
}
}
}
class Test
{
public static void main(String args[])
{
ArrSumAvg a=new ArrSumAvg();
a.input();
a.calculate();
a.output();
}
}
```

3. Write  a java program to find second largest element in an array without sorting elements.

```
sample
input =
6
4 1 2 5 3 6
output =
5
```

```java
import java.util.*;
class SecondLargest
{
int arr[],n;
Scanner s=new Scanner(System.in);

//use input() method, to read the required input values
//use the find() method to perform the required logic and print the result

void input()
{
n=s.nextInt();
arr=new int[n];
for(int i=0;i<arr.length;i++)
{
arr[i]=s.nextInt();
}
}
void find()
{
  int largest = arr[0];
  int secondLargest = arr[0];
  for (int i = 0; i < arr.length; i++)
  {
   if (arr[i] > largest)
   {
    secondLargest = largest;
    largest = arr[i];
   }
   else if (arr[i] > secondLargest)
   {
    secondLargest = arr[i];
   }
  }
  System.out.println(secondLargest);
 }
}
class Test
{
 public static void main(String[] args)
 {
     SecondLargest sl=new SecondLargest();
     sl.input();
     sl.find();
 }
}
```

4. Write a Java program to calculate the sum of all elements of even indices of an array and print it then find and print factors of that sum

```
sample
input =
5               (//enter size)
1 3 10 6 7      (//enter array elements)
output =
18      (//print sum)
1 2 3 6 9 18

```

```java
import java.util.*;
class CheckSumEvOd_Arr
{
int arr[],n;
Scanner s=new Scanner(System.in);

//use input() method, to read the required input values
//use the find() method to perform the required logic and print the result

void input()
{
n=s.nextInt();
arr=new int[n];
for(int i=0;i<arr.length;i++)
{
arr[i]=s.nextInt();
}
}
void find()
{
int sum=0;
for(int i=0;i<arr.length;i++)
{
if(i%2==0)
{
sum=sum+arr[i];
}
}
System.out.println(sum);
for(int i=1;i<=sum;i++)
{
if(sum%i==0)
System.out.print(i+"");
}

}
}
class Test
{
 public static void main(String[] args)
 {
     CheckSumEvOd_Arr c=new CheckSumEvOd_Arr();
     c.input();
     c.find();
 }
}
```

5. Write a Java to find sum of diagonal elements of an array
note:

1. Calculate diagonal sum for square matrix
2. if entered order of matrix is not square matrix then print -1

sample

1. input =
2
3
output = -1
2. input =
2
2
1 2 3 4
output = 5
*/
import java.util.*;
class DiagonalSum
{
int a[][],m,n;
Scanner s=new Scanner(System.in);
DiagonalSum(int m,int n)
{
this.m=m;
this.n=n;
}
void input()
{

a=new int[m][n];
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
a[i][j]=s.nextInt();
}
}
}
void calculate()
{
int sum=0;
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
if(i==j)
sum+=a[i][j];
}
}
System.out.println(sum);
}
//Write required logic here
}
class Test
{
public static void main(String args[])
{

int m,n;
Scanner s=new Scanner(System.in);
m=s.nextInt();
n=s.nextInt();

if(m==n)
{
DiagonalSum d=new DiagonalSum(m,n);
d.input();
d.calculate();
}
else
System.out.println(-1);
//call methods here
}
}

/*Write a Java to find row sum of each individual rows of an array
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
import java.util.*;
class RowSum
{
int a[][],m,n;
Scanner s=new Scanner(System.in);
RowSum()
{
m=s.nextInt();
n=s.nextInt();
}
void input()
{

a=new int[m][n];
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
a[i][j]=s.nextInt();
}
}
}
void calculate()
{
int sum[]=new int[m];
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
sum[i]=sum[i]+a[i][j];
}
}
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(a[i][j]+"");
}
System.out.println("= "+sum[i]);
}

}
//Write required logic here
}
class Test
{
public static void main(String args[])
{
RowSum r= new RowSum();
r.input();
r.calculate();

}
}

/*Write a Java Program to find mid value of an array after sorting elements of it
sample
input =
6      (//array size)
1      (//enter array elements)
2
3
0
9
4
output =
0 1 2 3 4 9
2.5
*/

import java.util.*;
class MidValueArr
{
int arr[],n,t;
double t1;
Scanner s=new Scanner(System.in);

//use input() method, to read the required input values
//use the find() method to perform the required logic and print the result

void input()
{
n=s.nextInt();
arr=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
}
void find()
{
int temp;
for(int i=0;i<n;i++)

{
for(int j=i+1;j<n;j++)
{
if(arr[i]>arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
for(int i=0;i<n;i++)
{
System.out.print(arr[i]+"");
}
System.out.println();
     if(n%2==0)
     {
         t=(n+1)/2;
         t1=(arr[t]+arr[t-1])/2.0;
         System.out.println(t1);
     }
     else
      System.out.println(arr[n/2]);
 }
}
class Test
{
 public static void main(String[] args)
 {
     MidValueArr sl=new MidValueArr();
     sl.input();
     sl.find();
 }
}

/*Write a Java Program to find closest value of a number in an array
sample
input =
5         (//enter array size)
9 85 63 -23 -15     (//enter array elements)
-2      (//enter value to find closest number in array)
output =
9

*/

import java.util.*;
class ClosestValArr
{
int arr[],n,val,cval=0;
double t1;
Scanner s=new Scanner(System.in);

//use input() method, to read the required input values
//use the find() method to perform the required logic and print the result

void input()
{
n=s.nextInt();
arr=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
val=s.nextInt();
}
void find()
{
int distance=Math.abs(arr[0]-val);
for(int i=0;i<n;i++)
{
int distance1=Math.abs(arr[i]-val);
if(distance>=distance1)
{
cval=arr[i];
distance=distance1;
}
}
    System.out.println(cval);
 }
}
class Test
{
 public static void main(String[] args)
 {
     ClosestValArr sl=new ClosestValArr();
     sl.input();
     sl.find();
 }
}

/*Write a Java program to merge two arrays into the third array.
sample
input =
5
3
10 20 30 40 50
11 22 33
output =
10 20 30 40 50 11 22 33

*/
import java.util.*;
class MergeTwoArr
{
int a[],b[],m,n,c[];
Scanner s=new Scanner(System.in);

MergeTwoArr()
{
m=s.nextInt();
n=s.nextInt();
a=new int[m];
b=new int[n];
c=new int[m+n];
}
void input()
{
for(int i=0;i<m;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
b[i]=s.nextInt();
}
}
void merge()
{
int i,j;
for(i=0;i<m;i++)
{
c[i]=a[i];
}
for(j=0;j<n;j++)
{
c[i++]=b[j];
}
for(i=0;i<c.length;i++)
{
System.out.print(c[i]+"");
}
 }
}
class Test
{
 public static void main(String[] args)
 {
     MergeTwoArr m=new MergeTwoArr();
     m.input();
     m.merge();
 }
}

/*Write a Java program to delete a element from an array

sample

1. input =
5                (// enter array size)  
3 1 4 10 20      (//enter array elements)
4                (//enter the element to delete)
output =
Element deleted
3 1 10 20

2. input =
5
3 1 4 10 20
15
output =
Element not found

*/

import java.util.*;
class DelEleArr
{
int a[],n,del;
Scanner s=new Scanner(System.in);
DelEleArr()
{
n=s.nextInt();
a=new int[n];
}

void input()
{
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
del=s.nextInt();
}
void delEle()
{
int i,flag=0;
for(i=0; i<n; i++)
{
if(a[i] == del)
{
for(int j=i; j<(n-1); j++)
{
a[j] = a[j+1];
}
flag=1;
break;
}
}
if(flag==0)
{
System.out.println("Element not found");
}
else
{
System.out.println("Element deleted");
for(i=0; i<(n-1); i++)
{
System.out.print(a[i]+ "");
}
}
}
}
class Test
{
public static void main(String[] args)
 {
DelEleArr d=new DelEleArr();
d.input();
d.delEle();
 }
}

/*Write a Java program to delete a element from an array

sample

1. input =
    5                (// enter array size)
    3 1 4 10 20      (//enter array elements)
    4                (//enter the element to delete)
    output =
    Element deleted
    3 1 10 20

2. input =
    5
    3 1 4 10 20
    15
    output =
   Element not found

 */

import java.util.*;
class DelEleArr
{
    int a[],n,del;
    Scanner s=new Scanner(System.in);
    DelEleArr()
    {
        n=s.nextInt();
        a=new int[n];
    }

    void input()
    {
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        del=s.nextInt();
    }
    void delEle()
    {
        int i,flag=0;
        for(i=0; i<n; i++)
       {
           if(a[i] == del)
           {
               for(int j=i; j<(n-1); j++)
               {
                   a[j] = a[j+1];
               }
               flag=1;
               break;
           }
       }
       if(flag==0)
       {
           System.out.println("Element not found");
       }
       else
       {
           System.out.println("Element deleted");
           for(i=0; i<(n-1); i++)
           {
               System.out.print(a[i]+ " ");
           }
       }
    }
}
class Test
{
    public static void main(String[] args)
 {
        DelEleArr d=new DelEleArr();
        d.input();
        d.delEle();
 }
}

/*
 Write a Java Program to insert an element at a specified position in a given array
 sample

 1. input =
     5          (//Enter no. of elements)
     10 20 30 40 50 (//Enter Elements)
     2      (//Enter the position where you want to insert element)
     100    (//Enter the element to insert)
     output =
     10 100 20 30 40 50
 2. input =-2
     output =enter array size >= 0
 3. input =
    3
    10 20 30
    6
    output =
    Entered position is beyond the size of array
*/
import java.util.*;
class InsertEleArray
{
     int n, pos, x;
      int a[];
      Scanner s = new Scanner(System.in);
      InsertEleArray()
      {
          n = s.nextInt();
      }
      void input()
      {
            if(n>=0)
            {
                a= new int[n+1];
                for(int i = 0; i < n; i++)
                {
                    a[i] = s.nextInt();
                }  
                pos = s.nextInt();
                if(pos<=n)
                {
                     x = s.nextInt();
                     insertEle();
                }
                else
                {
                    System.out.println("Entered position is beyond the size of array");
                }
            }
            else
            {
                System.out.println("enter array size >= 0");
            }

      }
      void insertEle()
      {
            for(int i = (n-1); i >=(pos-1); i--)
            {
                a[i+1] = a[i];
            }
            a[pos-1] = x;
            for(int i = 0; i <= n; i++)
            {
                System.out.print(a[i]+" ");
            }
      }
}

public class Test
{
    public static void main(String[] args)
    {

        InsertEleArray i = new InsertEleArray();
        i.input();
    }
}

/*
Write a Java program to count number of pairs of elements which are equal to given sum
sample

1. input =5
    10 5 15 20 30
    25
    output =
    (10,15) = 25
    (5,20) = 25
    2
2. input =2
    10 20
    40
    output = no pairs
*/
import java.util.*;
class Count_Pairs_Equal2Sum
{
    int a[],n,sum=0;
    Scanner s=new Scanner(System.in);
    void input()
    {
        n=s.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        sum=s.nextInt();
    }
    void getPairs()
    {
        int count=0;
       for (int i = 0; i < a.length; i++)
       {
   for (int j = i + 1; j < a.length; j++)
   {
    if ((a[i] + a[j]) == sum)
    {
        System.out.println("("+a[i]+","+a[j]+") = "+sum);
        count++;
    }
   }
       }
       if(count==0)
       {
           System.out.println("no pairs");
       }
       else
       {
            System.out.println(count);
       }
      
    }
}
class Test
{
    public static void main(String args[])
    {
        Count_Pairs_Equal2Sum c= new Count_Pairs_Equal2Sum();
        c.input();
        c.getPairs();
    }
}

/*Write a Java program to remove duplicate elements from an unsorted Array
sample
input =
5
3 2 1 1 3
output =
1 2 3
*/
import java.util.*;

class RemDupEle_Array
{
    void remDupEle()
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int[] temp = new int[n];
        int j = 0;
        Arrays.sort(arr);
        for (int i=0; i<n-1; i++)
            if (arr[i] != arr[i+1])
                temp[j++] = arr[i];

        temp[j++] = arr[n-1];   
        for (int i=0; i<j; i++)
        System.out.print(temp[i]+" ");
    }
}
class Test
{
    public static void main (String[] args)
    {

        RemDupEle_Array r=new RemDupEle_Array();
         r.remDupEle();
    }
}
