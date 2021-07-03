class Matrix
{
	public static void main(String a[])
	{
		Matrix matrix=new Matrix();
		System.out.println("Matrix object is created");
		matrix.rowsColumns();
		matrix.firstAndLast();
		matrix.middleRowColumn();
		matrix.uptoThreeRowColumn();
		matrix.fromThree();
	}
	
	public void rowsColumns()
	{
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=5;c++)
			{
				System.out.print(r+""+c+"\t");
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
					System.out.print(r+""+c+"\t");
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
					System.out.print(r+""+c+"\t");
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
		for(int r=1;r<=3;r++)
		{
			for(int c=1;c<=3;c++)
			{
				if(r==3 || c==3)
				{
					System.out.print(r+""+c+"\t");
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
					System.out.print(r+""+c+"\t");
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