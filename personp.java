class person
{
	private int age = 10;
	private String name;

	{
		System.out.println("��������");
	}
	person()
	{
		System.out.println("name="+name+":::age="+age);
	}
	person(String name)
	{
		this.name = name;
		System.out.println("name="+name+":::age="+age);
	}
	person(String name,int age)
	{
		this.name = name;
		this.age = age;
		System.out.println("name="+name+" and age="+age);
	}
	static 
	{
		System.out.println("��̬�����");
	}
}

class personp
{
	public static void main(String[] args) 
	{
		person p = new person("zc",18);	
		person p2 = new person("gg");	
	}
}

/*
person p = new person("zc",18);	

��仰������ʲô���飿
1.��Ϊnew�õ���person.class�����Ի����ҵ�person.class�ļ������ص��ڴ��С�
2.ִ�и����е�static����飬����еĻ�����person.class����г�ʼ����
3.�ڶ��ڴ��п��ٿռ䣬�����ڴ��ַ��
4.�ڶ��ڴ��н���������������ԣ�������Ĭ�ϳ�ʼ����
5.�����Խ�����ʾ��ʼ����
6.�Զ�����й��������ʼ����
7.�Զ�����ж�Ӧ�Ĺ��캯����ʼ����
8.���ڴ��ַ����ջ�ڴ��е�p������

*/