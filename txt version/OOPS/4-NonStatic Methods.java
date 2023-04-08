/******************************************************************************
# Method can be declared in two different ways
1.Static methods: 
  executes only once in the program.
2.NON Static methods: 
  If any method wants to be execute multiple time that can be declare as non static.
------------------------------------------------------------------------------------------------------------------
# Non-Static Methods                                  Static Methods
 --------------------------------------------------------------------------------------------------------------------
1.Memory is allocated multiple            1. Memory is allocated only once at the time of class loading.
 times whenever method is calling.
2.These are specific to a classes
(object)                                  2.These are common to every class (obj).
 known as instance method.                   known as member method or class method.
3.access with object reference            3. object is not required to call static method 

                                          4. Access with both class and obj reference. 
                                             Objref.methodname();                
                                             className.methodname(); obj.methodname();
                                          
---------------------------------------------------------------------------------------------------------------------

* Static method belong to class and not to class obj.
* Static methods are No need to creation and initialization of an Object 
* static method can not use non static variables and
                        call non-static method directly.
* Usually, static methods are utility methods(ex:java.util.package)
  that we want to expose to be used by other classes without the need of creating an instance
# Static block is a set of statements, which will be executed by the JVM before execution of main method.
  In a class we can take any number of static block but all these blocks will be execute from top to bottom

*******************************************************************************/
import java.util.*;
class StaticDemo
{
        int count=0;
        static int counter; 
        static
        {
                counter++;
                System.out.println("Sblok=="+counter);
        }
        void NSmethod()
        {
            count++;
            System.out.println("NSmethod="+count);
        }
        static void Smethod()
        {
                counter++;
                System.out.println("Smethod="+counter);
        }
}
class Main
{
        public static void main (String[] args) 
        {
         StaticDemo.counter=0;    //initialize static var before calling sta method.
         StaticDemo.Smethod();    //no need to create and initialize of an obj for static method
         StaticDemo.Smethod();    //directly can access with class name.
         StaticDemo.Smethod();
         StaticDemo st1=new StaticDemo();
         StaticDemo st2=new StaticDemo();
         StaticDemo st3=new StaticDemo();
         st1.NSmethod();
         st2.NSmethod();
         st3.NSmethod();
        }
}
