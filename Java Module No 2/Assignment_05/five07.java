package Assignment_05;

import java.util.Scanner;

public class five07 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine(),s1="";
	
		int i;
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=97&&s.charAt(i)<=122)
			{
				s1=s1+(char)(s.charAt(i)-32);
			}
			else if(s.charAt(i)>=65&&s.charAt(i)<=90)
			{
				s1=s1+(char)(s.charAt(i)+32);
			}
			else
				s1=s1+s.charAt(i);
			
		}
		System.out.println(s1);
sc.close();
	}

}
