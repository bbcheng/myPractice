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

	public static int getar(int[] arr, int key)	//key��ʾҪ���ҵ�����
	{
		int min=0,max=arr.length-1,mid;

		mid=(min+max)/2;

		while(key!=arr[mid])
		{
			if(key>arr[mid])		//�м�ֵ��Ҫ����ֵС��minλ���ƶ���
				min = mid+1;
			else if(key<arr[mid])	//�м�ֵ��Ҫ����ֵ��maxλ���ƶ���
				max = mid-1;

			mid=(min+max)/2;

			if(min>max)		//���������û��Ҫ���ҵ�ֵ��ѭ���Ͳ����������˵�min����max��ʱ���
				return -1;	//���Է���-1˵��Ҫ����ֵ�����ڡ�
		}

		return mid;			//ѭ��������ʾ�ҵ�Ҫ���ҵ��������Է��ظ�ֵ��λ�á�
	}

	public static int getar_2(int[] arr,int key)
	{
		int min,max,mid;
		min = 0;
		max = arr.length-1;
		while(min<=max)			//ֻҪminС��max���Ϳ����۰���ҡ�
		{
			mid = (min+max)/2;

			if(key>arr[mid])
				min = mid+1;
			else if(key<arr[mid])
				max = mid-1;
			else				//key������Ҳ��С���м�ֵ������ڣ��ҵ�����ֵ��
				return mid;
		}
							
		return -1;		//ѭ��������˵�������в�����Ҫ����ֵ��

	//	return min;		//����min�����ҵ���Ҫ���������λ�á�
	}
}
