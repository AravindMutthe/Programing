/*
CONSTRUCTOR:
* constructor is a special member fun.
   which will be called automatically whenever object is created.
* Constructors are mainly create for initializing the object.
* Initialization is a process of assigning user defined values
          at the time of allocation of memory space.
1.A constructor eliminates placing the default values.
2.A constructor eliminates calling the normal or ordinary method implicitly.
----------------------------------------------------------------------
* Constructors will not be inherited from one class to another class
* Constructor definitions should not be static. 
  Because constructors will be called each and every time, 
   whenever an object is creating.
*/
class rectangle
{
	rectangle (int x,int y)
	{
		int area=x*y;
		System.out.println(area);
		
	}	
}
class Main
{
	public static void main(String args[])
	{
	    
		rectangle var1=new rectangle(2,4);        
		rectangle var2=new rectangle(5,6); 
		rectangle var3=new rectangle(7,8);                       //create no of objects from class
               /*                  //initailizing values to variables
		System.out.println("Area 1 is:"+area1);
		System.out.println("Area 2 is:"+area2);
		System.out.println("Area 3 is:"+area3);
		*/
	}
}




