class StarPattern
{
	public static void main(String a[])
	{
		StarPattern star=new StarPattern();
		System.out.println("StarPattern object is created");
		star.rowsColumns();
		star.firstAndLast();
		star.middleRowColumn();
		star.uptoThreeRowColumn();
		star.fromThree();
	}
	
	public void rowsColumns()
	{
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=5;c++)
			{
				System.out.print("*\t");
			}
			System.out.println();
		}
		System.out.println("---------------------------------");
	}
	
	
	public void firstAndLast()
	{
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=5;c++)
			{
				if(r==1 || r==5 || c==1 ||c==5)
				{
					System.out.print("*\t");
				}
				else
				{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		System.out.println("---------------------------------");
	}
	
	public void middleRowColumn()
	{
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=5;c++)
			{
				if(r==3 || c==3)
				{
					System.out.print("*\t");
				}
				else
				{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		System.out.println("---------------------------------");
	}
	
	public void uptoThreeRowColumn()
	{
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=5;c++)
			{
				if((r==3 && c==3)||(r==3 && c==1)||(r==3 && c==2)||(r==2 && c==3)||(r==1 && c==3))
					
				{
					System.out.print("*\t");
				}
				else
				{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		System.out.println("---------------------------------");
	}
	
	public void fromThree()
	{
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=5;c++)
			{
				if(r>=3 && c>=3)
				{
					System.out.print("*\t");
				}
				else
				{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		System.out.println("---------------------------------");
	}	
}