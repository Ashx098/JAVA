class pattern
{
	public static void main(String[] args) 
	{
		for (int i=0;i<=15 ;i++ ) 
		{
			if(i%5==0)
			for(int j=0;j<=15;j++)
			{
				if(j%5==0) System.out.print("+");
				else System.out.print("-");
			}
			else
				for(int j=0;j<=15;j++)
			{
				if(j%5==0) System.out.print("|");
				else System.out.print(" ");
			}
		System.out.println();
		}
	}
}