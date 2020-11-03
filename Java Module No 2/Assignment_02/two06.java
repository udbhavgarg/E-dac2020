package Assignment_02;

import java.util.Scanner;

public class two06 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt(),i;
	int a[]=new int[n];
	double avg=0;
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
		avg+=a[i];
	}
	
	System.out.println(avg/n);
sc.close();
}
}
