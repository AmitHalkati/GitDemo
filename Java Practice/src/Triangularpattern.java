
public class Triangularpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows = 3; // Number of rows in the pattern
        int num = 3;  // Starting number for the pattern
        
        // Loop through each row
        for (int i = 0; i < rows; i++) {
            
            // Print spaces for formatting
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("  "); // Two spaces for formatting
            }
            
            int multiple = num; // Initialize multiple with the starting number
            
            // Print multiples for each row
            for (int k = 0; k <= i; k++) {
                System.out.print(multiple + "   "); // Three spaces for formatting
                multiple += 3; // Increment multiple by 3 for the next number
            }
            
            // Move to the next line for the next row
            System.out.println();
        }
    }

	

}
