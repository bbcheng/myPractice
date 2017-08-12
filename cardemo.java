class car		//描述一个对象：描述他的属性和行为（方法）
{
	String color = "红色";			//变量为属性，函数是行为或者方法。
	int num = 4;
	void show()
	{
		System.out.println("color= "+color+" and "+" num= "+num);
	}
	
}
/*	
类是对事物的描述
对象是这类事物中的具体个体
main函数是一个入口，只需要一个main
对类里面的对象进行操作，可以定义多个变量
car 类里面的变量是成员变量，函数里面的是局部变量
成员变量作用于类中，局部变量作用于函数中或者语句中。
成员变量存储于堆内存，局部变量存储于栈内存。
*/
class cardemo
{
	public static void main(String[] args)
	{										
		car c = new car();			//c是一个类类型变量。
		c.show();					//new 在堆内存中创建一个实体
									//变量c指向这个实体并对他进行操作
		c.color = "蓝色";			
		c.num = 5;
		c.show();					//c调用show函数，就打印c的color和num。

		c.show();					
		car h = new car();			//当创建一个新的实体时，里面的属性不变。
		h.show();					//show函数打印h这个对象的color和num。
	}
}
