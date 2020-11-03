package Assignment_02;

import java.util.Scanner;

public class two02 {
public static void main(String[] args) {
	

	Scanner sc = new Scanner(System.in);
	int i,n,n1=0,c=0;
	n=sc.nextInt();
	for(i=n;i>0;i=i/10)
	{
		n1=(n1*(10^c)+(i%10));
	}
	System.out.println(n1);
}}
