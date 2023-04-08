/*
1.LOCAL VAR:
-----------
"These that are declared inside the body of a method"
* WE can use this variables only within that method body.
* Other methods in the class aren't even aware(dntknw) that the variable exists.
* SCOPE IS LIMITED i.e 
	u can’t change their values outside of the memthod
	u can't access them outside of the method.
* We can also use local variables with the same name in different functions.
 persons with same name=behaviour is different.

2.(obj)INSTANCE VARIABLES:
-------------------------
"A variable declared inside the class but a method or constructor or a block"
* These variables are created when an object is created with the help of keyword new and destroyed when the object is destroyed. 
* It is called Obj variable bcz
  its value is Obj specific and is not shared among objects of class.
* Each instance(object) of class has its own copy of instance variables.Unlike        static var
* instance variables have their own separate copy of instance variable.
  We can change the instance variable value using object.

3 (classorglobal) STATIC VARIABLES:
------------------------------------

"declared out side of any method, it can not be locacl"
class contains two types of varbles
 class var: can access all objects of that class
 obj var:can access only that obj of class



*/
