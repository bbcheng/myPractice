/*
class forde 
{
	public static void main(String[] args) 
	{
		int x=0;
		for(System.out.println("��ʼ!");x<3;x++)
			System.out.println(x);
		System.out.println("Hello World!");
	}
}
*/


/*
1.��ȡ1~10�ĺͣ�����ӡ��
2.1~100֮��7�ı����ĸ�����
*/
class forde
{
	public static void main(String[] arg)
	{
		
		int h=0;
		for(int x=1;x<=10;x++)
			h+=x;
		System.out.println("1~10�ĺ��ǣ�"+h);
		System.out.println();
		h=0;
		for(int x=1;x<=100;x++)
			if(x%7==0)
				h++;
		System.out.println("1~100֮��7�ı����ĸ����ǣ�"+h);

		System.out.println("-------------------------------");

		int x,y;
		for(x=0;x<5;x++)				//��ѭ��������������ѭ������ÿ�и�����
		{
			for(y=0;y<=x;y++)			//�⳯�ϣ��ı���ѭ��������
			{
				System.out.print("*");
			}
			System.out.println();		//�����Ļ��С�
		}

		x=y=0;
		for(x=1;x<5;x++)
		{
			for(y=x;y<5;y++)			//�⳯�£��ı���ѭ����ʼ��ֵ��
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