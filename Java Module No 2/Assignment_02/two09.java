package Assignment_02;

import java.util.Scanner;

public class two09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt(), i, s, c = 1;
		int a[] = new int[l];
		for (i = 0; i < l; i++)
			a[i] = sc.nextInt();
		System.out.println("Enter the no you want to search in the array");
		s = sc.nextInt();
		for (i = 0; i < l; i++) {
			if (a[i] == s) {
				System.out.println("The no is present in the array at index" + (i + 1));
				break;
			} else
				c++;

		}

		if (c == l)
			System.out.println("No not present i array");
sc.close();
	}

}
