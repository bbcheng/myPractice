class forfor 
{
	public static void main(String[] args) 
	{
		for(int x=0;x<5;x++)	//��������5����ѭ����
		{
			for(int y=x;y<4;y++)
				System.out.print("-");	//���������Σ�һ����ӡ-��һ����ӡ*��
		
			for(int z=0;z<=x;z++)
				System.out.print("* ");	//Ҫ��ӡ���������Σ�*����Ҫ�пո�
			System.out.println();
		}
	}
}
