import java.util.Random;

class solo 
{
	public static void main(String[] args) 
	{
		
	//	Random n = new Random();			//Random()����Ҫ�������ͷ�ļ���
	//	int m = n.nextInt(10);
	//	System.out.println(m);

		int x = (int)(Math.random()*10);	//Math.random();��������0.0-1.0�ĵ�����С����
		System.out.println(x);				//Ҫ����0-10�ģ������ں���*10��
	
		
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
