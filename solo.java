import java.util.Random;

class solo 
{
	public static void main(String[] args) 
	{
		
	//	Random n = new Random();			//Random()函数要定义这个头文件。
	//	int m = n.nextInt(10);
	//	System.out.println(m);

		int x = (int)(Math.random()*10);	//Math.random();产生的是0.0-1.0的单精度小数。
		System.out.println(x);				//要产生0-10的，可以在后面*10。
	
		
		Random n = new Random();
		int[][] arr = new int[5][5]; 
		for(int i=0;i<5;i++)
			for(int j=0;j<5;j++)
				arr[i][j] = n.nextInt(20);
	
		for(int i=0;i<5;i++)
			for(int j=0;j<5;j++)
		{
			System.out.print(arr[i][j]+"\t");
			if(j==4)
			System.out.println();
		}	
	
	}
}
