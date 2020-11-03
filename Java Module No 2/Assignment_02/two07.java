package Assignment_02;

import java.util.Scanner;

public class two07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, l = sc.nextInt();
		int a[] = new int[l];
		for (i = 0; i < l; i++)
			a[i] = sc.nextInt();
		for (i = 0; i < l - 1; i++) {
			for (j = i; j < l; j++) {
				if (a[i] < a[j]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}

		for (i = 0; i < l; i++) {
			System.out.print(a[i] + " ");

		}
	}
}
