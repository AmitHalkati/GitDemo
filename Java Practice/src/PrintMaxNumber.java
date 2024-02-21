
public class PrintMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int abc[][] = {{2,4,5},{3,4,7},{4,2,9}};		
		//int min =abc [0][0];
		//int max = Integer.MIN_VALUE;
		int max = abc [0][0];
		int mincoloumn = 0;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(abc[i][j]>max)
				{
					max=abc[i][j];
					mincoloumn=j;
				}
			}
		}
		//Printing min and max
           System.out.println(max);
           System.out.println(mincoloumn);
	}


	}

