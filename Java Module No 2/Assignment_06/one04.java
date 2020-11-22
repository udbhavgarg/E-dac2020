package Assignment_06;

public class one04 
{
	void multiply(int a, int b)
	{
		System.out.println(a*b);
	}
	void multiply(float a, float b, float c)
	{
		this.multiply(5, 6);
		System.out.println(a*b*c);
	}
	void multiply(int a[])
	{
		this.multiply(3.0f, 4.0f, 5.0f);
		int mul=1;
		for(int i=0;i<a.length;i++)
		{
			mul=mul*a[i];
		}
		System.out.println(mul);
	}
	void multiply(Double a, int b)
	{
		int[] c= {1,2,3};
		this.multiply(c);
		System.out.println(a*b);
	}
	public static void main(String[] args) 
	{
		one04 m = new one04();
		m.multiply(2.0, 3);
	}
}