class han 
{
	public static void main(String[] args) 
	{
		sum(5);
		su(4);							//���Զ���һ����������return��ֵ��
		System.out.println(sum1(3));
	}

	public static void sum(int x) 
	{
		System.out.print("���de����ǣ�");
		System.out.println(x*3+5);
	}
	public static int su(int y) 
	{
		int s;
		s=y*3+5;
		System.out.println("��������ǣ�"+s);
		return s;
	}
	public static int sum1(int x) 
	{
		System.out.print("����Ľ���ǣ�");
		return (x*3+5);
	}
}
