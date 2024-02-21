
public class PrimeNumber {
	//Prime Number Program using Method in Java
	static void checkPrime(int n){  
		
		 int i,m=0,flag=0;  
		 m=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(n+" is prime number"); }  
		  }//end of else  
		  
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		  checkPrime(0);  
		  checkPrime(1);  
		  checkPrime(2);  
		  checkPrime(3);  
		}

}



/*The checkPrime method takes an integer n as input and checks whether it is a prime number or not.
Inside the checkPrime method:
It initializes variables i, m, and flag.
It calculates m as half of n.
It checks if n is equal to 0 or 1, in which case it prints that the number is not prime.
Otherwise, it iterates from 2 to m to check for factors of n.
If any factor is found, it sets the flag to 1 and breaks out of the loop.
If no factor is found (flag remains 0), it prints that the number is prime.
In the main method:
It calls the checkPrime method with different integer arguments to test prime numbers.*/