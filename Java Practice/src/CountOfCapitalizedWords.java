
public class CountOfCapitalizedWords {
	
		public static int getCapsWordsInString(String inputString) {
			int counter =0;			
			for(int i=0;i<inputString.length();i++)
			{
				if(inputString.charAt(i)>='A' && inputString.charAt(i)<='Z') {
					counter++;					
				}
			}
			
			return counter;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			System.out.println(getCapsWordsInString("AmitHalkatiLearning"));
	}

}
