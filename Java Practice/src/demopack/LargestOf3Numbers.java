package demopack;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a= 800, b=600, c=100;
		
		if(a>b && a>c)
		{			
			System.out.println("a is Largest Number:" + a);
		}
		else if (b>a && b>c)
		{
			System.out.println("b is Largest Number:" + b);
		}
		else			
		{
			System.out.println("c is Largest Number:" + c);
		}
	}

}
