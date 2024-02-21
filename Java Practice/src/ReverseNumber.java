
public class ReverseNumber {

	
	public static int reverse(int num) {
		
		int reversedNum = 0;
		/*Logic 
		First, we find the remainder of the given number by using the modulo (%) operator.
		Multiply the variable reverse by 10 and add the remainder into it.
		Divide the number by 10.*/
		while(num !=0) {
			int digit = num % 10;
			reversedNum = reversedNum * 10 + digit;
			num /=10;
			
		}
		return reversedNum;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 12345;
        System.out.println("Reverse of " + num + " is " + reverse(num));
	}

}


/* Using while Loop
 * 
 * public class ReverseNumberExample1   
{  
public static void main(String[] args)   
{  
int number = 987654, reverse = 0;  
while(number != 0)   
{  
int remainder = number % 10;  
reverse = reverse * 10 + remainder;  
number = number/10;  
}  
System.out.println("The reverse of the given number is: " + reverse);  
}  
}  */
