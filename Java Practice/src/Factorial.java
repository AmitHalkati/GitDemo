
/*public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*4! = 4*3*2*1 = 24  
		5! = 5*4*3*2*1 = 120  */
		/*int i,fact=1;
		int number =6; //It is the number to calculate factorial    
		
		for(i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+number+" is: "+fact);    
	}

} */

public class Factorial {
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " is " + factorial(num));
    }
}
