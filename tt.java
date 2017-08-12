/*
this关键字：代表它所在函数所属对象的引用。
简单说，哪个对象在调用this所在的函数，this就代表哪个对象。

this的应用：当定义类中功能时，该函数内部要用到调用该函数
的对象时，这时用this来表示这个对象。
但凡本类功能内部使用了本类对象，都用this表示。

this在构造函数间调用：this语句用于构造函数之间进行互相调用。
this语句只能定义在构造函数的第一行，因为初始化要先执行。
*/
class person
{
	private String name;
	private int age;
	
	{
		System.out.println("构造代码块");
		cry();
	}

	public void cry()
	{
		System.out.println("cry..........");
	}

	person()
	{
		System.out.println("name = "+name+",,,aeg = "+age);
	}

	person(String name)
	{
		this();
	//	this.name = name;
		System.out.println("name = "+name+",,,aeg = "+age);
	}

	person(String name,int age)
	{
	//	this.name = name;
		this(name);
	//	this .age = age;
		System.out.println("name = "+name+",,,aeg = "+age);
	}

	public void setName(String name)
	{
		this.name = name;			//this 关键字，表示这个对象。
	}

	public String getName()
	{
		return name;
	}
}

class tt
{
	public static void main(String[] args) 
	{
		person p1 = new person();
		p1.setName("wuliwei");
		System.out.println("改名为："+p1.getName());

		person p = new person("zzzzzz",25);

		//person p2 = new person("张成");
		//p2.setName("bingbing");
		//System.out.println(p2.getName());
		
	}
}
