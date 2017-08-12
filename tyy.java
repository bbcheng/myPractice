/*
this的应用：当定义类中功能时，该函数内部要用到调用该函数
的对象时，这时用this来表示这个对象。
但凡本类功能内部使用了本类对象，都用this表示。
*/

class person 
{
	private int age;

	{
		System.out.print("该人的初始年龄：");	
	}

	person(int age)
	{
		this.age = age;
	}

	public boolean compare(person p)
	{
		return this.age==p.age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public int getAge()
	{
		return this.age;
	}
}

class tyy
{
	public static void main(String[] args)
	{
		person p1 = new person(20);
		//System.out.println(p1.setAge(25));	//setAge没有返回值，故该语句报错。
		System.out.println(p1.getAge());

		p1.setAge(25);
		System.out.println("修改后的年龄："+p1.getAge());

		person p2 = new person(25);
		System.out.println(p2.getAge());
		//System.out.println(p2.age);		//age是私有(private)，不能直接访问，该语句报错。

		boolean b = p1.compare(p2);
		System.out.println("是否是同龄人"+b);
	}
}
