package Assignment_01;

import java.util.Scanner;

public class one14 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int y=sc.nextInt();
	if(y%4==0||y%100==0)
		System.out.println(y+" is a leap year ");
	else
		System.out.println(y+" is a not leap year ");
sc.close();
}
}
