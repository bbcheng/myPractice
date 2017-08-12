class zchan 
{
	/*
	public static void main(String[] args) 
	{
		jux(4,4);
		System.out.println("----------------------");
		cf(9);
		System.out.println("----------------------");
		cf(5);
	}
	public static void jux(int x,int y)
	{
		for (int a=0;a<=x ; a++)
		{
			for(int b=0;b<=y;b++)
				System.out.print("* ");
			System.out.println();
		}
	}

	public static void cf(int x)
	{
		for(int a=1;a<=x;a++)
		{
		/*
		for(int c=a;c<x;c++)			//打印空格
			{
				System.out.print("\t");
			}
		
			for(int b=1;b<=a;b++)
			{
				System.out.print(b+"*"+a+"="+b*a+"\t");
			}

			System.out.println();
		}
	}

	*/


	public static void main(String[] arg)
	{
		print99();
	}
	public static void print99()
	{
		for(int x=1;x<=9;x++)
		{
			for(int y=1;y<=x;y++)
				System.out.print(y+"*"+x+"="+y*x+"\t");
			System.out.println();
		}
										//一个函数中可以调用其他函数。
		xx();

		print99(5);

	}
	public static void print99(int n)
	{
		for(int x=1;x<=n;x++)
		{
			for(int y=1;y<=x;y++)
				System.out.print(y+"*"+x+"="+y*x+"\t");
			System.out.println();
		}
	}
	public static void xx()
	{
		System.out.println("-------------------------");
	}
}
