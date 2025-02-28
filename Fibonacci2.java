class Fibonacci2 
{
	public static void main(String[] args) 
	{
		int no = 5;
			int n1 = 0;
			int n2=1;
			int	n3 = 0;
		for (int i=0;i<=no ;i++ )
			
		{
			n3= n1+n2;
			n1= n2;
			n2=n3;
			
			if(n1%2!=0);	
			{		
				
				System.out.println(n1);
			}
		}
	}
}
