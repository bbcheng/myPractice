class car
{
	String color = "��ɫ";			//����Ϊ���ԣ���������Ϊ���߷�����
	int num = 4;
	void show()
	{
		System.out.println("color= "+color+" and "+" num= "+num);
	}
	
}

class cardemo2
{
	public static void main(String[] args)
	{	//new����ʵ��									
		//new car().num = 5;		//��������
		//���õ�����
		//new car().color =  "��ɫ";//��������ֻ�ܵ���һ��
									//���Է�������һ��ʱ������ʹ��
									//��һ��������ж����Ա���ã�������������������֡�
		new car().show();//���÷���������//����ԭ�������ԡ�
		
		car c = new car();
		showcar(c);

		showcar(new car());
	}

	//���Խ�����������Ϊʵ�ʲ������д��ݡ�

	public static void showcar(car a)
	{
		a.color =  "��ɫ";
		a.num = 3;
		a.show();
	}
}
