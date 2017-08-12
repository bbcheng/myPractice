/*
封装：隐藏对象的属性和实现细节，
仅对外提供公共访问方式。
原则：将不需要对外提供的内容都隐藏起来
	  把属性都隐藏，提供公共方法对其访问。
*/

/*
private：私有（权限修饰符）：用于修饰类中的成员（成员变量，成员函数）
私有后只在本类中有效。
私有化以后，类以外即使建立了对象也不能直接访问。
*/

/*
私有是封装的一种表现形式，两者不同。
*/

class person 
{
	private int age;		//私有化age

	void speak()
	{
		System.out.println("age = "+age);
	}

	public void setAge(int a)	//age不能直接访问，通过一个函数来访问
	{
		if(a>=0 && a<120)
		{	
			age = a;			//a赋予对象的age。
			speak();
		}
		else
			System.out.println("age ="+a+"年龄不合法");
	}

	public int getAge(int a)
	{
	//	age = a;
		return a;
	}
}

class persondemo
{
	public static void main(String[] args)
	{
		person p = new person();
	//	p.age = 18;			//age是private（私有），无法直接访问。
		
		p.setAge(18);		//通过访问公共函数来间接访问age。
	//	p.speak();			//18赋予对象中的age，person类中的age不变。

		p.setAge(-5);	

	//	p.getAge(-5);		//不打印。
	//	p.speak();
	//	System.out.println("age = "+p.getAge(-5));
	}
}