class zz 
{
	public static void main(String[] args) 
	{
		int n=3,m=8;
		System.out.println("n="+n+",m="+m);
		//�õ���������ʵ��n��m��ֵ������
		int t;
		t=m;
		m=n;
		n=t;
		System.out.println("n="+n+",m="+m);
		//���õ���������ʵ��n��m��ֵ������
		n=3;m=8;
		n=n+m;
		m=n-m;
		n=n-m;
		System.out.println("n="+n+",m="+m);
		//��^(���)ʵ��n��m��ֵ������һ��������^ͬһ������ֵ�����������
		n=3;m=8;
		n=n^m;
		m=n^m;
		n=n^m;
		System.out.println("n="+n+",m="+m);
		System.out.println("Hello World!");
	}
}
