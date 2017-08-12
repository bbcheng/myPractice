/*
静态代码块
格式：
static
{
	静态代码块中的执行语句；
}

特点：随着类的加载而执行，只执行一次，并优先于主函数。
用到类中的内容类才加载。

用于给类进行初始化。

*/
class print
{
	static
	{
		System.out.println("a");
	}

	public static void show()
	{
		System.out.println("静态代码块");
	}
}

class jtd 
{
	static		//优先于主函数
	{
		System.out.println("b");
	}

	public static void main(String[] args) 
	{
		new print();	//静态代码块随着类的加载而执行，只执行一次
		new print();	//虽然创建了两个对象，但是静态代码块只执行一次，只打印一个a。
		print.show();
		System.out.println("over");
	}

	static		//优先于主函数
	{
		System.out.println("c");
	}
}
