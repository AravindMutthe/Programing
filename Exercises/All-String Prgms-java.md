/*Write a java program to sort the strings in lexographical order
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
/* Write a java program to find longest word in a sentence
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
// write a java program to read n strings from keyboard and then print the srings wch begins with the particular character


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
}
/* Write a java program to remove all the digits and special characters from the
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
}

////////////
import java.util.*;
class test
{
	Scanner sc = new Scanner(System.in);
	String str;
	int flag=0,i,j;
	void read()
	{
		str=sc.next();
		
	}
	void display()
	{
	char s[]=str.toCharArray();
	   for(i=0;i<s.length-1;i++)
     {
		for(j=i+1;j<s.length;j++)
		{
		  if(s[i]==s[j])
		  {
			  flag=1;
			
		  }	  
		}	
	 }
	 if (flag==1)
	 {
		 System.out.println("not unique");
	 }
	 else
	 {
		 System.out.println("unique");
	 }
}
}
class unique
{
	public static void main(String args[])
	{
		test t = new test();
		t.read();
		t.display();
	}
}
	
	//////////////////
	//read a secntence and try to print words stating with vowel along with its length
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
	
	/*Write a java program to sort the strings in lexographical order
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
