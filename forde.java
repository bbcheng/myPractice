/*
class forde 
{
	public static void main(String[] args) 
	{
		int x=0;
		for(System.out.println("开始!");x<3;x++)
			System.out.println(x);
		System.out.println("Hello World!");
	}
}
*/


/*
1.获取1~10的和，并打印。
2.1~100之间7的倍数的个数。
*/
class forde
{
	public static void main(String[] arg)
	{
		
		int h=0;
		for(int x=1;x<=10;x++)
			h+=x;
		System.out.println("1~10的和是："+h);
		System.out.println();
		h=0;
		for(int x=1;x<=100;x++)
			if(x%7==0)
				h++;
		System.out.println("1~100之间7的倍数的个数是："+h);

		System.out.println("-------------------------------");

		int x,y;
		for(x=0;x<5;x++)				//外循环控制行数，内循环控制每行个数。
		{
			for(y=0;y<=x;y++)			//尖朝上，改变内循环条件。
			{
				System.out.print("*");
			}
			System.out.println();		//单纯的换行。
		}

		x=y=0;
		for(x=1;x<5;x++)
		{
			for(y=x;y<5;y++)			//尖朝下，改变内循环初始化值。
			{
				System.out.print("*");
			}
			System.out.println();
		}

	System.out.println("-------------------------------");

		x=y=0;
		for(x=1;x<=5;x++)
		{
			for(y=1;y<=x;y++)
			{
				System.out.print(y);
			}
			System.out.println();
		}

	System.out.println("-------------------------------");
		
		x=y=0;
		for(x=1;x<=5;x++)
		{
			for(y=1;y<=x;y++)
			{
				System.out.print(x);
			}
			System.out.println();
		}
	}
}