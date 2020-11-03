package Assignment_01;

import java.util.Scanner;

public class one12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double b=sc.nextDouble(),h=0,d=0,g;
		if(b<10000)
		{
			h=b*(.1);
			d=b*(.90);
			g=h+d+b;
		}
		else
		{	h=2000;
		d=b*(.98);
		g=h+b+d;
		}
		System.out.println("Base Salary is"+b);
		System.out.println("HRA  is"+h);
		System.out.println("DA is"+d);
		System.out.println("Gross Salary is"+g);
		sc.close();
	}

}
