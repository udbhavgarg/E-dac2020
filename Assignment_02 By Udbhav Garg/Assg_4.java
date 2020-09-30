package Assignment_2;

public class Assg_4 {

	public static void main(String[] agrs) {
		int i, j, k, c = 0;
		for (i = 9; i >= 1; i--) {
			c = 1;
			for (j = 1; j <= 9; j++) {
				if (j < i)
					System.out.print(" ");
				else
					System.out.print(c++);
			}
			c = 1;
			for (k =9; k >i; k--) {
				System.out.print((k-i));
			}
			System.out.println();
		}
	}

}
