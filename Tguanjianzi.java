/*
this�ؼ��֣����������ں���������������á�
��˵���ĸ������ڵ���this���ڵĺ�����this�ʹ����ĸ�����

this��Ӧ�ã����������й���ʱ���ú����ڲ�Ҫ�õ����øú���
�Ķ���ʱ����ʱ��this����ʾ�������
�������๦���ڲ�ʹ���˱�����󣬶���this��ʾ��

this�ڹ��캯������ã�this������ڹ��캯��֮����л�����á�
this���ֻ�ܶ����ڹ��캯���ĵ�һ�У���Ϊ��ʼ��Ҫ��ִ�С�
*/
class person
{
	private String name;
	private int age;
	
	{
		System.out.println("��������");
		cry();
	}

	public void cry()
	{
		System.out.println("cry..........");
	}

	person()
	{
		System.out.println("name = "+name+",,,aeg = "+age);
	}

	person(String name)
	{
		this.name = name;
		System.out.println("name = "+name+",,,aeg = "+age);
	}

	public void setName(String name)
	{
		this.name = name;			//this �ؼ��֣���ʾ�������
	}

	public String getName()
	{
		return name;
	}
}

class Tguanjianzi 
{
	public static void main(String[] args) 
	{
		person p1 = new person();
		p1.setName("wuliwei");
		System.out.println("����Ϊ��"+p1.getName());

		//person p2 = new person("�ų�");
		//p2.setName("bingbing");
		//System.out.println(p2.getName());
		
	}
}
