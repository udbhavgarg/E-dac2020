
package Assignment_05;
import java.util.*;

public class five03 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s1="";
		char a[]= s.toCharArray();
		int i,j=0;
		int size = s.length();
		for(i=0;i<size-1;i++)
		{
		if(a[i]==a[i+1])
		{
			a[i]=' ';
		
		}
		}
		for(i=0;i<size;i++)
		{
			if(a[i]!=' ')
			{
				s1=s1+a[i];
			}
		}
		System.out.println(s1);
		}

}
