class shuz 
{
	public static void main(String[] args) 
	{
		int[] ar = {8,1,6,9,2};

		int[] arr = {1,8,6,9,2,13,2};

		int max = getmax(ar);			//����getmax������

		int max_2 = getmax_2(arr);		//����getmax_2������

		int min = getmin(ar);			//����getmin������
		
		System.out.println("max="+max);
		System.out.println("min="+min);
		System.out.println("max_2="+max_2);
	}
	public static int getmax(int[] arr)	//getmax���������������е����ֵ�����ء�
	{
		int max = arr[0];				//max���ڳ�ʼ�������е�Ԫ�ء�
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}

	public static int getmax_2(int[] arr)	//getmax_2���������������е����ֵ�����ء�
	{
		int max = 0;						//max���ڳ�ʼ�������еĽǱꡣ
		for(int i=1;i<arr.length;i++)
		{
			if(arr[max]<arr[i])
				max=i;
		}
		return arr[max];
	}

		public static int getmin(int[] arr)	//getmin���������������е���Сֵ�����ء�
	{
		int min = 0;						//min���ڳ�ʼ�������еĽǱꡣ
		for(int i=1;i<arr.length;i++)
		{
			if(arr[min]>arr[i])
				min=i;
		}
		return arr[min];
	}
}


