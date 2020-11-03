package Assignment_01;

import java.util.Scanner;

public class one09 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int g=sc.nextInt(),y,m,w;
	y=g/365;
	g=g%365;
	m=g/30;
	g=g%30;
	w=g/7;
	g=g%7;
	System.out.println("Year ="+y);
	System.out.println("Month ="+m);
	System.out.println("Week ="+w);
	System.out.println("Days ="+g);
sc.close();
}
}
