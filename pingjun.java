class pingjun 
{
	public static void main(String[] args) 
	{
		double s=0;
		for(int i=1;i<=10;i++)
		{
			double c = Math.pow(1.03,i);
			double l=541*c;
			System.out.println("l   "+l);
			
			s=s+l;
			System.out.println("s   "+s);
			double p = s/i;
			System.out.println("p   "+p);
		}
	}
}
