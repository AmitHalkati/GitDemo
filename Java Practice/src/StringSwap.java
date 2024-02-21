
public class StringSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Take 2 string need to swap
		String s1 ="Amit";
		String s2 ="Halkati";
		
		//Combine both string using concatenation + operator
		
		s1=s1+s2;
		
		//use the substring method to get the subset of combined string
		s2=s1.substring(0,s1.length() - s2.length());
		s1=s1.substring(s2.length());
		
		System.out.println("s1=" +s1);
		System.out.println("s2=" +s2);


	}

}
