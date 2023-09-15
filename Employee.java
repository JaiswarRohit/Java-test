package Demo;
class Employee
{
    // static variable salary 
    public static double salary;
    public static String name = "Harsh";
}
public class StaticVariableExample
{
    public static void main (String[]args)
    {
        // accessing static variable without object 
        Employee.salary = 1000;
        System.out.println (Employee.name + "'s average salary:" + Employee.salary);
  }
}