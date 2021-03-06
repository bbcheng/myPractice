class paixu 
{
	/*
	需求：定义一个功能，对一个数组进行排序。
	*/
	public static void main(String[] args) 
	{
		int[] arr = new int[]{5,2,3,1,8,7};
		//排序前：
		System.out.print ("排序前: ");
		array(arr);

		//选择排序：
		sort(arr);

		//排序后：
		System.out.print ("排序后: ");
		array(arr);

		//冒泡排序：
		mmsort(arr);

		//排序后：
		System.out.print ("排序后: ");
		array(arr);

	}

	public static void sort(int[] arr)			//对数组中的元素进行选择法排序。（只排序不打印）

	{
		for (int i=0;i<arr.length ;i++ )		//选择法：选定头一个元素，依次和后面的元素比较，符合if条件，交换。
		{										//后面依次类推。所以 i 控制每次都要做比较的元素的下标。
			for (int j=i+1;j<arr.length ;j++ )	//j控制每次 i 后面的所有元素的下标。
			{
				if(arr[i]>arr[j])
				{
					int t= arr[i];
					arr[i]=arr[j];
					arr[j]= t;
				}
			}
		}
	}

	public static void array(int[] arr)			//对数组中的元素进行打印操作。
	{
		for (int a=0;a<arr.length ;a++ )
		{
			System.out.print(arr[a]+" ");
		}
		System.out.println();
	}


	public static void mmsort(int[] arr)		//对数组进行冒泡法排序。
	{
		for (int x=0;x<arr.length ;x++ )		
		{
			for (int y=0;y<arr.length-x-1 ;y++ )//比较的次数依次减少。因为防止角标越界，还要再-1。
			{
				if (arr[y]<arr[y+1])			//冒泡法：相邻两元素之间进行比较。
				{
					int t=arr[y];
					arr[y]=arr[y+1];
					arr[y+1]=t;
				}
			}
		}
	}
}
