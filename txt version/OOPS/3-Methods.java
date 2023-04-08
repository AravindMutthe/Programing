/*
# Method describe behavior of an object.
it is a collection of statements that are group together to perform a task.
# Method can be declared in two different ways
  1.Non-static or concrete methods
  2.Static methods
  3.Abstract Methods

# it is important to know the difference between parameter and argument.
  1.Parameter: is VARIABLE defined by a method, 
                that RECEIVES VALUE when the FUN IS CALLED.
                Parameters are always local to the method 
                ex: void sum(int x,int y)
 2.Argument: is a VALUE that is PASSED to a FUN when it is called.
            ex: a.sum(10,10)
*
  
# There are two ways to pass an argument to a method.
  1.call-by-value: In this copy of an argument values is pass to a method wn it is called. 
    Changes made to the argument value inside the method will have no 
     effect on the arguments
    ex: a.sum(10,10)
  2.call-by-reference: In this REFERENCE OF ARGUMENT is pass to a method pa wn it is called. 
       Any changes made inside the method will affect the agrument value.
       java doesnt support call-by-reference
       

*/
import java.util.*;
class Main
{
    void callByValue(int x,double y)     //declared method with Parameters   
    {
        x=100;                                  //method is collection of statements
        y=200.5;
    }
    public static void main(String[] args)
    {
      
        Main t = new Main();    //creating obj to class
        int a=50;
        double b=20.3;
        t.callByValue(a,b);	//calling method by value
        double sum=a+b;
        System.out.println(sum);
    }

}


