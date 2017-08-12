class shuz 
{
	public static void main(String[] args) 
	{
		int[] ar = {8,1,6,9,2};

		int[] arr = {1,8,6,9,2,13,2};

		int max = getmax(ar);			//调用getmax函数。

		int max_2 = getmax_2(arr);		//调用getmax_2函数。

		int min = getmin(ar);			//调用getmin函数。
		
		System.out.println("max="+max);
		System.out.println("min="+min);
		System.out.println("max_2="+max_2);
	}
	public static int getmax(int[] arr)	//getmax函数用于求数组中的最大值并返回。
	{
		int max = arr[0];				//max用于初始化数组中的元素。
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}

	public static int getmax_2(int[] arr)	//getmax_2函数用于求数组中的最大值并返回。
	{
		int max = 0;						//max用于初始化数组中的角标。
		for(int i=1;i<arr.length;i++)
		{
			if(arr[max]<arr[i])
				max=i;
		}
		return arr[max];
	}

		public static int getmin(int[] arr)	//getmin函数用于求数组中的最小值并返回。
	{
		int min = 0;						//min用于初始化数组中的角标。
		for(int i=1;i<arr.length;i++)
		{
			if(arr[min]>arr[i])
				min=i;
		}
		return arr[min];
	}
}


