/*
2.Abstract class:(Abstract keyword)::
* which is contains some defined and some undefined(Abstract) method.
* Abstract classes cantains only abstract non static methods(obj), 
  but not contains abstract static methods(class).
* every abstract method is instance but not static.
=> contains common requirements or features.
=> Every AC participates in inheritance.
=> All the ABSTRACT CLASSES of Java makes use of PLOYMORPHISM 
   along with METHODOVERRIDDING for business logic development and
   makes use of dynamic binding for execution logic.
--------------------------------------------------------------------------------------------------------     
Abstract Method: which contains only declaration  but
  it never contains body or definition.
Obj creation:it created indirectly.
  It means you can create an OBJ OF ABSTRACT DERRIVED CLASS
 ex: parentclass pc=new derivedclass();

*/
import java.util.*;
abstract class Main
{
       public  abstract int sum(int a,double b);
       public  abstract int mul(int x,int y);
        public abstract int mod(int p,int q);
}
class First extends Main
{
       public double sum(int a,double b)
       {
               return a+b;
       }
       public int mul(int x,int y)
       {
               return x*y;
       }
      public  int mod(int p,int q);
       {
               return p%q;
       }
       public static void main (String[] args) 
       {
       First op=new Main();
       op.sum(2,3.5);
       op.mul(3,5);
       op.mod(5,10);
       }
}







import java.util.Scanner;
abstract class Shapes
{
  public abstract double getArea();
}
class Rectangle extends Shapes
{
    double l,w;
    Rectangle(double l,double w)
    {
      this.l=l;
      this.w=w;
    }
    double getArea()
    {
      return l*w;
    }
}
class Square extends Shapes
{
  double side;
  Square(double side)
  {
    this.side=side;
  }
  double getArea()
  {
    return side*side;
  }
}
class Circle extends Shapes
{
  double pi,r;
  Circle(double pi,double r)
  {
    this.pi=pi;
    this.r=r;
  }
  double getArea()
  {
    return pi*r*r;
  }
}
class Test
{
  public static void main(String args[])
  {
    Shapes r=new Rectangle(5.5,5.5);
    Shapes s=new Square(5.5);
    Shapes c=new Circle(3.14,10);
    double a=r.getArea();
    double b=s.getArea();
    double d=c.getArea();
    if(a>b&&a>d)
    {
      System.out.println("Rectangle is largest "+ a);
    }
    else if(b>a&&b>d)
    {
      System.out.println("Square is largest "+ b);
    }
    else if(d>a&&d>b)
    {
      System.out.println("Circle is largest "+d);
    } 
  }
}