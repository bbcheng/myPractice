/*
��̬�����
��ʽ��
static
{
	��̬������е�ִ����䣻
}

�ص㣺������ļ��ض�ִ�У�ִֻ��һ�Σ�����������������
�õ����е�������ż��ء�

���ڸ�����г�ʼ����

*/
class print
{
	static
	{
		System.out.println("a");
	}

	public static void show()
	{
		System.out.println("��̬�����");
	}
}

class jtd 
{
	static		//������������
	{
		System.out.println("b");
	}

	public static void main(String[] args) 
	{
		new print();	//��̬�����������ļ��ض�ִ�У�ִֻ��һ��
		new print();	//��Ȼ�������������󣬵��Ǿ�̬�����ִֻ��һ�Σ�ֻ��ӡһ��a��
		print.show();
		System.out.println("over");
	}

	static		//������������
	{
		System.out.println("c");
	}
}