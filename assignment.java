import java.util.*
import java.lang.*

class assignment
{
	public static void main(String arg[])
	{
		int n = 5;
		int k = n;
		for(int i = 5;i>0;i--)
		{
			for(int j = n-i;j>0;j--)
			{
				System.out.println(" ");
			}
			for(int i = n;i>0;i--)
			{
				System.out.println("*");
			}
			k--;
		}
	}
}
	