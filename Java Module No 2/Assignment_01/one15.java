package Assignment_01;

import java.util.Scanner;

public class one15 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	char c=sc.next().charAt(0);
	int age=sc.nextInt();
	switch(c)
	{
	case 'M': 
		if(age>21)
		System.out.print("This male is eligible of marraige");
		else
			System.out.print("This male is not eligible of marraige");
		break;
	case 'm': 
		if(age>21)
		System.out.print("This male is eligible of marraige");
		else
			System.out.print("This male is not eligible of marraige");
		break;
	case 'f': 
		if(age>18)
		System.out.print("This female is eligible of marraige");
		else
			System.out.print("This female is not eligible of marraige");
		break;
	case 'F': 
		if(age>18)
		System.out.print("This female is eligible of marraige");
		else
			System.out.print("This female is not eligible of marraige");
		break;

		default:System.out.println("Invalid Input");
	}
	sc.close();
}
}
