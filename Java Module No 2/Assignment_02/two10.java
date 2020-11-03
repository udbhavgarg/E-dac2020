package Assignment_02;

import java.util.Scanner;

public class two10 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int i,odavg=0,evavg=0,oc=0,ec=0,l=sc.nextInt();
	int a[]=new int[l];
	for(i=0;i<l;i++)
	{a[i]=sc.nextInt();
	if(i%2==0)
	{
	ec++;
	evavg=evavg+a[i];
	}
	else
	{
		oc++;
		odavg=odavg+a[i];
	}
	}
	System.out.println("Even index's average "+(evavg/ec));
	System.out.println("Odd index's average "+(odavg/oc));
	sc.close();
}
}
