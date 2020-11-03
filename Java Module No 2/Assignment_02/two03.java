package Assignment_02;

import java.util.Scanner;

public class two03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i, c = 0, n = sc.nextInt();
		for (i = 1; i < n; i++) {
			if (n % i == 0)
				c++;
		}
		if (c == 1)
			System.out.println(n + " is a prime no");
		else
			System.out.println(n + " is not a prime no");
		sc.close();
	}
}
