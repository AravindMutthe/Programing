/*
METHOD OVERLOADING:
"if a class have more then one-method with same name with different parameter lists"
 overloading always Occurs in Same Class.Unlike Overriding.
* its similar to constructor overloading.
*its an example of Static Polymorphisam.
* Three ways to overload a method.
1.Number of parameters.
2.Different Data type of parameters.
3.Sequence of Data type of parameters.
* Private, static and final methods can be overloaded
* Overloading can be done at both static and non-static methods.
* For overloading methods return type may or may not be same.

Note:In overloading we have to check only methods names (must be same)
 and arguments types (must be different) except these the remaining dnt need check.

*/

import java.util.*;
class TEST
{

        void cal(int a,double b)
        {
                double sum=a+b;
                System.out.println(sum);
        }
        void cal(int a,int b)
        {
                int mul=a*b;
                System.out.println(mul);
        }
}
class Main
{
        public static void main (String[] args) {
                TEST t=new TEST();
                t.cal(2,5.9);
                t.cal(2,3);
        }
}


