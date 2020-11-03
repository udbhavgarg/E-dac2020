package Assignment_02;

import java.util.Scanner;

public class two01 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int i,n=sc.nextInt();
	for(i=1;i<=n;i++)
	{
		System.out.print(i*n);
	}
	sc.close();
}
}
