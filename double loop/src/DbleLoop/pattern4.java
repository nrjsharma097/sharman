package DbleLoop;

public class pattern4 
{
	public static void main(String[] args) 
	{
		int i, a=1, j;
		
		for(i=a; i<5; i++)
		{
			for(j=1;j<i; j++)
			{
				System.out.print(a +" ");
				a++;
			}
		
			System.out.println(a);
			a++;
		}
		
	}

}
