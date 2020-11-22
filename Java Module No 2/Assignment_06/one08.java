package Assignment_06;
import java.util.*;
class Faculty 
{
	Scanner sc = new Scanner(System.in);
	int facultyid;
	double salary;
	
	void input()
	{
		System.out.println("Faculty id : ");
		facultyid=sc.nextInt();
	}
	
	void anotherFun()
	{
		System.out.println("SALARY IS : "+salary);
	}
	
}
class FullTimeFaculty extends Faculty
{
	double basicSalary;
	double allowance;
	Scanner sc = new Scanner(System.in);
	void input()
	{
		super.input();
		System.out.println("BASIC SALARY IS : ");
		basicSalary = sc.nextDouble();
		System.out.println("ALLOWANCE IS : ");
		allowance = sc.nextDouble();
		salary = basicSalary + allowance; 
		//System.out.println("SALARY OF FULL TIME FACULTY IS : "+salary );
		anotherFun();
	}
}
class PartTimeFaculty extends Faculty
{
	int workingHours;
	int ratePerHour;
	Scanner sc = new Scanner(System.in);
	void input()
	{
		super.input();
		System.out.println("WORKING HOURS IS : ");
		workingHours = sc.nextInt();
		System.out.println("RATE PER HOURS IS : ");
		ratePerHour = sc.nextInt();
		salary = workingHours * ratePerHour;
		//System.out.println("SALARY OF PART TIME FACULTY IS : "+salary );
		anotherFun();
	}
}
public class one08 {

	public static void main(String[] args) 
	{
		FullTimeFaculty ft = new FullTimeFaculty();
		PartTimeFaculty pt = new PartTimeFaculty();
		ft.input();
		pt.input();
	}
}
