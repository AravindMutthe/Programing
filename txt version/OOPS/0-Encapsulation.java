/*Encapsulation simply means binding DM and MF together into a single .
  If you are creating class, you are doing encapsulation.
* main idea behind dis is to hide the implementation details from user.
* Encapsulation is achived by making class data members as private,
  means it can only be accessed within the same class.
1.can't be accessed directly from outside the class.
  You can only set and get values of these variables through the methods of the class.
2.Have getter and setter methods in the class to set and get the values of the fields.
*/
class EncapsulationDemo
{
    private int ssn;
    private String empName;
    private int empAge;

    //Getter and Setter methods
    public int getEmpSSN()
    {
        return ssn;
    }

    public String getEmpName()
    {
        return empName;
    }

    public int getEmpAge()
    {
        return empAge;
    }

    public void setEmpAge(int newValue)
    {
        empAge = newValue;
    }

    public void setEmpName(String newValue)
    {
        empName = newValue;
    }

    public void setEmpSSN(int newValue){
        ssn = newValue;
    }
}
public class Main{
    public static void main(String args[]){
         EncapsulationDemo obj = new EncapsulationDemo();
         obj.setEmpName("Aravind");
         obj.setEmpAge(32);
         obj.setEmpSSN(112233);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee SSN: " + obj.getEmpSSN());
         System.out.println("Employee Age: " + obj.getEmpAge());
    } 
}


