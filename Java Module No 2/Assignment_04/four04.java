package Assignment_04;
import java.util.Scanner;

class Employee
{
int empid;
String name;
String designation;

public void getDetail() 
{
  Scanner sc = new Scanner(System.in);
 System.out.print("Enter the Employee ID :: ");
 empid = sc.nextInt();
 sc.nextLine();
 System.out.print("Enter the Employee Name :: ");
 name = sc.nextLine();
 System.out.print("Enter the Designation :: ");
 designation = sc.nextLine(); 
}

public void display()
{
   System.out.println("Employee id = " + empid);
 System.out.println("Employee name = " + name);
 System.out.println("Employee salary = " +designation);
}

 }
class four04{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);	 
 System.out.println("Enter the value for number of Employee that you want:");
 int n=sc.nextInt();
 
 
 Employee e[] = new Employee[n];
 for(int i=0; i<n; i++) 
 {
     e[i] = new Employee();
     e[i].getDetail();
 }
   System.out.println("");
   for(int i=0; i<n; i++)
   {
     e[i].display();
  }
  System.out.println("Manager's detail are as follows:");
   for(int i=0; i<n; i++)
   {
   	String input = "manager";
    if (e[i].designation==input)
    {
   	 System.out.println(e[i]);
    }
  }
   sc.close();
}
}
