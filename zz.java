class zz 
{
	public static void main(String[] args) 
	{
		int n=3,m=8;
		System.out.println("n="+n+",m="+m);
		//用第三个变量实现n和m的值交换。
		int t;
		t=m;
		m=n;
		n=t;
		System.out.println("n="+n+",m="+m);
		//不用第三个变量实现n和m的值交换。
		n=3;m=8;
		n=n+m;
		m=n-m;
		n=n-m;
		System.out.println("n="+n+",m="+m);
		//用^(异或)实现n和m的值交换。一个数两次^同一个数，值还是这个数。
		n=3;m=8;
		n=n^m;
		m=n^m;
		n=n^m;
		System.out.println("n="+n+",m="+m);
		System.out.println("Hello World!");
	}
}
