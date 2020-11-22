package Assignment_06;
import java.util.*;
class OneBHK 
{
	double roomArea;
	double hallArea;
	double price;
	public OneBHK() 
	{
		
	}
	OneBHK(double roomArea, double hallArea, double price)
	{
		this.roomArea = roomArea;
		this.hallArea = hallArea;
		this.price = price;
	}
	void show()
	{
		System.out.println(roomArea);
		System.out.println(hallArea);
		System.out.println(price);
	}
}
class TwoBHK extends OneBHK
{
	double room2Area;
	TwoBHK()
	{
		
	}
	TwoBHK(double roomArea, double hallArea, double price, double room2Area)
	{
		super(roomArea, hallArea, price);
		this.roomArea = roomArea;
		this.hallArea = hallArea;
		this.price = price;
		this.room2Area = room2Area;
	}
	void show()
	{
		//super.show();
		System.out.println(roomArea);
		System.out.println(hallArea);
		System.out.println(price);
		System.out.println(room2Area);
	}
}
public class one07 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		TwoBHK[] t = new TwoBHK[3];
		double total=0;
		for(int i=0; i<3; i++)
		{
			
			System.out.println("room area : ");
			double roomArea=sc.nextDouble();
			System.out.println("hall area : ");
			double hallArea=sc.nextDouble();
			System.out.println("price : ");
			double price=sc.nextDouble();
			System.out.println("room 2 area : ");
			double room2Area=sc.nextDouble();
			t[i] = new TwoBHK(roomArea, hallArea, price, room2Area);
			t[i].show();
			total = total+t[i].price;
		}
		System.out.println(total);
		sc.close();
	}
}