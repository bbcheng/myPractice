/*
�������飺��������г�ʼ����
			����һ���������У����������ڹ��캯��ִ�С�
�͹��캯��������
				1�����������Ǹ����ж������ͳһ��ʼ����
				�����캯���Ǹ���Ӧ�Ķ����ʼ����
���������ж�����ǲ�ͬ�����Եĳ�ʼ�����ݡ�
*/

class person1
{
	private String name;				
	private int age;
//�������飬������Ƕ���Ĺ������ݡ�
	{
		System.out.println("��������,,,�ȿޣ��к���");
		cry();
	}

	person1()				//���������أ������б���ͬ��
	{
		System.out.println("A: name = "+name+",,,age = "+age);
	//	cry();
	}

	person1(String n)		//���������أ������б���ͬ��
	{
		name = n;
		System.out.println("B: name = "+name+",,,age = "+age);
	//	cry();
	}

	person1(String n,int a)	//���������أ������б���ͬ��
	{
		name = n;
		age = a;
		System.out.println("C: name = "+name+",,,age = "+age);
	//	cry();
	}

	public void cry()
	{
		System.out.println("cry..........");	
	}

	public void setName(String n)	//�ⲿ���Դ�һ�����֣��ú����޷���ֵ��
	{
		name = n;
	}

	public String  getName()		//���ش�������������֡�����ֵ����ΪString��
	{
		return name;
	}
}




class good 
{
	public static void main(String[] args) 
	{
		person1 p1 = new person1();				//���������ȵ���һ�ι�������
	//	p1.cry();

		person1 p2 = new person1("zczczccz");	//���������ȵ���һ�ι�������
																
		p2.setName("lisi");						//��һ������
		System.out.println(p2.getName());		//getNameû�д�ӡ���ܡ�

	//	System.out.println(p2.setName("ohuo"));	//setName����û�з���ֵ���ʸ����Ƿ���
	//	p2.setName("ohuo");
	//	System.out.println(p2.getName());

		person1 p3 = new person1("gggg",15);	//���������ȵ���һ�ι�������

	}
}