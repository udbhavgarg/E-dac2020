package Assignment_05;

import java.util.Scanner;

public class five06 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int c=0;
	if(s.length()%3==0)
	{ int k=s.length()/3;
		String s1=s.substring(0,k);
		for(int i=0;i<s.length();i=i+k)
		{
			if(s1.equalsIgnoreCase(s.substring(i, i+k)))
			{
				c++;
			}
		}
		System.out.println("No of times is repeating "+c);
	}
	else
		System.out.println("Fales");
}
}
