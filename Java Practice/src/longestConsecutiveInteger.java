
public class longestConsecutiveInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		//As you can see the longest consecutive occurrence of integers are 6,7,8,9.
		int[] arr = {4,3,25,6,7,8,9,2,3,10,3,14,15,16};		
		int count = 0;
		int max = 0;
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]+1 == arr[i+1]) {				
				count++;
			}
			else 
			{
				count=0;
			}
// We use the Math.max() to obtain the maximum value between the max and the counter variable
		max=Math.max(max, count+1);		
		} 	
		System.out.println("Longest consecutive sequence length: " + max);
}
}
