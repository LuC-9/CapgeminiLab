package Day1;

public class Demo {

	static int x = 1;
	private int y = 3;
	public void method1(int x)
	{
		Demo t = new Demo();
		this.x = 2;
		y = 4;

		System.out.println("Test.x: " + Demo.x);
		System.out.println("t.x: " + t.x);
		System.out.println("t.y: " + t.y);
		System.out.println("y: " + y);
	}

	public static void main(String args[])
	{
		Demo t = new Demo();
		t.method1(5);
	}

}
