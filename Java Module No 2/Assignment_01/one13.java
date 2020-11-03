package Assignment_01;

import java.util.Scanner;

public class one13 {

	static void tera(int a, int b,int c)
	{
		int r=(a>b && a>c) ?a:((b>a&&b>c)?b:c);
		System.out.println("Greatest value is"+r);
	}
	static void ifa(int a ,int b,int c)
	{
		if(a>b&&a>c)
			 System.out.print(" a is greatest ");
		else if(b>a&&b>c)
			System.out.print(" b is greatest ");
		else
			System.out.print(" c is greatest ");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		tera(a,b,c);
		ifa(a,b,c);
		sc.close();
	}

}
