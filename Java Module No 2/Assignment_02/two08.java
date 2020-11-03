package Assignment_02;

import java.util.Scanner;

public class two08 {
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int i,n,n1=0,c=0,j;
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(j=0;j<a.length;j++) 
		{n1=0;
		for(i=a[j];i>0;i=i/10)
		{
			n1=(n1*(10^c)+(i%10));
		}
		System.out.println(n1+"  ");
	}}

}
