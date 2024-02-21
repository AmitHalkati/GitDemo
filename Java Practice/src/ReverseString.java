
public class ReverseString {

	public static String reverseString(String str){ 
	    StringBuilder sb=new StringBuilder(str);  
	    sb.reverse();  
	    return sb.toString();  
	}  
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ReverseString.reverseString("my name is khan"));  
	    System.out.println(ReverseString.reverseString("I am sonoo jaiswal"));  
	    System.out.println(ReverseString.reverseString("Amit is Learning Selenium"));
	    }  
	}


