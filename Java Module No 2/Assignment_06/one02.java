package Assignment_06;
import java.util.*;
class Circle 
{
	int radius;
	double area;
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius");
		radius = sc.nextInt();
		sc.close();
	}
	void calculateArea()
	{
		area = 3.14 * radius * radius;
	}
	void display()
	{
		System.out.println("Radius is : "+radius);
		System.out.println("Area is : "+area);
	}
}
public class one02 {

	public static void main(String[] args) 
	{
		Circle c = new Circle();
		c.calculateArea();
		c.display();
	}

}
