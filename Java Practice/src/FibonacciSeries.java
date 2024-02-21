
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
		
		//Display Fibonacci Series Using for Loop
		
		int n=10;
		int firstTerm = 0;
		int secondTerm = 1;
		
		System.out.println("Fibonacci Series till "+n+" terms:");
		
		for(int i=1;i<=n;i++)
		{
			 System.out.print(firstTerm + ", ");
			// compute the next term
			 
			 int nextTerm = firstTerm + secondTerm;
			 firstTerm=secondTerm;
			 secondTerm = nextTerm;
			 
			 
		}
		
 //Display Fibonacci series using while loop
		
		
		{

		    int i = 1, t = 10, firstTerm1 = 0, secondTerm2 = 1;
		    System.out.println("Fibonacci Series till " + n + " terms:");

		    while (i <= n) {
		      System.out.print(firstTerm + ", ");

		      int nextTerm = firstTerm1 + secondTerm2;
		      firstTerm1 = secondTerm2;
		      secondTerm2 = nextTerm;

		      i++;
		    }
		  }
	}

}
