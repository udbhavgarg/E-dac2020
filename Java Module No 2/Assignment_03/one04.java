package Assignment_03;

import java.util.Scanner;

public class one04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, l, c1=1,c2=1;
		l = sc.nextInt();

		int a[] = new int[l];
		for (i = 0; i < l; i++)
		{
			a[i] = sc.nextInt();
		}
sc.close();
	for(i=0;i<l;i++)
	{
		for(int j=i;j<l-1;j++)
		{
			if(a[i]>=a[j])
				c1++;
			else if(a[i]<=a[j])
				c2++;
		}
	}
	
	if(c1==l||c2==l)
	{
		if(c1>c2)
			System.out.println("Decending ");
		else
			System.out.println("Ascending");
		
	}
	else
		System.out.println("Random");}
	
	}

