
/*
Write a Java program to find sum of the digits of a number
note : Enter number > 0
sample

1. input = 1234
    output = 10

2. input = 56
    output = 11

*/
import java.util.*;
class Sum_of_Digits
{
    int r,sum=0;
    void calculate(int n)
    {
        while(n>=1)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println(sum);
    }
}
class Test
{
    public static void main(String args[])
    {
        Sum_of_Digits sd=new Sum_of_Digits();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        sd.calculate(n);
    }
}

/* Write a Java program to check whether the entered number is perfect number or not

sample

1. input = 28
    output = perfect number

2. input = 100
    output = not perfect number
*/
import java.util.*;
class PerfectNumber
{
    int sum=0;
    int calculate(int n)
    {
      for(int i=1;i<n;i++)
      if(n%i==0)
      sum=sum+i;
      return sum;
    }
}

class Test
{
    public static void main(String args[])
    {
       PerfectNumber p=new PerfectNumber();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp=p.calculate(n);
        if(temp==n)
        System.out.println("perfect number");
        else
        System.out.println("not perfect number");
    }
}

/*Write a Java program to find Gcd of two numbers using recursion
sample
input =
3
17
output =
1
*/
import java.util.*;
class Gcd
{
    int process(int a,int b,int r)
    {
        if(b==0)
        return a;
        else
        {
            r=a%b;
            a=b;
            b=r;
            return(process(a,b,r));
        }
    }
}
class Test
{
    public static void main(String args[])
    {
        int a,b,r=0,res;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        Gcd g=new Gcd();
        res=g.process(a,b,r);
        System.out.println(res);
    }
}
