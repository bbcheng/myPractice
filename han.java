class han 
{
	public static void main(String[] args) 
	{
		sum(5);
		su(4);							//可以定义一个变量储存return的值。
		System.out.println(sum1(3));
	}

	public static void sum(int x) 
	{
		System.out.print("输出de结果是：");
		System.out.println(x*3+5);
	}
	public static int su(int y) 
	{
		int s;
		s=y*3+5;
		System.out.println("输出额结果是："+s);
		return s;
	}
	public static int sum1(int x) 
	{
		System.out.print("输出的结果是：");
		return (x*3+5);
	}
}
