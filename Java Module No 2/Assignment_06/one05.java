package Assignment_06;
import java.util.*;
class Employee 
{
	int empNo;
	double salary;
	double totalSalary;
	public Employee(double salary) 
	{
		this.salary = salary;
		empNo++;
		totalSalary=12*salary;
	}
	void display()
	{
		System.out.println("EMPLOYEE : "+empNo);
		System.out.println("EMPLOYEE TOTAL SALARY : "+totalSalary);
	}
	
}
/*
 * 5.	Create a class Employee with three data members (empNo, salary and totalSalary)
 *  	and following features.
 *	a.	Only parameterized constructor. [Do not overload the constructor]
 *	b.	totalSalary always represents salary total of all the employees created.
 *	c.	empNo should be auto incremented.
 *	d.	display total employees and totalSalary using a method.
 *		
 *		Create another class EmployeeDemo (main class) that creates some 
 *		Employee objects and calls Employee method to display no. of employees 
 *		and total of their salaries.
 */


public class one05 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Employee[] e = new Employee[5];
		for(int i = 0 ; i < 5 ; i++)
		{
			
			e[i] = new Employee(sc.nextDouble());
			e[i].display();
		}
		sc.close();
	}
}