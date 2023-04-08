/*
*int is a perdifind datatype. 
  once int datatype hasbeen defined we can create var of that type using declarations.
*once class datatype hasbeen defined we can create object of that type using declarations.
  class is a user defined datatype with template that serve to define its properties.
--------------------------------------------------------------------------------------------------
*Two types of classes are there in java.

1.Concrete class:(normal class) 
 which is containing fully implemented methods.
 these classes are used for specific requirement, but not for common requirement.
* If we use concrete classes for  fulfill common requirements 
 then such application will get the following limitations.
  1.app will take more amount of memory.
  2.Excecution time is more & performance is decreced.
*Obj creation: classname c=new classname();
To overcome above limitation you can use abstract class.

2.Abstract class (AC):(Abstract keyword)::
* which is containing some implented methods and some un-Implemented(abstract) methods.
* AC cantains only non static methods(obj),
   but not contains static methods(class).
  every abstract method is obj but not static.
=> cantains common requirements or features.
=> Every abstract class participates in inheritance.
=> All the abstract classes of Java makes use of polymorphism along with method overriding for business 
   logic development and makes use of dynamic binding for execution logic.
--------------------------------------------------------------------------------------------------------     
Abstract Method: which contains only declaration or prototype but,
 it never contains body or definition.
Obj creation:it created indirectly.It means u can create an obj of abstract derived class
#####ex: parentclass pc=new derivedclass();#######
 
Class=methods+variables or objects
object=memoryspace(var+methods)
Ex of concrete class
*/
class Rectangle
{
	int length;
	int width;
	void setArea(int x,int y)
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
class Main
{
	public static void main(String args[])
	{
	    
		Rectangle var1=new Rectangle();        
		Rectangle var2=new Rectangle(); 
		Rectangle var3=new Rectangle();                       //creating objects of class
		int area1,area2,area3;
	        var1.length=19;
		var1.width=20;                                         // accesing instance variables
		var2.setArea(12,14);var2.getArea();
		var3.setArea(15,18);var3.getArea();                       //accesing methods

		area1=var1.length* var1.width;                          
		area2=var2.getArea();
		area3=var3.getArea();                                   //initailizing values to variables
		System.out.println("Area 1 is:"+area1);
		System.out.println("Area 2 is:"+area2);
		System.out.println("Area 3 is:"+area3);
	}
}
