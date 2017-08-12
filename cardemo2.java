class car
{
	String color = "红色";			//变量为属性，函数是行为或者方法。
	int num = 4;
	void show()
	{
		System.out.println("color= "+color+" and "+" num= "+num);
	}
	
}

class cardemo2
{
	public static void main(String[] args)
	{	//new创建实体									
		//new car().num = 5;		//匿名对象。
		//无用的垃圾
		//new car().color =  "蓝色";//匿名对象只能调用一次
									//当对方法调用一次时，可以使用
									//对一个对象进行多个成员调用，必须给这个对象起个名字。
		new car().show();//调用方法有意义//还是原来的属性。
		
		car c = new car();
		showcar(c);

		showcar(new car());
	}

	//可以将匿名对象作为实际参数进行传递。

	public static void showcar(car a)
	{
		a.color =  "蓝色";
		a.num = 3;
		a.show();
	}
}
