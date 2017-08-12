class forfor 
{
	public static void main(String[] args) 
	{
		for(int x=0;x<5;x++)	//控制行数5层外循环。
		{
			for(int y=x;y<4;y++)
				System.out.print("-");	//两个三角形，一个打印-，一个打印*。
		
			for(int z=0;z<=x;z++)
				System.out.print("* ");	//要打印等腰三角形，*后面要有空格。
			System.out.println();
		}
	}
}
