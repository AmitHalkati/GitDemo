
public class PrintMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int abc[][] = {{243,442,542},{324,41,74},{42,254,922}};		
		int min =abc [0][0];
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(abc[i][j]<min)
				{
					min=abc[i][j];
				}
			}
		}
           System.out.println(min);
	}

}
