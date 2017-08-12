/*
构造代码块：给对象进行初始化。
			对象一建立就运行，而且优先于构造函数执行。
和构造函数的区别：
				1、构造代码块是给所有对象进行统一初始化，
				而构造函数是给对应的对象初始化。
构造代码块中定义的是不同对象共性的初始化内容。
*/

class person1
{
	private String name;				
	private int age;
//构造代码块，定义的是对象的共性内容。
	{
		System.out.println("构造代码块,,,先哭，有孩子");
		cry();
	}

	person1()				//函数的重载，参数列表不同。
	{
		System.out.println("A: name = "+name+",,,age = "+age);
	//	cry();
	}

	person1(String n)		//函数的重载，参数列表不同。
	{
		name = n;
		System.out.println("B: name = "+name+",,,age = "+age);
	//	cry();
	}

	person1(String n,int a)	//函数的重载，参数列表不同。
	{
		name = n;
		age = a;
		System.out.println("C: name = "+name+",,,age = "+age);
	//	cry();
	}

	public void cry()
	{
		System.out.println("cry..........");	
	}

	public void setName(String n)	//外部可以传一个名字，该函数无返回值。
	{
		name = n;
	}

	public String  getName()		//返回传进来的这个名字。返回值类型为String。
	{
		return name;
	}
}




class good 
{
	public static void main(String[] args) 
	{
		person1 p1 = new person1();				//建立对象，先调用一次构造代码块
	//	p1.cry();

		person1 p2 = new person1("zczczccz");	//建立对象，先调用一次构造代码块
																
		p2.setName("lisi");						//传一个名字
		System.out.println(p2.getName());		//getName没有打印功能。

	//	System.out.println(p2.setName("ohuo"));	//setName函数没有返回值，故该语句非法。
	//	p2.setName("ohuo");
	//	System.out.println(p2.getName());

		person1 p3 = new person1("gggg",15);	//建立对象，先调用一次构造代码块

	}
}
