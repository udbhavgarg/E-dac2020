package Assignment_02;

import java.util.Scanner;

public class two04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), s = 0, i;
		for (i = 1; i <= n; i++) {
			s += (n * 10) + 2;
		}
		System.out.println("Sum = " + s);
		sc.close();
	}
}
