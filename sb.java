/*
什么时候使用静态：
要从两方面入手：
因为静态修饰的内容有成员变量和函数；

1.什么时候定义静态变量（类变量）呢？
当对象中出现共享数据时，该数据被静态所修饰；
对象中的特有数据要定义成非静态存在于堆内存中。

2.什么时候定义静态函数呢？
当功能内部没有访问到非静态数据（对象的特有数据），
那么该功能可以定义成静态的。


*/

class  ss
{
	int age;
	public static void show() //该功能没有访问非静态数据。
	{							//所以可以定义成静态的。
		System.out.println("飞龙");
	}
}

class sb
{
	public static void main(String[] args)
	{
	//	ss p = new ss();
	//	p.show();
		ss.show();
	}
}
