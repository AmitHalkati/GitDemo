import java.util.Arrays;

public class FindSmallestNumberandremoveDollar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String price ="$200.98";
		String price1 = price.replace("$",""); // remove the dollar sign
		
		System.out.println(Double.parseDouble(price1));//Convert to number
		
		//Find smallest number in array
		int a[]= {500,400,100,200,900,300,600,};
		
		Arrays.sort(a);
		
		System.out.println("Smallest Number: " +a[0]);
		System.out.println("Largest Number: " +a[6]);
		System.out.println("$" +a[0]);

	}

}
