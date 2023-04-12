/*
1  instance variables can assign values to objects idividully by using dot operator access instance var. ==>we have to initialize all objects
2. with the help of methods we have to initilize each obj individully by using dot operator. ==>when new objects were created we have to initilize each obj individully.
CONSTRUCTOR:
help of consrtucter methods jvm initilize an object when it first created automatically.
by using special method constructor that enables an object to initilize itslef when it is created.
*/
class Rectangle
{
 int length;
 int width;
 Rectangle (int x,int y) // constructor method is created
 {
  length=x;
  width=y;
 }
 int getArea()
 {
  int area=length*width;
  return area;
  
 } 
}
class ConstructorDemo
{
 public static void main(String args[])
 {
     
  Rectangle var1=new Rectangle(2,2);     
        Rectangle var2=new Rectangle(5,5);
       Rectangle var3=new Rectangle(7,7);     //automaticlly initilizing methosds to objects of a classs
  int area1,area2,area3;
     var1.getArea();                               // initilizing methods  to each individul obj 
  var2.getArea();
  var3.getArea();                          
  area1=var1.getArea();                         
  area2=var2.getArea();
  area3=var3.getArea();                                   //initailizing values to variables
  System.out.println("Area 1 is:"+area1);
  System.out.println("Area 2 is:"+area2);
  System.out.println("Area 3 is:"+area3);
 }
}
/*Write a java program to find vowel count each and every row in an 2D Array
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
import java.util.Scanner;
class Aravind
{
    Scanner sc=new Scanner(System.in);
    char a[][];
    r,c;
    void read()
    {
        r=sc.nextInt();
        c=sc.nextInt();
        a=new char[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.next().charAt(0);
            }
        }
    }
    void fun()
    {
        int count=0;
        for(int i=0;i<r;i++)
        {
            count=0;
            for(int j=0;j<c;j++)
            {

            }
        }
    }
}/*Write a java program to find vowel count each and every row in an 2D Array
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
import java.util.Scanner;
class Aravind
{
    Scanner sc=new Scanner(System.in);
    char a[][];
    int r,c;
    void read()
    {
        r=sc.nextInt();
        c=sc.nextInt();
        a=new char[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.next().charAt(0);
            }
        }
    }
    void fun()
    {
        int count;
       for(int i=0;i<r;i++)
       {
           count=0;
           for(int j=0;j<c;j++)
           {
               if(a[i][j]=='a'||a[i][j]=='e'||a[i][j]=='o'||a[i][j]=='i'||a[i][j]=='u')
               {
                   count++;
               }
               System.out.print(a[i][j]+" ");
           }
           System.out.println("="+count);
       }
    }
}
class Test
{
    public static void main(String args[])
    {
    Aravind m=new Aravind();
    m.read();
    m.fun();
    }
}/*Write a java program to sort the strings in lexographical order
sample
//input
4
word hard dream big
//output
big dream hard work
*/
import java.util.Scanner;
class LOrder
{
    Scanner sc= new Scanner(System.in);
    int n;
    String temp,Sarr[];
    void read()
    {  
        n=sc.nextInt();
        Sarr=new String[n];
        for(int i=0;i<Sarr.length;i++)
        {
            Sarr[i]=sc.next();
        }
    }
    void fun()
    {
        for(int i=0;i<Sarr.length-1;i++)
        {
             for(int j=i+1;j<Sarr.length;j++)
             {
                 if(Sarr[i].compareTo(Sarr[j])>0)
                 {
                     temp=Sarr[i];
                     Sarr[i]=Sarr[j];
                    Sarr[j]= temp;
                 }
             }
        }
        for (int i=0;i<n;i++)
        {
            System.out.println(Sarr[i]);
        }
    }
}
class Test
{
    public static void main(String args[])
    {
        LOrder l=new LOrder();
        l.read();
        l.fun();
    }

}//read a secntence and try to print words stating with vowel along with its length
import java.util.*;
class test
{
 Scanner sc = new Scanner(System.in);
 String str;
 void read()
 {
      str=sc.nextLine();
 int count=0;
  String s[]= str.split(" ");

     for(int i=0;i<s.length;i++)
     {
     char ch=s[i].charAt(0);
  
          if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
          {
  
     System.out.println(s[i]+"-"+s[i].length());
     
    count++;
    }     
  
 
     }
  System.out.println("no of words ="+count);
 }
}
class Test
{
 public static void main(String args[])
 {
  test t = new test();
  t.read();
 }
}
 /*Write a java program to remove all the digits and special characters from the
   input string and display the output in the specified format
   sample
   input = &*re(9m)o^v6e
   output = remove
            total number of digits removed = 2
            total number of special characters removed = 5
*/
import java.util.*;
class Aravind
{
    Scanner sc = new Scanner(System.in);
    String str,s;
    void read()
    {
        str=sc.next();
      int count=0,dcount=0;
        for(int i=0;i<str.length();i++)
        {
            if( str.charAt(i)>=48 && str.charAt(i)<=57)
            {
                dcount++;
            }
            if(!((str.charAt(i)>=65 && str.charAt(i)<=90)||(str.charAt(i)>=97 &&str.charAt(i)<=122)||(str.charAt(i)>=48 && str.charAt(i)<=57)))
            {

                count++;
                
            }
           if((str.charAt(i)>=65 && str.charAt(i)<=90) ||(str.charAt(i)>=97 &&str.charAt(i)<=122))
                {
                System.out.print(str.charAt(i));
                
                }
            }
            
        
         System.out.println("\ntotal number of digits removed ="+dcount);
    
        System.out.println("total number of special characters removed = "+(count));
    }
}
class Test
{
    public static void main(String args[])
    {
        Aravind m = new Aravind();
        m.read();
    }
}// write a java program to read n strings from keyboard and then print the srings wch begins with the particular character

import java.util.Scanner;
class ReadString
{
 Scannersc=new Scanner(System.in);
 int n;
 String s[];
 char sval,eval;
 void read()
 {
  n=sc.nextInt();
  s=new String[n];
  for(int i=0;i<n;i++)
  {
   s[i]=sc.nextLine();
  }
  sval=sc.next();
  eval=sc.next();
 }
 void fun()
 {
  for(int j=0;j<n;j++)
  {
   if(s[j].startswith(&ch) && s[j].endswith(&ch))
   {
    
   }
  }
  
 }
}
class Strings
{
 public static void main(String args[])
 {
  ReadString s=new ReadString();
  s.read();
  s.fun();
 }
}/*Write a java program to find longest word in a sentence
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
}/*Write a java program to sort the strings in lexographical order
sample
//input
4
word hard dream big
//output
big dream hard work
*/
import java.util.Scanner;
class LOrder
{
    Scanner sc= new Scanner(System.in);
    int n;
    String temp,Sarr[];
    void read()
    {  
        n=sc.nextInt();
        Sarr=new String[n];
        for(int i=0;i<Sarr.length;i++)
        {
            Sarr[i]=sc.next();
        }
    }
    void fun()
    {
        for(int i=0;i<Sarr.length-1;i++)
        {
             for(int j=i+1;j<Sarr.length;j++)
             {
                 if(Sarr[i].compareTo(Sarr[j])>0)
                 {
                     temp=Sarr[i];
                     Sarr[i]=Sarr[j];
                    Sarr[j]= temp;
                 }
             }
        }
        for (int i=0;i<n;i++)
        {
            System.out.println(Sarr[i]);
        }
    }
}
class Test
{
    public static void main(String args[])
    {
        LOrder l=new LOrder();
        l.read();
        l.fun();
    }

}
//////////////
import java.util.*;
class Split
{
 static void fun(int n,int a[])
 {
  int split=n/2;
  if(n%2==0)
  {
   for(int i=0;i<split/2;i++)
   {
    int temp=a[i];
    a[i]=a[split-i-1];
    a[split-i-1]=temp;
   }
   
   for(int i=0;i<split/2;i++)
   {
    int temp=a[split+i];
    a[split+i]=a[n-i-1];
    a[n-i-1]=temp;
   }
   
   
  }
  for(int k=0;k<n;k++)
  {
   System.out.print(a[k]+" ");
  }
  
 }
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int len=sc.nextInt();
  int arr[]=new int[len];
  for(int i=0;i<len;i++)
  {
   arr[i]=sc.nextInt();
  }
  fun(len,arr);
 }
}
///////////
import java.util.*;
class SmallestNum
{
 static void fun(int n,int a[])
 {
  int m=a[0];
  int max=a[0];
  for(int i=0;i<n;i++)
  {
   if(m>a[i])
   {
    m=a[i];
   }
   if(max<a[i])
   {
    max=a[i];
   }
  }
  System.out.println(max);
  System.out.println(m);
  
 }
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int len=sc.nextInt();
  int arr[]=new int[len];
  for(int i=0;i<len;i++)
  {
   arr[i]=sc.nextInt();
  }
  //int m=sc.nextInt();
  fun(len,arr);
 }
}
///////////////////
import java.util.Scanner;
class SecLarArr1
{
 //8818600028
 public static void fun(int n,int a[])
 {
  int max=a[0];
  int secMax=a[0];
  for(int i=0;i<n;i++)
  {
   
    if(a[i]>max)
    {
     secMax=max;
     max=a[i];
    }
    else if(a[i]>secMax)
    {
     secMax=a[i];
    }
   
  }
  System.out.println(secMax);
 }
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int len=sc.nextInt();
  int arr[]=new int[len];
  for(int i=0;i<len;i++)
  {
   arr[i]=sc.nextInt();
  }
  fun(len,arr);
 }
}
//////////////
import java.util.*;
class RevArr
{
 Scanner sc=new Scanner(System.in);
 int n,mid,a[],temp;
 void read()
 {
  n=sc.nextInt();
  mid=n/2;
  a=new int[n];
  for(int i=0;i<n;i++)
  {
   a[i]=sc.nextInt();
  }
 }
 void fun()
 {
  for(int i=0;i<mid;i++)
  {
   temp=a[i];
   a[i]= a[n-i-1];
   a[n-i-1]=temp;
  }
 }
 void disp()
 {
  for(int k=0;k<n;k++)
  {
   System.out.print(a[k]+" ");
  }
 }
}
class RevArrayEle
{
 public static void main(String args[])
 {
  RevArr rev=new RevArr();
  rev.read();
  rev.fun();
  rev.disp();
 }
}
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
class ReverseArr
{
        Scanner sc=new Scanner(System.in);
        int i,n,arr[];
  int start;
  int end=0;
  void read()
  {
   n=sc.nextInt();
   arr=new int[n];
   for(i=0; i<n; i++)
   {
                arr[i]=sc.nextInt();
   }
   start=0;
   end=i-1;
  }
        void fun()
        {

               while(start<end)
                {
                  int temp=arr[start];
                  arr[start]=arr[end];
                  arr[end]=temp;
                  start++;
                  end--;
                }
        }
        void disp()
        {
                for(i=0;i<n;i++)
                {
                        System.out.println(arr[i]);
                }
        }
}
public class RevArr
{
 public static void main(String[] args)
 {
  ReverseArr RA=new ReverseArr();
  RA.read();
  RA.fun();
  RA.disp();
 }
}

import java.util.*;
class Palindrome
{
 static void palindrome(int n,int a[])
 {
  int flag=0;
  int i;
  for(i=0;i<n;i++)
  {
   if(a[i]!=a[n-1-i])
   {
    flag=1;
    break;
   }
  }
  if(flag==0)
  {
   System.out.print("its pali");
  }
  else
   {  
    System.out.println("its  not pali");
   } 
  
 }
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int len=sc.nextInt();
  int arr[]=new int[len];
  for(int i=0;i<len;i++)
  {
   arr[i]=sc.nextInt();
  }
  palindrome(len,arr);
 }
}
////////////////////
import java.util.*;
class MaxAccurance
{
 static void fun(int n,int a[])
 {
  int count=0;
  int maxcount=0;
  int maxnum=0;
  for(int i=0;i<n;i++)
  {
   for(int j=0;j<n;j++)
   {
    count=0;
    if(a[i]==a[j])
    {
     count++;
    }
    if(count>maxcount)
    {
     maxcount=count;
     maxnum=a[j];
    }
   }
  }
  System.out.println(maxnum);
  
 }
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int len=sc.nextInt();
  int arr[]=new int[len];
  for(int i=0;i<len;i++)
  {
   arr[i]=sc.nextInt();
  }
  int m=sc.nextInt();
  fun(len,arr);
 }
}
import java.util.*;
class Fibbonaci
{
 static void fun(int n,int a[])
 {
  int fib,next,flag=0;
  for(int i=0;i<n-2;i++)
  {
   fib=a[i]+a[i+1];
   next=a[i+2];
   if(fib!=next)
   {
    flag=1;
    break;
   }
  }
  if(flag==0)
  {
   System.out.println("its fib series");
  }
  else
   System.out.println("its not fib serirs");
  
 }
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int len=sc.nextInt();
  int arr[]=new int[len];
  for(int i=0;i<len;i++)
  {
   arr[i]=sc.nextInt();
  }
  fun(len,arr);
 }
}

//////////////////
import java.util.*;
class AdjArr
{
 static void fun(int n,int a[],int k)
 {
  int nxt=0;
  int prev=0;
  if(k>=0||k<=n)
  {
   for(int i=k;i<n-1;i++)
   {
     nxt=a[i+1];
     prev=a[i-1];
   }
  }
   System.out.println(nxt+" "+prev);
 }
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int len=sc.nextInt();
  int arr[]=new int[len];
  for(int i=0;i<len;i++)
  {
   arr[i]=sc.nextInt();
  }
  int l=sc.nextInt();
  fun(len,arr,l);
 }
}
////////////
/*Write a java program to print the following pattern
Note: if n<=0, print -1

Sample :
5 //input
//output
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

*/
import java.util.Scanner;
class Pattern11
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter a num:");
        n=sc.nextInt();
        if(n<=0)
        {
            System.out.println(-1);
        }
        else
        {
            for(int i=1;i<=n;i++)
            {
                for(int j=n;j>=i;j--)
                {
                     System.out.print(j%2);
                    }
                     System.out.println(" ");

            }
         }
    }
}
///////////////
import java.util.Scanner;
class Vovels
{
    Scanner sc=new Scanner(System.in);
    String str,Sarr[];
    void read()
    {
        str=sc.nextLine();
        Sarr=str.split(" ");
        System.out.println("word vc cc");
    }
    void fun()
    {
        int vc=0,cc=0;
        //System.out.println("word");
        for(int i=0;i<Sarr.length;i++)
        {
            vc=0;
            cc=0;

            for(int j=0;j<Sarr[i].length();j++)
            {
                char c=Sarr[i].charAt(j);
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                vc++;
                else
                cc++;
            }
            System.out.print(Sarr[i]+" "+vc+" "+cc);
            System.out.println();
            
        }
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
/*Write a java program to find transpose of a matrix
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

import java.util.Scanner;
class Test
{
    int a[][],r,c;
    void read()
    {
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        c=sc.nextInt();
        a=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
    }
    void fun()
    {
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                System.out.println(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}
class TransposeMatrix
{
    public static void main(String args[])
    {
        Test t=new Test();
        t.read();
        t.fun();
    }
}
/////////////
import java.util.Scanner;
class Aravind
{
 Scanner sc=new Scanner(System.in);
 int a[][],r,c;
 void read()
 {
  r=sc.nextInt();
  c=sc.nextInt();
  a=new int[r][c];
  for(int i=0;i<r;i++)
  {
   for(int j=0;j<c;j++)
   {
    a[i][j]=sc.nextInt();
   }
  }
 }
 void fun()
 {
  for(int i=0;i<r;i++)
  {
   if(i%2==0)
   {
    for(int j=0;j<c;j++)
    {
     System.out.println(a[i][j]);
    }
   }
   else
   {
    for(int j=c-1;j>=0;j--)
    {
     System.out.println(a[i][j]);
    }
   }
  }
 }
}
class SnakePattern
{
 public static void main(String args[])
 {
  Aravind m=new Aravind();
  m.read();
  m.fun();
 }
}
//////////
import java.util.Scanner;
class SecLarArr
{
 public static void fun(int n,int a[])
 {
  int max=0;
  for(int i=0;i<n;i++)
  {
   for(int j=0;j<n;j++)
   {
    if(a[i]>a[j+1])
    {
     max=a[i];
    }
   }
  }
  System.out.println(max);
 }
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int len=sc.nextInt();
  int arr[]=new int[len];
  for(int i=0;i<len;i++)
  {
   arr[len]=sc.nextInt();
  }
  fun(len,arr);
 }
}

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
class ReverseArr
{
        Scanner sc=new Scanner(System.in);
        int i,n,arr[];
  int start;
  int end=0;
  void read()
  {
   n=sc.nextInt();
   arr=new int[n];
   for(i=0; i<n; i++)
   {
                arr[i]=sc.nextInt();
   }
   start=0;
   end=i-1;
  }
        void fun()
        {

               while(start<end)
                {
                  int temp=arr[start];
                  arr[start]=arr[end];
                  arr[end]=temp;
                  start++;
                  end--;
                }
        }
        void disp()
        {
                for(i=0;i<n;i++)
                {
                        System.out.println(arr[i]);
                }
        }
}
public class RevArr
{
 public static void main(String[] args)
 {
  ReverseArr RA=new ReverseArr();
  RA.read();
  RA.fun();
  RA.disp();
 }
}

///////////import java.util.*;
class palindrome
{
 Scanner sc=new Scanner(System.in);
 String strr;
 String reverse(String str)
 {
 String rev="";
 for(int i=str.lenth()-1;i>0;i++)
 {
  rev=str.charAt(i);
 }
 return rev;
 }
 void read()
 {
  strr=sc.nextLine();
  String rev="";
  String sarr[]=strr.split("");
  for(int i=0;i<sarr.length;i++)
  {
   rev=reverse(sarr[i]);
   if(rev.equals(sarr[i]))
   System.out.println("palindrome"+sarr[i]);
  }
 }
}
class pa
{
 public static void main(String args[])
 {
  palindrome p=new palindrome();
  p
 }
}
/* Write a program to print the following pattern.
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
import java.util.Scanner;
class Test
{
    Scanner sc=new Scanner(System.in);
    int n,k,k1,k2;
    void read()
    {
        n=sc.nextInt();
        k=0;
        k1=1;
        k2=0;
    }
    void fun()
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                k2=k1+k;
                System.out.print(k1+" ");
                k=k1;
                k1=k2;
            }
            System.out.println();
        }
    }
}
class PatternTest
{
    public static void main(String args[])
    {
        Test t=new Test();
        t.read();
        t.fun();
    }
}
/* You are updating the username policy on your company's internal networking platform.
According to the policy, a username is considered valid if all the following
constraints are satisfied:

1. The username consists of 8 to 30 characters inclusive.
    If the username consists of less than  or greater than  characters, then it is an invalid username.
2. The username can only contain alphanumeric characters and underscores (_).
    Alphanumeric characters describe the character set consisting of lowercase characters , uppercase characters , and digits .
3. The first character of the username must be an alphabetic character,
    i.e., either lowercase character  or uppercase character .

For example:

Username     Validity
Kmit            INVALID; Username length < 8 characters
Kmitngit        VALID
Kmit_123        VALID
1$Kmitngit      INVALID; Username begins with non-alphabetic character
Kmitngit?123    INVALID; '?' character not allowed

Sample :
Kmit //input
INVALID //output

Sample 2 :
Kmit_123 //input
VALID //output

*/

import java.util.*;
class UserNamePolicy
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int countlen=str.length();
        int countfirst=0;
        int cc=0;
        if(countlen<8 && countlen>30)
        {
            System.out.println("INVALID; Username length < 8 characters");
            cc++;

        }
        else
        {
            if(!(Character.isLetter(str.charAt(0))))
            {
                
                System.out.println("INVALID; Username begins with non-alphabetic character");
                cc++;
                
                
                
            }
            else
            {
                for(int i=0;i<str.length();i++)
                {
                    if(!(Character.isLetter(str.charAt(i)) ||Character.isDigit(str.charAt(i)) ) )
                    {
                        if(!(str.charAt(i)=='_'))
                        {
                            System.out.println("INVALID;"+"'"+str.charAt(i)+"'"+"character not allowed ");
                            cc++;
                        }
    
                        
                    }
                }
            }
            if(cc<1)
        {
            System.out.println("valid");
        }

            
            
            
        }
        
        
    }

}

////////////
import java.util.*;
class palindrome
{
 Scanner sc=new Scanner(System.in);
 String strr;
 String reverse(String str)
 {
 String rev="";
 for(int i=str.length()-1;i>=0;i--)
 {
  rev=rev+str.charAt(i);
 }
 return rev;
 }
 void read()
 {
  strr=sc.nextLine();
  //String rev="";
  String sarr[]=strr.split(" ");
  for(int i=0;i<sarr.length;i++)
  {
   String rev=reverse(sarr[i]);
  
  if(rev.equals(sarr[i]))
   System.out.println("palindrome "+sarr[i]);
  }
 }
}
class paliTest
{
 public static void main(String args[])
 {
  palindrome p=new palindrome();
  p.read();
 }
}
//////////////////
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
import java.util.Scanner;
class Test
{
    int a[],n,pos,insert,i;
    void read()
    {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n<0)
        {
            System.out.println(-1);
            return;
        }
        a=new int[n+1];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
         pos=sc.nextInt();

       // insert=sc.nextInt();
    if(pos<=n)
        {
            insert=sc.nextInt();
            fun();
        }
        else
        System.out.println(-1);
      }
    void fun()
    {
        for(int i=0;i<n;i++)
        {
            if(i==(pos-1))
            {
                for(int j=(n-1);j>=(pos);j--)
        {
            a[j+1]=a[j];
        }
        a[i]=insert;
        
            }
        }
        for(int i=0;i<n+1;i++)
        {
            System.out.println(a[i]);
        }
      // System.out.print(a[i]);
    }
}
class InsertElement
{
    public static void main(String args[])
    {
        Test t=new Test();
        t.read();
        t.fun();
    }
}
