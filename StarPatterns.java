class StarPatterns
{
	public static void main(String a[])
	{
		StarPatterns stars=new StarPatterns();
		int rc = Integer.parseInt(a[0]);
		System.out.println("StarPatterns object is created");
		stars.leftStarTriangle(rc);
		stars.starDiagonals(rc);
		stars.downStarTriangle(rc);
		stars.rightStarTriangle(rc);
		stars.upTriangle(rc);
		stars.triangleOne(rc);

	}	
	public void leftStarTriangle(int rc)
	{
		for(int r=1;r<=rc;r++)
		{
			for(int c=1;c<=rc;c++)
			{
				if((r+c>=rc+1))
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
	public void starDiagonals(int rc)
	{
		for(int r=1;r<=rc;r++)
		{
			for(int c=1;c<=rc;c++)
			{
				if((r==c) || (r+c)==(rc+1))
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
	public void downStarTriangle(int rc)
	{
		for(int r=1;r<=rc;r++)
		{
			for(int c=1;c<=rc;c++)
			{
				if((r+c<=rc+1))
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
	public void rightStarTriangle(int rc)
	{
		for(int r=1;r<=rc;r++)
		{
			for(int c=1;c<=r;c++)
			{				
				System.out.print("*\t");
			}
			System.out.println();
		}
		System.out.println("---------------------------------");
	}
	
	public void upTriangle(int rc)
	{
		for(int r=1;r<=rc;r++)
		{
			for(int c=1;c<=rc;c++)
			{
				System.out.print("*\t");
			}
			System.out.println();
		}
		System.out.println("---------------------------------");
	}
	

}