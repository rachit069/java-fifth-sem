class question{
	public static void main(String arg[])
	{
		
		int count = 0;
		int amount = 0;
		for(int i = 0;i<7;i++)
		{
			amount = amount + (80*100);
			System.out.println(amount);
			count ++;

			if(amount > 10000)
			{
				System.out.println("Reached limit");
				break;
			}
		}
		System.out.println("on day "+count);
		
		System.out.println(amount);
	}
}