package Assignment_2;

public class Assg_5 {

	public static void main(String[] agrs) {
		int i, j, k;
		for (i = 9; i >= 1; i--) {
			for (j = 1; j <= 9; j++) {
				if (j < i)
					System.out.print(" ");
				else
					System.out.print(j);
			}

			for (k = 8; k >=i; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
