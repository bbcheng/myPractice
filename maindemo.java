/*
public static void main(String[] args)

����������һ������ĺ��������Ա�jvm������������á�

�������Ķ��壺
public�������Ÿú�������Ȩ�������ģ�
static������������������ļ��ؾ��Ѿ������ˣ�
void��������û�о���ķ���ֵ��
main�����ǹؼ��֣�������һ������ĵ��ʣ����Ա�jvmʶ��
(String[] args)�������Ĳ���������������һ�����飬�������е�Ԫ�����ַ������ַ������͵����顣

�������ǹ̶���ʽ�ģ�jvmʶ��

jvm�ڵ���������ʱ���������new String[0];

*/

class  maindemo
{
	public static void main(String[] args) 
	{
		String[] arr = {"aa","bb","cc","dd"};
		setmain.main(arr);

		setmain p = new setmain();
		p.main(arr);
	}
}

class setmain
{
	public static void main(String[] args) 
	{
		for (int i=0;i<args.length ;i++ )
		{
			System.out.println(args[i]);
		}
		
		System.out.println(args.length);
	}
}