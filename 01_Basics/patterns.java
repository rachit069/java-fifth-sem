
class pattern1
{
	public static void main(String args[])
	{
		int n = 5;
		int l = n;
		int k = 1; 
		
		for(int i = 0;i<n;i++)
		{
			for(int j = n-i ;j>0;j--)
			{
				System.out.print(" ");
			}

			for(j = 0;j<=n;j++)
			{
				
			l--;
			System.out.println("*");

		}
	}
}
				