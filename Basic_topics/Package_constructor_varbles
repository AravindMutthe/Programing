package: logically grouping classes 


*	Reason for using package is Class name is not unique across overall java
	Means Date class can be found in
	 java.sql.*
	 java.util.*
	You can write either 
	import java.util.*; or 
	import java.util.Date;.
 
*	Some cases when both imports are present:
	import java.util.*; 
	import java.sql.*; 
	When the class is found in multiple packages, Java gives you the compiler error:

*	at that time
	If you explicitly(individually) import a class name, 
	it takes precedence over any wildcards present. 
		
	example:import java.util.Date; 
			import java.sql.*;





-------------------------------------------------------------------------------------------------------------------
######### CONSTRUCTORS: ##############
		
	* To create an instance of a class,
	* which is a special type of method that creates a new object.
		1. constructor name same as class name
		2. Dosnt have any retur type
	* Purpose of a constructor is to initialize variables, although you can put any code in there,
	   Another way to initialize variables is to do directly when they’re declared
	   
	   public class Chicken 
	   {  
			int numEggs = 0;            // initialize directly  
			String name;  
			public Chicken() 
			{    
				name = "Duke";         // initialize in constructor  
			} 
	   }
	   
	* The constructor runs after all fields and instance initializer blocks have run.
	* Once all the Variables and instance initializers have run, Java returns to the constructor
	

-------------------------------------------------------------------------------------------------------------------
############## Premitive Types & Reference Types ############

	#PRIMITIVE types:
	The number of bits is used by Java when it fi gures out how much memory to reserve for your variable:
	BOOLEAN true or false
	BYTE    8-bits
	SHORT 	2 Bytes
	INT 	4 Bytes
	LONG 	8 Bytes
	FLOAT  	4 Bytes
	DOUBLE  8 Bytes
	CHAR	2 Bytes
	
	#REFERENCE TYPES:
	* A reference type refers to an object(xerox of a class)
	* Unlike primitive types that hold their values in the memory where the variable is allocated
	* a concept referred to as a pointer. Unlike other languages.
	
	*  First, reference types can be assigned null, means they do not currently refer to an object. 
		Primitive types will give you a compiler error if you attempt to assign them null.
	* Next, reference types can be used to call methods when they Hold memory(do not point to null). 
		Primitives do not have methods declared on them.
	
	
	
------------------------------------------------------------------------------------------------------------				
########### Default Initialization Of Variables ############

	* Before you can use a variable, it needs a value.
	* Some types of variables get this value set automatically and others have to specify.
	
	#Local Var:
	* defined within a method.
	* Local variables must be initialized before they use. 
	* They do not have a default value and contain garbage data until initialized
	public int notValid() 
	{
		int y = 10;
		int x; // not initialized
		int reply = x + y; // DOES NOT COMPILE 8:  return reply; 
	} 
	
	#Instance or Class Var:
    * Variables that are not local variables are known as instance or class variables.
	* Instance variables are the nonstatic fields of your class
	* Class variables are the static fields within a class.
	* just know that a variable is a class variable if it has the static keyword in its declaration.
	* class variables are shared across multiple objects.
	* class variables do not require you to initialize them.
	* class var have a default values.
	
	
	char                   null
	boolean=               false
	byte,short,int,long    0
	float,double           0.0
	All obj references     null
