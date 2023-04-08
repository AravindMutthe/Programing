import java.util.*;
class VarTypes 
{
   int a=50;//instance variable
   int b=10;  
   static int x=10;
   static int y=10 //static variable  
   int method(int a,b)
   {  
   int n=10;
   int m=10; //local variable
   return (n*m)+(a+b);   
   }  
   public static void main(String args[])
      {
        VarTypes obj=new VarTypes();
      VarTypes obj2 = new VarTypes(); //creating OBJ to class

      int sum1=obj.a+obj.b;           //accessing instatnce var with obj   
      System.out.println(sum1);

      obj2.a=100;             //reinitializing  val to instance var with objs
      obj2.b=200;
      int sum2=obj2.a+obj2.b;       //accessing instatnce reinialized var with obj
      System.out.println(sum2);

      int mul=obj.method(5,5);          //accesing local var with obj
      System.out.println(mul);  

      System.out.println("before x="+VarTypes.x); // accesing static var with classname
      System.out.println("before y="+obj.y);      // accesing static var with obj
      obj2.x=50; 
      obj2.y=50;                    //reintializing static var with oj
      System.out.println("after x ="+VarTypes.x);
      System.out.println("after y ="+obj2.y);
      int sub=obj.x-obj.y+obj2.x-obj.y; //accesing static var with all objs of class
        System.out.println("sub= "+sub);
   }
}