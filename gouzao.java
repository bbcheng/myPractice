/*
���캯������������������ͬ�����ö��巵��ֵ���ͣ�������дreturn��䡣
	���ã���������г�ʼ��
	������캯���������ص���ʽ���ڵġ�
��һ������û�ж��幹�캯��ʱ��ϵͳ�ͻ�Ĭ�ϸ��������һ���ղ����Ĺ��캯����

����һ���������캯��ֻ�ܱ�����һ�Σ���һ�㺯�����Ա���ε��á�
*/

class person1
{
	private String name;				
	private int age;
	person1()				//���������أ������б�ͬ��
	{
		System.out.println("A: name = "+name+",,,age = "+age);
		cry();
	}

	person1(String n)		//���������أ������б�ͬ��
	{
		name = n;
		System.out.println("B: name = "+name+",,,age = "+age);
		cry();
	}

	person1(String n,int a)	//���������أ������б�ͬ��
	{
		name = n;
		age = a;
		System.out.println("C: name = "+name+",,,age = "+age);
		cry();
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




class gouzao 
{
	public static void main(String[] args) 
	{
	//	person1 p = new person1();// ����һ�������͵��ù��캯����ֻ�ܵ���һ�Ρ�
	//	new person1();			//���Թ��캯���������ڸ�������г�ʼ����
	//	p.person1();	//�Ƿ���䡣

	//	person1 p1 = new person1();
	//	p1.cry();

		person1 p2 = new person1("zczczccz");	//��������ֻ����һ�ι��캯��
												//��һ�㺯�����Ա���ε��á�(g)setName					
		p2.setName("lisi");						//��һ������
		System.out.println(p2.getName());		//getNameû�д�ӡ���ܡ�
	//	System.out.println(p2.setName("ohuo"));	//setName����û�з���ֵ���ʸ����Ƿ���
		p2.setName("ohuo");
		System.out.println(p2.getName());

	//	person1 p3 = new person1("gggg",15);

	}
}
