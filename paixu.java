class paixu 
{
	/*
	���󣺶���һ�����ܣ���һ�������������
	*/
	public static void main(String[] args) 
	{
		int[] arr = new int[]{5,2,3,1,8,7};
		//����ǰ��
		System.out.print ("����ǰ: ");
		array(arr);

		//ѡ������
		sort(arr);

		//�����
		System.out.print ("�����: ");
		array(arr);

		//ð������
		mmsort(arr);

		//�����
		System.out.print ("�����: ");
		array(arr);

	}

	public static void sort(int[] arr)			//�������е�Ԫ�ؽ���ѡ�����򡣣�ֻ���򲻴�ӡ��

	{
		for (int i=0;i<arr.length ;i++ )		//ѡ�񷨣�ѡ��ͷһ��Ԫ�أ����κͺ����Ԫ�رȽϣ�����if������������
		{										//�����������ơ����� i ����ÿ�ζ�Ҫ���Ƚϵ�Ԫ�ص��±ꡣ
			for (int j=i+1;j<arr.length ;j++ )	//j����ÿ�� i ���������Ԫ�ص��±ꡣ
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

	public static void array(int[] arr)			//�������е�Ԫ�ؽ��д�ӡ������
	{
		for (int a=0;a<arr.length ;a++ )
		{
			System.out.print(arr[a]+" ");
		}
		System.out.println();
	}


	public static void mmsort(int[] arr)		//���������ð�ݷ�����
	{
		for (int x=0;x<arr.length ;x++ )		
		{
			for (int y=0;y<arr.length-x-1 ;y++ )//�ȽϵĴ������μ��١���Ϊ��ֹ�Ǳ�Խ�磬��Ҫ��-1��
			{
				if (arr[y]<arr[y+1])			//ð�ݷ���������Ԫ��֮����бȽϡ�
				{
					int t=arr[y];
					arr[y]=arr[y+1];
					arr[y+1]=t;
				}
			}
		}
	}
}