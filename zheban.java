class zheban 
{
	public static void main(String[] args) 
	{
		int[] arr = {2,4,6,7,9,15};

		int index = getar(arr,7);
		
		int index_2 = getar_2(arr,5);

		System.out.println("index= "+index);
		System.out.println("index_2= "+index_2);
	}

	public static int getar(int[] arr, int key)	//key表示要查找的数。
	{
		int min=0,max=arr.length-1,mid;

		mid=(min+max)/2;

		while(key!=arr[mid])
		{
			if(key>arr[mid])		//中间值比要查找值小，min位置移动。
				min = mid+1;
			else if(key<arr[mid])	//中间值比要查找值大，max位置移动。
				max = mid-1;

			mid=(min+max)/2;

			if(min>max)		//如果数组中没有要查找的值，循环就不会结束，因此当min大于max的时候就
				return -1;	//可以返回-1说明要查找值不存在。
		}

		return mid;			//循环结束表示找到要查找的数，可以返回该值的位置。
	}

	public static int getar_2(int[] arr,int key)
	{
		int min,max,mid;
		min = 0;
		max = arr.length-1;
		while(min<=max)			//只要min小于max，就可以折半查找。
		{
			mid = (min+max)/2;

			if(key>arr[mid])
				min = mid+1;
			else if(key<arr[mid])
				max = mid-1;
			else				//key不大于也不小于中间值，则等于，找到查找值。
				return mid;
		}
							
		return -1;		//循环结束，说明数组中不存在要查找值。

	//	return min;		//返回min可以找到需要插入的数的位置。
	}
}
