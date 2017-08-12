/*
��̬��Ӧ�ã�

ÿһ��Ӧ�ó����ж��й��ԵĹ��ܣ�
���Խ���Щ���ܽ��г�ȡ��������װ���Ա㸴�á�


��Ȼ����ͨ������tools�Ķ���ʹ����Щ���߷�������������в�����
���ǣ�
1.���������ڷ�װ���ݵģ�����tools����δ��װ�������ݡ�
2.���������ÿһ��������û���õ�tools�����е��������ݡ�

��ʱ���Կ��ǣ��ó�����Ͻ����ǲ���Ҫ����ġ�
���Խ�tools�еķ����������static�ģ�ֱ��ͨ���������ü��ɡ�

����������̬�󣬿��Է�����ʹ�ã����Ǹ��໹�ǿ��Ա���������������
Ϊ�˸����Ͻ���ǿ���ø��಻�ܽ�������
����ͨ�������캯��˽�л���ɡ�


�����������Խ�tools.class�ļ����͸������ˣ�������ֻҪ���ļ����õ�classpath·���£��Ϳ���ʹ�øù����ࡣ
���ǣ������ж����˶��ٸ��������Է������������Ϊû�и����˵���顣

��ʼ���������˵���飬Java��˵����ͨ���ĵ�ע������ɡ�

*/

/**
����һ�����Զ�������в����Ĺ����࣬�������ṩ�˻�ȡ��ֵ������ȹ��ܡ�
@author zc
@version V0.1
*/
public class  tools		//Ҫ�����ĵ������������public�ġ�
{
	/**
	�ղ������캯����
	*/
	private tools(){}

	/**
	��ȡһ�����������е����ֵ��
	@param arr ����һ��int���͵����飻
	@return ����һ�������������ֵ��
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
	��ȡһ�����������е���Сֵ��
	@param arr ����һ��int���͵����飻
	@return ����һ������������Сֵ��
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
	��int���������ѡ������
	@param arr ����һ��int�������顣
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
	��int���������ð������
	@param arr ����һ��int�������顣
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
	��������Ԫ�ؽ���λ�õ��û���
	@param arr ����һ��int���͵����飻
	@param a Ҫ�û���λ�ã�
	@param b Ҫ�û���λ�á�
	*/
	private	static void swap(int[] arr,int a,int b)
	{
		int t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
	}


	/**
	���ڴ�ӡ�����е�Ԫ�أ�
	@param arr ����һ��int���͵����飻
	��ӡ��ʽ�ǣ�[elemet1,elemet2,elemet3...]
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
