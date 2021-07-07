class Patterns
{
	public static void main(String a[])
	{
		Patterns patterns=new Patterns();
		int rc = Integer.parseInt(a[0]);
		System.out.println("Patterns object is created");
		patterns.rowsColumns(rc);
		patterns.leftTriangle(rc);
		patterns.diagonals(rc);
		patterns.downTriangle(rc);
		patterns.rightTriangle(rc);
		patterns.upTriangle(rc);
		
		
	}
	
	public void rowsColumns(int rc)
	{
		for(int r=1;r<=rc;r++)
		{
			for(int c=1;c<=rc;c++)
			{
				System.out.print(r+""+c+"\t");
			}
			System.out.println();
		}
		System.out.println("---------------------------------");
	}
	public void leftTriangle(int rc)
	{
		for(int r=1;r<=rc;r++)
		{
			for(int c=1;c<=rc;c++)
			{
				if((r+c>=rc+1))
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
	
	public void diagonals(int rc)
	{
		for(int r=1;r<=rc;r++)
		{
			for(int c=1;c<=rc;c++)
			{
				if((r==c) || (r+c)==(rc+1))
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
	
	public void downTriangle(int rc)
	{
		for(int r=1;r<=rc;r++)
		{
			for(int c=1;c<=rc;c++)
			{
				if((r+c<=rc+1))
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
	
	public void rightTriangle(int rc)
	{
		for(int r=1;r<=rc;r++)
		{
			for(int c=1;c<=r;c++)
			{				
				System.out.print(r+""+c+"\t");
			}
			System.out.println();
		}
		System.out.println("---------------------------------");
	}
	
	public void upTriangle(int rc)
	{
		for(int r=rc;r>=1;r--)
		{
			for(int c=1;c<=rc;c++)
			{				
				System.out.print(r+""+c+"\t");
			}
			System.out.println();
		}
		System.out.println("---------------------------------");
	}
}