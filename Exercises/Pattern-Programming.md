1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
1 2 3 4 5 6 5 4 3 2 1
1 2 3 4 5 6 7 6 5 4 3 2 1

import java.util.Scanner;

public class MainClass
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Taking rows value from the user
         
        System.out.println("How many rows you want in this pattern?");
         
        int rows = sc.nextInt();
         
        System.out.println("Here is your pattern....!!!");
         
        for (int i = 1; i <= rows; i++) 
        {
            //Printing first half of the row
             
            for (int j = 1; j <= i; j++) 
            { 
                System.out.print(j+" "); 
            }
             
            //Printing second half of the row 
             
            for (int j = i-1; j >= 1; j--)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
         
        //Closing the resources
         
        sc.close();
    }
}

2.1234567
  234567
    34567
      4567
        567
          67
            7
          67
        567
      4567
    34567
  234567
1234567

import java.util.Scanner;

public class MainClass
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Taking rows value from the user
         
        System.out.println("How many rows you want in this pattern?");
         
        int rows = sc.nextInt();
         
        System.out.println("Here is your pattern....!!!");
         
        //Printing upper half of the pattern
         
        for (int i = 1; i <= rows; i++) 
        {
            //Printing i spaces at the beginning of each row
             
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
             
            //Printing i to rows value at the end of each row
             
            for (int j = i; j <= rows; j++) 
            { 
                System.out.print(j); 
            } 
             
            System.out.println(); 
        } 
         
        //Printing lower half of the pattern 
         
        for (int i = rows-1; i >= 1; i--) 
        {
            //Printing i spaces at the beginning of each row
             
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
             
            //Printing i to rows value at the end of each row
             
            for (int j = i; j <= rows; j++)
            {
                System.out.print(j);
            }
             
            System.out.println();
        }
         
        //Closing the resources
         
        sc.close();
    }
}

1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
6 5 4 3 2 1
7 6 5 4 3 2 1

import java.util.Scanner;

public class MainClass
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Taking rows value from the user
         
        System.out.println("How many rows you want in this pattern?");
         
        int rows = sc.nextInt();
         
        System.out.println("Here is your pattern....!!!");
         
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
         
        //Close the resources
         
        sc.close();
    }
}

Pattern programs in java : Pattern 12

1
10
101
1010
10101
101010
1010101

import java.util.Scanner;

public class MainClass
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rows you want in this pattern?");
         
        int rows = sc.nextInt();
         
        System.out.println("Here is your pattern....!!!");
         
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                if(j%2 == 0)
                {
                    System.out.print(0);
                }
                else
                {
                    System.out.print(1);
                }
            }
             
            System.out.println();
        }
         
        sc.close();
    }
}

1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
6 5 4 3 2 1
7 6 5 4 3 2 1

import java.util.Scanner;

public class MainClass
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Taking rows value from the user
         
        System.out.println("How many rows you want in this pattern?");
         
        int rows = sc.nextInt();
         
        System.out.println("Here is your pattern....!!!");
         
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
         
        //Close the resources
         
        sc.close();
    }
}

Pattern programs in java : Pattern 12

1
10
101
1010
10101
101010
1010101

import java.util.Scanner;

public class MainClass
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rows you want in this pattern?");
         
        int rows = sc.nextInt();
         
        System.out.println("Here is your pattern....!!!");
         
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                if(j%2 == 0)
                {
                    System.out.print(0);
                }
                else
                {
                    System.out.print(1);
                }
            }
             
            System.out.println();
        }
         
        sc.close();
    }
}

 * 
  * *

  * * *
 * * * *
* * * * *
import java.io.*;

// Java code to demonstrate star pattern
public class GeeksForGeeks
{
 // Function to demonstrate printing pattern
 public static void printTriagle(int n)
 {
  // outer loop to handle number of rows
  // n in this case
  for (int i=0; i<n; i++)
  {

   // inner loop to handle number spaces 
   // values changing acc. to requirement 
   for (int j=n-i; j>1; j--) 
   { 
    // printing spaces 
    System.out.print(" "); 
   } 

   // inner loop to handle number of columns 
   // values changing acc. to outer loop 
   for (int j=0; j<=i; j++ ) 
   { 
    // printing stars 
    System.out.print("* "); 
   } 

   // ending line after each row 
   System.out.println(); 
  } 
 } 
 
 // Driver Function 
 public static void main(String args[]) 
 { 
  int n = 5; 
  printTriagle(n); 
 } 
}

/* Write a Java program to print the following pattern

sample
input = 5
output =
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

*/
import java.util.*;
class Pattern
{
void print(int n)
{
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(j+"");
}
System.out.println();
}
}
}
class Test
{
public static void main(String args[])
{
Scanner s= new Scanner(System.in);
Pattern p=new Pattern();
int n=s.nextInt();
p.print(n);
}
}

/* Write a Java program to print the following pattern

sample
input = 5
output =
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1

*/
import java.util.*;
class Pattern
{
void print(int n)
{
for(int i=n;i>=1;i--)
{
for(int j=n;j>=i;j--)
{
System.out.print(j+"");
}
System.out.println();
}
}
}
class Test
{
public static void main(String args[])
{
Scanner s= new Scanner(System.in);
Pattern p=new Pattern();
int n=s.nextInt();
p.print(n);
}
}

/* Write a Java program to print the following pattern

sample
input =
5
output =
1 1 1 1 1
0 0 0 0
1 1 1
0 0
1

*/
import java.util.*;
class Pattern
{
Scanner s= new Scanner(System.in);
int n=s.nextInt();
void print()
{
for(int i=1;i<=n;i++)
{
for(int j=i;j<=n;j++)
{
if(i%2==0)
System.out.print("0"+"");
else
System.out.print("1"+ "");
}
System.out.println();
}
}
}
class Test
{
public static void main(String args[])
{

Pattern p=new Pattern();
p.print();
}
}

/* Write a Java program to print the following pattern

sample
input =
6
output =
1
2 3
4 5 6
7 8 9 0
1 2 3 4 5
6 7 8 9 0 1  

*/
import java.util.*;
class Pattern
{
void print(int n)
{
int t = 1;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
if(t==10)
t=0;
System.out.print(t++ +"");
}
System.out.println();
}
}
}
class Test
{
public static void main(String args[])
{
Scanner s= new Scanner(System.in);
Pattern p=new Pattern();
int n=s.nextInt();
p.print(n);
}
}

/* Write a java program to print the following pattern for given integer n. (i.e if n>0).
Note: print -1 for all other boundary conditions.
sample 1:
input = 5
output =
1
4 1
9 4 1
16 9 4 1
25 16 9 4 1

sample 2:
input = -3
output =
-1

*/
import java.util.*;
class Pattern
{
int n;
Scanner s;
//declare and read required variables
Pattern()
{
s=new Scanner(System.in);
n=s.nextInt();
}
//use print() to print the required pattern.
void print()
{
if(n>0)
{
for (int i = 1; i <= n; i++)
{
for (int j = i; j >= 1; j--)
{
System.out.print(j*j+"");
}
System.out.println();
}
}
else
System.out.println(-1);
}
}
class Test
{
public static void main(String args[])
{
Pattern p=new Pattern();
p.print();
}
}

/*Write a Java program to print the following pattern
note: if n>0, print pattern
 else
 print -1
 
sample
input =
5
output =
*
***
*****
*******
*********

*/
import java.util.*;
class Pattern
{
void print(int n)
{
if(n>0)
{
for(int i=1;i<=n;i++)
{
for(int j=i;j<n;j++)
{
System.out.print("");
}
for(int k=1;k<(i*2);k++)
{
System.out.print("*");
}
System.out.println();
}
}
else
System.out.println("-1");
}
}
class Test
{
public static void main(String args[])
{
Scanner s= new Scanner(System.in);
Pattern p=new Pattern();
int n=s.nextInt();
p.print(n);
}
} 

/*Write a Java program to print the following pattern
note:
if n>0, print pattern
else
print -1

sample
input =
5
output =
12345
1234
123
12
1

*/
import java.util.*;
class Pattern
{
void print(int n)
{
if(n>0)
{
for(int i=n;i>=1;i--)
{
for(int j=1;j<=i;j++)
{
System.out.print(j);
}
System.out.println();
}
}
else
System.out.println("-1");
}
}
class Test
{
public static void main(String args[])
{
Scanner s= new Scanner(System.in);
Pattern p=new Pattern();
int n=s.nextInt();
p.print(n);
}
}

/*Write a Java program to print the following pattern
note:
if n>0, print pattern
else
print -1

sample
input =
5
output =
54321
4321
321
21
1

*/
import java.util.*;
class Pattern
{
void print(int n)
{
if(n>0)
{
for(int i=n;i>=1;i--)
{
for(int j=i;j>=1;j--)
{
System.out.print(j);
}
System.out.println();
}
}
else
System.out.println("-1");
}
}
class Test
{
public static void main(String args[])
{
Scanner s= new Scanner(System.in);
Pattern p=new Pattern();
int n=s.nextInt();
p.print(n);
}
}

/*Write a Java program to print the following pattern
note:
if n>0, print pattern
else
print -1

sample
input =
5
output =
A
AB
ABC
ABCD
ABCDE

*/
import java.util.*;
class Pattern
{
void print(int n)
{
char ch;
if(n>0)
{
for(int i=1;i<=n;i++)
{
ch='A';
for(int j=0;j<i;j++)
{
System.out.print(ch++);
}
System.out.println();
}
}
else
System.out.println("-1");
}
}
class Test
{
public static void main(String args[])
{
Scanner s= new Scanner(System.in);
Pattern p=new Pattern();
int n=s.nextInt();
p.print(n);
}
}

/*Write a Java program to print the following pattern
note:
if n>0, print pattern
else
print -1

sample
input =
5
output =
    *
   ***
  *****
 *******
*********
*/
import java.util.*;
class Pattern
{
    void print(int n)
    {
        if(n>0)
        {
           for(int i=1;i<=n;i++)
           {
                for(int j=i;j<n;j++)
                {
                    System.out.print(" ");
                }
                for(int k=1;k<(i*2);k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else
        System.out.println("-1");
    }
}
class Test
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        Pattern p=new Pattern();
        int n=s.nextInt();
        p.print(n);
    }
}

/*Write a Java program to print the following pattern
note:
if n>0, print pattern
else
print -1
sample
input = 7
output =
1234567
12345
123
1
*/
import java.util.*;
class Pattern
{
     Scanner s= new Scanner(System.in);
     int n;

    void print()
    {
         n =s.nextInt();
        if(n>0)
        {
           for(int i=n;i>=1;i-=2)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
        else
        System.out.println("-1");
    }
}
class Test
{
    public static void main(String args[])
    {

        Pattern p=new Pattern();
        p.print();
    }
}

/*Write a Java program to print the following pattern
note:
if n>0, print pattern
else
print -1
sample
input =
5
output =
E
DE
CDE
BCDE
ABCDE
*/
import java.util.*;
class Pattern
{
     Scanner s= new Scanner(System.in);
     int n;
     Pattern()
     {
           n =s.nextInt();
     }
     void print()
     {
        if(n>0)
        {
           for(int i=n;i>=1;i--)
            {
                 for(int j=i;j<=n;j++)
                {
                    System.out.print((char)('A'+(j-1)));
                }
                System.out.println();
            }
        }
        else
        System.out.println("-1");
    }
}
class Test
{
    public static void main(String args[])
    {
        Pattern p=new Pattern();
        p.print();
    }
}

/*Write a Java program to print the following pattern
note:
if n>0, print pattern
else
print -1
sample
input = 5
output =
1
01
101
0101
10101
*/
import java.util.*;
class Pattern
{
     Scanner s= new Scanner(System.in);
     int n;

    void print()
    {
         n =s.nextInt();
        if(n>0)
        {
           for(int i=1;i<=n;i++)
            {
                for(int j=i;j>=1;j--)
                {
                    System.out.print(j%2);
                }
                System.out.println();
            }
        }
        else
        System.out.println("-1");
    }
}
class Test
{
    public static void main(String args[])
    {

        Pattern p=new Pattern();
        p.print();
    }
}
