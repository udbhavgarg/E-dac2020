package Assignment_03;

import java.util.*;

public class one02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, l, c;
		l = sc.nextInt();

		int a[] = new int[l];
		for (i = 0; i < l; i++) {
			a[i] = sc.nextInt();
		}
		c = l / 3;
		if (c > 0) {
			int avg[] = new int[c * 3];

			for (i = 0; i < (c * 3); i++) {
				if ((i + 3) > l)
					break;
				else
					avg[i] = (a[i] + a[i + 1] + a[i + 2]) / 3;

			}
			for (i = 0; i < c * 3; i++)
				System.out.print(avg[i] + " ");
		} else
			System.out.println(0);
		sc.close();
	}
}
