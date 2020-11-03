package Assignment_01;

import java.util.Scanner;

public class one10 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double g=sc.nextDouble(),c;
	c= 5*(g-32)/9; 
	System.out.println("Given Temeprature in fahrenheit"+g);
	System.out.println("Given Temepraturein Celsius"+c);
sc.close();
}
}
