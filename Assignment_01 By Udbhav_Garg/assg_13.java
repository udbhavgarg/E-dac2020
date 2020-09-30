
import java.util.Scanner;

public class assg_13 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double l, b,area,para;
	l = sc.nextDouble();
	b = sc.nextDouble();
	area=l*b;
	para=2*(l+b);
	System.out.println(para);
	System.out.println(area);
	sc.close();

}
}
