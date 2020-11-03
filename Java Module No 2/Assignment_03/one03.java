package Assignment_03;

import java.util.Scanner;

public class one03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt(),i;
		int a[]=new int[l];
		for(i=0;i<l;i++)
		{
			if(i%10==0)
				a[i]=i*i;
			else
				a[i]=i*i*i;
			
		}
		for(i=0;i<l;i++)
			System.out.print(a[i]+"  ");
		sc.close();
	}
}