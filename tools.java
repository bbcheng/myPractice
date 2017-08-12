/*
静态的应用：

每一个应用程序中都有共性的功能；
可以将这些功能进行抽取，独立封装，以便复用。


虽然可以通过建立tools的对象使用这些工具方法，对数组进行操作。
但是：
1.对象是用于封装数据的，可是tools对象并未封装特有数据。
2.操作数组的每一个方法都没有用到tools对象中的特有数据。

这时可以考虑，让程序更严谨，是不需要对象的。
可以将tools中的方法都定义成static的，直接通过类名调用即可。

将方法都静态后，可以方便与使用，但是该类还是可以被其他程序建立对象；
为了更加严谨，强制让该类不能建立对象。
可以通过将构造函数私有化完成。


接下来，可以将tools.class文件发送给其他人，其他人只要将文件设置到classpath路径下，就可以使用该工具类。
但是，该类中定义了多少个方法，对方并不清楚，因为没有该类的说明书。

开始制作程序的说明书，Java的说明书通过文档注释来完成。

*/

/**
这是一个可以对数组进行操作的工具类，该类中提供了获取最值，排序等功能。
@author zc
@version V0.1
*/
public class  tools		//要生成文档，该类必须是public的。
{
	/**
	空参数构造函数。
	*/
	private tools(){}

	/**
	获取一个整形数组中的最大值。
	@param arr 接收一个int类型的数组；
	@return 返回一个该数组中最大值。
	*/
	public static int getmax(int[] arr)
	{
		int max = 0;
		for(int x=1;x<arr.length;x++)
		{
			if(arr[x]>arr[max])
				max = x;
		}
		return arr[max];
	}

	/**
	获取一个整形数组中的最小值。
	@param arr 接收一个int类型的数组；
	@return 返回一个该数组中最小值。
	*/
	public static int getmin(int[] arr)
	{
		int min = 0;
		for(int x=1;x<arr.length;x++)
		{
			if(arr[x]<arr[min])
				min = x;
		}
		return arr[min];
	}


	/**
	给int型数组进行选择排序；
	@param arr 接收一个int类型数组。
	*/
	public static void sort(int[] arr)
	{
		for (int x=0;x<arr.length-1 ;x++ )
		{
			for (int y=x+1;y<arr.length ;y++ )
			{
				if(arr[x]>arr[y])
					swap(arr,x,y);
			}
		}
	}


	/**
	给int型数组进行冒泡排序；
	@param arr 接收一个int类型数组。
	*/
	public static void bubble(int[] arr)
	{
		for (int x=0;x<arr.length-1 ;x++ )
		{
			for (int y=0;y<arr.length-x-1 ;y++ )
			{
				if(arr[y]>arr[y+1])
					swap(arr,y,y+1);
			}
		}
	}


	/**
	给数组中元素进行位置的置换；
	@param arr 接收一个int类型的数组；
	@param a 要置换的位置；
	@param b 要置换的位置。
	*/
	private	static void swap(int[] arr,int a,int b)
	{
		int t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
	}


	/**
	用于打印数组中的元素；
	@param arr 接收一个int类型的数组；
	打印形式是：[elemet1,elemet2,elemet3...]
	*/
	public static void printf(int[] arr)
	{
		System.out.print("[");
		for (int i=0;i<arr.length ;i++ )
		{
			if(i!=arr.length-1)
				System.out.print(arr[i]+",");
			else
				System.out.println(arr[i]+"]");
		}
	}
}
