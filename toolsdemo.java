class  toolsdemo
{
	public static void main(String[] args) 
	{
		int[] arr = {5,8,2,7,1,10,11,9,6};

	/*	
		tools p = new tools();

		int max = p.getmax(arr);
		System.out.println("max="+max);

		int min = p.getmin(arr);
		System.out.println("min="+min);

		p.printf(arr);
		p.sort(arr);
		p.printf(arr);
	*/
		
		int max = tools.getmax(arr);
		System.out.println("max="+max);

		int min = tools.getmin(arr);
		System.out.println("min="+min);

		tools.printf(arr);
		tools.bubble(arr);
		//tools.sort(arr);
		tools.printf(arr);
	}
}
