/*
this��Ӧ�ã����������й���ʱ���ú����ڲ�Ҫ�õ����øú���
�Ķ���ʱ����ʱ��this����ʾ�������
�������๦���ڲ�ʹ���˱�����󣬶���this��ʾ��
*/

class person 
{
	private int age;

	{
		System.out.print("���˵ĳ�ʼ���䣺");	
	}

	person(int age)
	{
		this.age = age;
	}

	public boolean compare(person p)
	{
		return this.age==p.age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public int getAge()
	{
		return this.age;
	}
}

class tyy
{
	public static void main(String[] args)
	{
		person p1 = new person(20);
		//System.out.println(p1.setAge(25));	//setAgeû�з���ֵ���ʸ���䱨����
		System.out.println(p1.getAge());

		p1.setAge(25);
		System.out.println("�޸ĺ�����䣺"+p1.getAge());

		person p2 = new person(25);
		System.out.println(p2.getAge());
		//System.out.println(p2.age);		//age��˽��(private)������ֱ�ӷ��ʣ�����䱨����

		boolean b = p1.compare(p2);
		System.out.println("�Ƿ���ͬ����"+b);
	}
}