/*
��װ�����ض�������Ժ�ʵ��ϸ�ڣ�
�������ṩ�������ʷ�ʽ��
ԭ�򣺽�����Ҫ�����ṩ�����ݶ���������
	  �����Զ����أ��ṩ��������������ʡ�
*/

/*
private��˽�У�Ȩ�����η����������������еĳ�Ա����Ա��������Ա������
˽�к�ֻ�ڱ�������Ч��
˽�л��Ժ������⼴ʹ�����˶���Ҳ����ֱ�ӷ��ʡ�
*/

/*
˽���Ƿ�װ��һ�ֱ�����ʽ�����߲�ͬ��
*/

class person 
{
	private int age;		//˽�л�age

	void speak()
	{
		System.out.println("age = "+age);
	}

	public void setAge(int a)	//age����ֱ�ӷ��ʣ�ͨ��һ������������
	{
		if(a>=0 && a<120)
		{	
			age = a;			//a��������age��
			speak();
		}
		else
			System.out.println("age ="+a+"���䲻�Ϸ�");
	}

	public int getAge(int a)
	{
	//	age = a;
		return a;
	}
}

class persondemo
{
	public static void main(String[] args)
	{
		person p = new person();
	//	p.age = 18;			//age��private��˽�У����޷�ֱ�ӷ��ʡ�
		
		p.setAge(18);		//ͨ�����ʹ�����������ӷ���age��
	//	p.speak();			//18��������е�age��person���е�age���䡣

		p.setAge(-5);	

	//	p.getAge(-5);		//����ӡ��
	//	p.speak();
	//	System.out.println("age = "+p.getAge(-5));
	}
}