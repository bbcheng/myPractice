/*
���ģʽ�����ĳһ����������֮��Ч�ķ�����
Java��23�����ģʽ��
�������ģʽ�����һ�������ڴ���ֻ����һ������

��Ҫ��֤����Ψһ��
1.Ϊ�˱�������������ཨ����������Ƚ�ֹ�����������������
2.��Ϊ��������������Է��ʸ������ֻ���ڱ����У��Զ���һ������
3.Ϊ�˷�������������Զ������ķ��ʣ����Զ����ṩһЩ���ʷ�ʽ��

��������ô�ô������֣�
1.�����캯��˽�л���
2.�����д���һ���������
3.�ṩһ���������Ի�ȡ���ö���


�����������ô��������ô������
����Ҫ��������Ķ���֤���ڴ���Ψһʱ���ͽ������������ϼ��ɡ�

private single(){}

	private static single s = new single();

	public static single getsingle()
	{
		return s;
	}
*/

class single
{
	private  int age;

	public void setage(int age)
	{
		this.age = age;
	}

	public int getage()
	{
		return age;
	}

	private single(){}

	private static single s = new single();

	public static single getsingle()
	{
		return s;
	}

}

class  singledemo
{
	public static void main(String[] args) 
	{
		single s = single.getsingle();
		single s1 = single.getsingle();
		s.setage(18);
		System.out.println(s1.getage());
	}
}
