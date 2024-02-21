
public class SecondLargestElementOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,3,1,6,9,9,14};
		int temp;
		
		for(int i=0;i<0;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]= temp;						
				}
					
			}
		}

		for(int i=arr.length-2;i>=0;i--) {
			
			if(arr[i]!=arr.length-1) {
				
				System.out.println("The Second Largest Element " +arr[i]);
				break;
			}
		}
	}

}
