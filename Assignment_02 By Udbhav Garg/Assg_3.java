package Assignment_2;

public class Assg_3 {

	public static void main(String[] args) {
		int i, j;
		for (i = 0; i < 9; i++) {
			for (j = 9 - i; j > 1; j--) {
				System.out.print(" ");
			}

			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}
}
