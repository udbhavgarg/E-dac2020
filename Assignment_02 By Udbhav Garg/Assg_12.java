package Assignment_2;

public class Assg_12 {

	public static void main(String[] args) {
		int i, j;
		for (i = 6; i > 0; i--) {
			for (j = 6 ; j > i; j--) {
				System.out.print(" ");
			}

			for (j = 0; j <i; j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}
}
