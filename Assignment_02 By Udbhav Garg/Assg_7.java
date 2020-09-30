package Assignment_2;

public class Assg_7 {

	public static void main(String[] args) {
		int i, j;
		for (i = 9; i > 0; i--) {
			for (j = 9 ; j > i; j--) {
				System.out.print(" ");
			}

			for (j = 0; j <i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
			
		}
	}
}
