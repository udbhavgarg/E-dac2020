package Assignment_02;

import java.util.Scanner;

public class two05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i, j, c = 0, n = sc.nextInt(), o = sc.nextInt();
		for (i = n; i <= o; i++) {
			c = 0;
			for (j = 1; j < i; j++) {
				if (i % j == 0)
					c++;
			}
			if (c == 1)
				System.out.println(i + " is a prime no");
			else
				System.out.println(i + " is a not prime no");
		}
		sc.close();
	}
}
